package ch11.lecture.p1exception;

import java.util.List;

public class C06Finally {
    public static void main(String[] args) {
        List<String> list = List.of("a", "b");

        try {
            for (int i = 0; i <= list.size(); i++) {
                System.out.println(list.get(i));
            }
            System.out.println("모두 출력");
            System.out.println("트라이블럭 나머지 코드");
        } catch (IndexOutOfBoundsException e) {
            System.err.println("캐치 블럭 코드들");
        } finally {
            System.out.println("트라이블럭 나머지 코드");
        }

        System.out.println("프로그램 종료");
    }
}
