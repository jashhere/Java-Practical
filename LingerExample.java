import java.io.IOException;
import java.net.Socket;

public class LingerExample {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 5000);
        
        // Enable SO_LINGER with a timeout of 5 seconds
        socket.setSoLinger(true, 5); 
        
        System.out.println("SO_LINGER set to 5 seconds. Closing socket...");

        // Close the socket (will linger for 5 seconds to send remaining data)
        socket.close();
    }
}
