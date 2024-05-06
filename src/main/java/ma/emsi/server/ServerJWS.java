package ma.emsi.server;

import jakarta.xml.ws.Endpoint;
import ma.emsi.webservice.BanqueService;

public class ServerJWS {
    public static void main(String[] args) {
        Endpoint.publish("http://0.0.0.0:9090/",new BanqueService());
    }
}
