package ch19.lecture.p1network;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class C01Computer1 {
    public static void main(String[] args) throws IOException {
        // 서버 측 (연결을 기다리는 쪽)
        ServerSocket serverSocket = new ServerSocket(5555);
        // socket 생성
        Socket socket = serverSocket.accept();// 연결 요청을 기다림

        try (socket) {
            // 출력 스트림 데코레이팅 // 처음부터 writer 를 못 씀
            OutputStream os = socket.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(os);
            BufferedWriter bw = new BufferedWriter(osw);
            PrintWriter pw = new PrintWriter(bw);

            try (os; osw; bw; pw;){
                pw.println("hello world");
            }
        }
    }
}
