package ch18.lecture.p5filter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class C08Keyboard {
    public static void main(String[] args) throws IOException {
        InputStream keyboard = System.in;
        InputStreamReader isr = new InputStreamReader(keyboard);
        BufferedReader br = new BufferedReader(isr);

        String line;
        while (true) {
            System.out.println("입력>");
            line = br.readLine();

            if (line == null) {
                break;
            }

        }

        br.close();

        System.out.println("line = " + line);

    }
}
