package org.client.io;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;


public class Reader implements Runnable{
    private final Socket socket;

    public Reader(Socket socket) {
        this.socket = socket;
    }

    public String readMessage() throws IOException {
        DataInputStream din = new DataInputStream(socket.getInputStream());
        return din.readUTF();
    }

    public void run() {
        while (true){
            try {
                System.out.println("Message from server: " + readMessage());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}