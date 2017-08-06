package youtubesonos.youtube;

import org.mortbay.jetty.Request;
import org.mortbay.jetty.handler.AbstractHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class YouTubeAuthReceiverHandler extends AbstractHandler {

    private YouTubeAuthReceiver authReceiver;

    public YouTubeAuthReceiverHandler(YouTubeAuthReceiver authReceiver) {
        super();
        this.authReceiver = authReceiver;
    }

    @Override
    public void handle(String target, HttpServletRequest request, HttpServletResponse response, int dispatch) throws IOException, ServletException {
        if (target.equals(authReceiver.getPath())) {
            String linkCode = request.getParameter("state");

            if (authReceiver.pendingLinkCodeExists(linkCode)) {
                String code = request.getParameter("code");
                String error = request.getParameter("error");

                if ((code != null && !code.isEmpty()) && (error == null || error.isEmpty())) {
                    createSuccessResponse(response);
                    response.flushBuffer();
                    ((Request) request).setHandled(true);
                    authReceiver.onAuthReceived(linkCode, code);
                    return;
                }
            }

            createFailureResponse(response);
            response.flushBuffer();
            ((Request) request).setHandled(true);
            return;
        }

        createEmptyResponse(response);
        response.flushBuffer();
        ((Request) request).setHandled(true);
    }

    public void createSuccessResponse(HttpServletResponse response) throws IOException {
        response.setStatus(HttpServletResponse.SC_OK);
        response.setContentType("text/html");

        PrintWriter doc = response.getWriter();
        doc.println("<!DOCTYPE html><html><head><title>Authorize Sonos Access To Youtube</title></head><body>Sonos now has access to your YouTube account<br>You can close this page and return to Sonos.</body></html>");
        doc.flush();
    }

    public void createFailureResponse(HttpServletResponse response) throws IOException {
        response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
        response.setContentType("text/html");

        PrintWriter doc = response.getWriter();
        doc.println("<!DOCTYPE html><html><head><title>Authorize Sonos Access To Youtube</title></head><body>Something went wrong while authorizing Sonos to access your YouTube account.<br> Please try again later.</body></html>");
        doc.flush();
    }

    public void createEmptyResponse(HttpServletResponse response) throws IOException {
        response.setStatus(HttpServletResponse.SC_OK);
        response.setContentType("text/html");

        PrintWriter doc = response.getWriter();
        doc.println("<!DOCTYPE html><html><head><title></title></head><body></body></html>");
        doc.flush();
    }

}
