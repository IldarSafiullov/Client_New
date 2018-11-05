package org.client.io;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;


public class Reader implements Runnable{

    public Reader() {
    }

    public String readMessage() throws IOException {
        Socket socket = UserInfo.getInstance().getSocket();
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
