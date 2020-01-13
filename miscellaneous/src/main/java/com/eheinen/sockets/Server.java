package com.eheinen.sockets;

import java.io.IOException;
import java.net.ServerSocket;

public class Server {

    private static final int PORT = 1234;

    private ServerSocket serverSocket;

    public void start() throws IOException {
        serverSocket = new ServerSocket(PORT);

        while (true) {
            new ClientHandler(serverSocket.accept()).start();
        }
    }

    public void stop() throws IOException {
        serverSocket.close();
    }
}
