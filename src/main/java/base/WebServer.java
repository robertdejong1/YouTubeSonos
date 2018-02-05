package base;

import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import javax.xml.ws.Endpoint;
import java.io.IOException;
import java.net.InetSocketAddress;

public class WebServer {

    private HttpServer server;

    public WebServer(String hostname, int port) {
        try {
            server = HttpServer.create(new InetSocketAddress(hostname, port), 0);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void createContext(String path, HttpHandler handler) {
        server.createContext(path, handler);
    }

    public void publishEndpoint(String path, Endpoint endpoint) {
        endpoint.publish(server.createContext(path));
    }

    public void start() {
        server.start();
    }

}
