import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import io.Writer;
import io.Reader;


public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(), 8888);
        new Thread(new Reader(socket)).start();
        new Thread(new Writer(socket)).start();
        }
    }
