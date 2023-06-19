package Socket;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Date;
import java.text.SimpleDateFormat;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket listener = new ServerSocket(9090);
        try {
            Socket socket = listener.accept();
            try {
                PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

                SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
                Date date = new Date(System.currentTimeMillis());
                out.println(formatter.format(date));
            } finally {
                socket.close();
            }
        } finally {
            listener.close();
        }
    }
}
