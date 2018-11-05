package org.client.authorization;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.net.Socket;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String name;
    private Socket socket;


//    public void setName() {
//        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
//        System.out.println("Enter the name: ");
//        try {
//            name = buf.readLine();
//            new Writer(socket).writeMessage(name);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
}
