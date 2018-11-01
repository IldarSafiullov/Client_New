import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;
import io.Writer;
import io.Reader;


public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(), 8888);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String messageIn, messageOut;
        while (true){
            messageIn = new Reader(socket).readMessage();
            System.out.println("Message from server: " + messageIn);
            while (true){
                System.out.println("Message to server: ");
                messageOut = br.readLine();
                new Writer(socket).writeMessage(messageOut);
            }
        }
    }
}
