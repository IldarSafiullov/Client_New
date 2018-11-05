package authorization;


import io.Writer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class User {
    private String name;
    private final Socket socket;

    public User(Socket socket) {
        this.socket = socket;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the name: ");
        try {
            name = buf.readLine();
            new Writer(socket).writeMessage(name);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
