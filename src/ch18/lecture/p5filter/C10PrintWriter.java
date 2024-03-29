package ch18.lecture.p5filter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class C10PrintWriter {
    public static void main(String[] args) throws IOException {
        String file = "temp/output10.txt";
        FileWriter fw = new FileWriter(file);
        PrintWriter pw = new PrintWriter(fw);

        pw.print("hello world");
        pw.print("😊");
        pw.println();
        pw.println("점심");
        pw.println("메뉴");
        pw.printf("%s 을 먹을까? %s 를 먹을까?", "라면", "돈까스");

        pw.close();
    }
}
