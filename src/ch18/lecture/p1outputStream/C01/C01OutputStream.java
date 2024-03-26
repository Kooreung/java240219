package ch18.lecture.p1outputStream.C01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class C01OutputStream {
    public static void main(String[] args) throws IOException {
        String fileName = "temp/output01.data";
        OutputStream os = new FileOutputStream(fileName);
        os.write(99);
        os.write(100);
        os.write(1000000000);
    }
}
