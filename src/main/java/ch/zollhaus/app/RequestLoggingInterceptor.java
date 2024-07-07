package ch.zollhaus.app;

import jakarta.ws.rs.client.ClientRequestContext;
import jakarta.ws.rs.client.ClientRequestFilter;
import jakarta.ws.rs.ext.Provider;
import java.io.IOException;
import java.util.logging.Logger;

@Provider
public class RequestLoggingInterceptor implements ClientRequestFilter {

    private static final Logger LOGGER = Logger.getLogger(RequestLoggingInterceptor.class.getName());

    @Override
    public void filter(ClientRequestContext requestContext) throws IOException {
        LOGGER.info("Request Method: " + requestContext.getMethod());
        LOGGER.info("Request URI: " + requestContext.getUri());
        requestContext.getHeaders().forEach((k, v) -> LOGGER.info("Header: " + k + " = " + v));
    }
}