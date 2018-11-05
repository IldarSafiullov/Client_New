package io;


import authorization.User;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.Scanner;

public class Writer implements Runnable{
    private final Socket socket;

    public Writer(Socket socket) {
        this.socket = socket;
    }

    public void writeMessage(String message) throws IOException {
        DataOutputStream dout = new DataOutputStream(socket.getOutputStream());
        dout.writeUTF(message);
    }



    public void run() {
        new User(socket).setName();
        while (true) {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Message to server: ");
            try {
                String messageOut = br.readLine();
                writeMessage(messageOut);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
