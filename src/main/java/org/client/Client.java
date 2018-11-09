package org.client;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.client.io.UserInfo;
import org.client.io.Reader;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;


public class Client extends javafx.application.Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("ui/window.fxml"));
        primaryStage.setTitle("Привет Мир");
        primaryStage.setScene(new Scene(root, 700, 400));
        primaryStage.show();
    }

    public static void main(String[] args) throws IOException {
        launch(args);

        Socket socket = new Socket(InetAddress.getLocalHost(), 8888);
        UserInfo.getInstance().setSocket(socket);

        new Thread(new Reader()).start();
        new Thread(new Application()).start();
    }
}
