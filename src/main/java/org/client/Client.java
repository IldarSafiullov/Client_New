package org.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;

import static java.lang.System.in;


public class Client {

    public static String clientName;

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(), 8888);
        BufferedReader bf = new BufferedReader(new InputStreamReader(in));
        System.out.println("Enter the name: ");
        clientName = bf.readLine();
        new Thread(new Reader(socket)).start();

        }
    }
