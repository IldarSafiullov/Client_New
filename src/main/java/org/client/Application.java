package org.client;

import org.client.io.UserInfo;
import org.client.io.Writer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

import static java.lang.System.in;

public class Application implements Runnable{


    public void run() {
        BufferedReader bf = new BufferedReader(new InputStreamReader(in));
        System.out.println("Enter the name: ");
        try {
            String clientName = bf.readLine();
            UserInfo.getInstance().setUserName(clientName);

            Map<String, Object> payload = new HashMap<>();
            payload.put("name", UserInfo.getInstance().getUserName());

            new Writer().writeMessage("SERVER", payload);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
