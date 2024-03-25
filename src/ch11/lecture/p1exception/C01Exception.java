package ch11.lecture.p1exception;

import java.util.List;

public class C01Exception {
    public static void main(String[] args) {
        // Exception : 예외가 발생했을 때 나오는 객체 타입

        List<String> list = List.of("css", "html");
        System.out.println(list.get(2));
    }
}
