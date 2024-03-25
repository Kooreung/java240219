package ch11.lecture.p1exception;

import java.util.List;

public class C02CheckedException {
    public static void main(String[] args) {
        List<String> list = List.of("a", "b");

        System.out.println("list = " + list.get(2));

        // Class.forName : ClassNotFountException 발생
        // Checked Exception
        // 예외 처리 코드가 있는지 컴파일러가 검사
        // = 예외 처리 코드가 꼭 있어야 함
        try {
            Class.forName("java.lang.String");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
