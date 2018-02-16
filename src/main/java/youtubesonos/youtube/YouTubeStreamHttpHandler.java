package youtubesonos.youtube;

import base.AbstractHttpHandler;
import com.sun.net.httpserver.HttpExchange;
import youtubesonos.S;

import java.io.*;
import java.util.Map;

public class YouTubeStreamHttpHandler extends AbstractHttpHandler {

    @Override
    public void handle(HttpExchange httpExchange) throws IOException {
        try {
            Map<String, String> params = queryToMap(httpExchange.getRequestURI().getQuery());
            String id = params.getOrDefault("id", "");
            if (!id.isEmpty()) {
                sendResponseHeaders(httpExchange);
                if (httpExchange.getRequestMethod().equals("GET")) {
                    if (writeResponseBody(httpExchange, id)) {
                        httpExchange.getResponseBody().close();
                    }
                }
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void sendResponseHeaders(HttpExchange httpExchange) throws IOException {
        httpExchange.getResponseHeaders().add("Content-Type", "audio/mp3");
        httpExchange.getResponseHeaders().add("Connection", "close");
        httpExchange.sendResponseHeaders(200, httpExchange.getRequestMethod().equals("HEAD") ? -1 : 0);
    }

    private boolean writeResponseBody(HttpExchange httpExchange, String videoId) throws IOException {
        InputStream audioInputStream = getAudioInputStream(videoId);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(audioInputStream);
        OutputStream audioOutputStream = audioInputStream instanceof FileInputStream ? null : getAudioOutputStream(videoId);

        byte[] buffer = new byte[512];
        int bytesRead;
        boolean writeSuccessful = true;
        while ((bytesRead = bufferedInputStream.read(buffer)) != -1) {
            byte[] bytesToWrite = cropBytesIfNeeded(buffer, bytesRead);
            if (writeSuccessful) {
                writeSuccessful = writeBytesToStream(bytesToWrite, httpExchange.getResponseBody());
            }
            else if (audioOutputStream == null) {
                return false;
            }
            writeBytesToStream(bytesToWrite, audioOutputStream);
        }
        return true;
    }

    private InputStream getAudioInputStream(String videoId) throws IOException {
        File localFile = getLocalFile(videoId);
        if (localFile.exists()) {
            return new FileInputStream(localFile);
        }
        else {
            return createYoutubeDlProcess(videoId).getInputStream();
        }
    }

    private File getLocalFile(String videoId) {
        return new File(String.format("%s/%s.mp3", S.getResources().getString(S.MEDIA_PATH), videoId));
    }

    private Process createYoutubeDlProcess(String videoId) throws IOException {
        String[] cmd = {
            "/bin/sh",
            "-c",
            String.format("youtube-dl -f bestaudio '%s' -o - | ffmpeg -i pipe:0 -vn -f mp3 -", videoId)
        };
        return Runtime.getRuntime().exec(cmd);
    }

    private byte[] cropBytesIfNeeded(byte[] bytes, int bytesRead) {
        if (bytesRead < bytes.length) {
            byte[] result = new byte[bytesRead];
            System.arraycopy(bytes, 0, result, 0, bytesRead);
            return result;
        }
        else {
            return bytes;
        }
    }

    private boolean writeBytesToStream(byte[] bytes, OutputStream stream) {
        if (stream == null)
            return false;

        try {
            stream.write(bytes);
        }
        catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    private OutputStream getAudioOutputStream(String videoId) throws IOException {
        File file = getLocalFile(videoId);
        file.getParentFile().mkdirs();
        if (file.createNewFile()) {
            return new FileOutputStream(file);
        }
        return null;
    }
}
