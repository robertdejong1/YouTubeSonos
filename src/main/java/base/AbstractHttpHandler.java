package base;

import com.sun.net.httpserver.HttpHandler;

import java.util.HashMap;
import java.util.Map;

public abstract class AbstractHttpHandler implements HttpHandler {

    protected Map<String, String> queryToMap(String query){
        Map<String, String> result = new HashMap<>();
        if (query != null) {
            for (String param : query.split("&")) {
                String pair[] = param.split("=");
                if (pair.length>1) {
                    result.put(pair[0], pair[1]);
                }
                else {
                    result.put(pair[0], "");
                }
            }
        }
        return result;
    }

}
