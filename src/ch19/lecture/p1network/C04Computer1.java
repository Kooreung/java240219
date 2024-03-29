package ch19.lecture.p1network;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class C04Computer1 {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(9000);

        while (true) {
            Socket socket = serverSocket.accept();

            Thread t = new Thread(() -> {
                try (socket) {
                    OutputStream is = socket.getOutputStream();
                    BufferedOutputStream bos = new BufferedOutputStream(is);

                    FileInputStream fis = new FileInputStream("temp/dog3.png");
                    BufferedInputStream bis = new BufferedInputStream(fis);

                    try (bos; fis; bis) {
                        byte[] data = new byte[1024];
                        int len = 0;
                        while ((len = bis.read(data)) != -1) {
                            bos.write(data, 0, len);
                        }
                        bos.flush();
                    } catch (Exception e) {
                        System.err.println("오류 : " + socket.getRemoteSocketAddress());
                    }
                    System.out.println("완료 : " + socket.getRemoteSocketAddress());
                } catch (Exception e) {
                    System.err.println("오류 : " + socket.getRemoteSocketAddress());
                }
            });
        }
    }
}
