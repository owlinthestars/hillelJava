package socketsConsoleChat;

/**
 * Created by Oleg on 29.11.2015.
 */
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MultithreadServer {
    public static void main(String[] args) throws IOException {
        new MultithreadServer().start();
    }

    private void start() throws IOException {
        ServerSocket serverSocket = new ServerSocket(3111);
        while (true) {
            Socket socket = serverSocket.accept();
            Thread thread = new Thread(new SocketThread(socket));
            thread.start();
        }
    }
}