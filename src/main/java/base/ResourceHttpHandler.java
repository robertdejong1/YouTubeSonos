package base;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URLConnection;

public class ResourceHttpHandler implements HttpHandler {

    private String resourceName;
    private String resourceData;
    private String contentType;

    public ResourceHttpHandler(String resourceName) {
        this.resourceName = resourceName;

        try {
            initializeDataAndType();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void initializeDataAndType() throws IOException {
        StringBuilder result = new StringBuilder();
        InputStream inputStream = ResourceHttpHandler.class.getResourceAsStream(resourceName);
        contentType = URLConnection.guessContentTypeFromName(resourceName);
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        String line;

        while ((line = reader.readLine()) != null) {
            result.append(line).append("\n");
        }

        resourceData = result.toString();
    }

    @Override
    public void handle(HttpExchange httpExchange) throws IOException {
        httpExchange.getResponseHeaders().add("Content-Type", contentType);
        httpExchange.sendResponseHeaders(200, resourceData.length());
        httpExchange.getResponseBody().write(resourceData.getBytes());
        httpExchange.getResponseBody().close();
    }
}