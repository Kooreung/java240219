package ch19.lecture.p1network;

import java.io.*;
import java.net.Socket;

public class C03Computer2 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("172.30.1.73", 9000);

        try (socket) {
            BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());

            String file = "temp/download.png";
            FileOutputStream fos = new FileOutputStream(file);
            BufferedOutputStream bos = new BufferedOutputStream(fos);

            try (bis; fos; bos) {
                byte[] data = new byte[512];
                int len = 0;

                while ((len = bis.read(data)) != -1) {
                    bos.write(data,0, len);
                }
            }
            bos.flush();
        }

    }
}
