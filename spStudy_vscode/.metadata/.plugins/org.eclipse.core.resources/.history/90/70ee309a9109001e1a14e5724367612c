package Socket;

import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.Buffer;
import java.sql.Date;
import java.text.SimpleDateFormat;

public class ServerFile {
    public static void main(String[] args) throws IOException {
        ServerSocket listener = new ServerSocket(9090);

        Socket socket = listener.accept();
        DataInputStream is = new DataInputStream(socket.getInputStream());

        try {
            String fileName = null;
            // fileName 수신

            while ((fileName = is.readUTF()) != null) {
                // fileSize 수신
                int fileSize = is.readInt();
                FileOutputStream fw = new FileOutputStream(fileName);

                int length;
                while (fileSize > 0) {
                    // Buffer buffer = new Buffer(fileSize);
                    // fileContent 수신
                    // length = is.read(buffer,0,Math.min(fileSize, buffer.length)
                }

            }
        } finally {

        }
    }
}
