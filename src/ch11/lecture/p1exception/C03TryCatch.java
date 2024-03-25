package ch11.lecture.p1exception;

import java.util.List;

public class C03TryCatch {
    public static void main(String[] args) {
        List<String> list = List.of("a", "b");

        String s1 = list.get(0);

        try {
            System.out.println("exception 발생 전 실행되는 코드");
            String s2 = list.get(2);
            System.out.println("exception 발생하지 않으면 실행되는 코드");
        } catch (IndexOutOfBoundsException e) {
            // catch : 발생한 exception 을 잡고 처리하는 코드
            System.out.println("exception 발생하면 실행되는 코드");
        }
        System.out.println("나머지 코드들");
    }
}
