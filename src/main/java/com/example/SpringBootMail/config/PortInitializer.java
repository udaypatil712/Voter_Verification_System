//package com.example.SpringBootMail.config;
//
//import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
//import org.springframework.boot.web.server.WebServerFactoryCustomizer;
//import org.springframework.stereotype.Component;
//
//import java.net.ServerSocket;
//
//@Component
//public class PortInitializer implements WebServerFactoryCustomizer<TomcatServletWebServerFactory> {
//
//    @Override
//    public void customize(TomcatServletWebServerFactory factory) {
//        int port = 5000; // default port
//        if (!isPortAvailable(port)) {
//            port = findAvailablePort();
//            System.out.println("Default port 5000 is busy, using available port: " + port);
//        }
//        factory.setPort(port);
//    }
//
//    private boolean isPortAvailable(int port) {
//        try (ServerSocket socket = new ServerSocket(port)) {
//            socket.setReuseAddress(true);
//            return true;
//        } catch (Exception ex) {
//            return false;
//        }
//    }
//
//    private int findAvailablePort() {
//        try (ServerSocket socket = new ServerSocket(0)) {
//            socket.setReuseAddress(true);
//            return socket.getLocalPort();
//        } catch (Exception ex) {
//            throw new RuntimeException("No available port found", ex);
//        }
//    }
//}
