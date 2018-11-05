package org.client;

import org.client.io.UserInfo;
import org.client.io.Reader;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;


public class Client {

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(), 8888);
        UserInfo.getInstance().setSocket(socket);

        new Thread(new Reader()).start();
        new Thread(new Application()).start();
        }
    }
