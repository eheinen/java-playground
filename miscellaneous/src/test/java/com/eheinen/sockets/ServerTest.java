package com.eheinen.sockets;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.ServerSocket;
import java.util.concurrent.Executors;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ServerTest {

    private static final String IP = "127.0.0.1";
    private static final int PORT = 1234;


    @Test
    public void should_establish_client_to_server_connection() throws IOException, InterruptedException {
        Executors.newSingleThreadExecutor().submit(() -> {
            try {
                new Server().start();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        Thread.sleep(500);

        Client client1 = new Client();
        client1.startConnection(IP, PORT);

        Client client2 = new Client();
        client2.startConnection(IP, PORT);

        String message1 = client1.sendMessage("Hi!");
        String message2 = client2.sendMessage("Hello!");

        assertEquals("Hi!", message1);
        assertEquals("Hello!", message2);

        client1.stopConnection();
        client2.stopConnection();

    }

}
