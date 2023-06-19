
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class App {
    static String rootPath = "./INPUT";

    public static void main(String[] args) {
        FileDirList(rootPath);

    }

    public static void FileDirList(String path) {
        File directory = new File(path);
        File[] fList = directory.listFiles();

        for (File file : fList) {
            if (file.isDirectory()) {
                FileDirList(file.getPath());
            } else {
                String partPath = path.substring(rootPath.length());

                System.out.println("." + partPath + "/" + file.getName() + " : " + file.length() + "bytes");

                if (file.length() > 3 * 1024) {
                    CopyFile(partPath, file.getName());
                }

            }
        }
    }

    public static void CopyFile(String partPath, String filename) {
        final int BUFFER_SIZE = 512;
        int readLen;

        try {
            File outFile = new File("./OUTPUT" + partPath);
            if (!outFile.exists()) {
                outFile.mkdirs();
            }

            InputStream inputStream = new FileInputStream("./INPUT" + partPath + "/" + filename);
            OutputStream outputStream = new FileOutputStream("./OUTPUT" + partPath + "/" + filename);

            byte[] buffer = new byte[BUFFER_SIZE];

            while ((readLen = inputStream.read(buffer)) != 1) {
                outputStream.write(buffer, 0, readLen);
            }

            inputStream.close();
            outputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
