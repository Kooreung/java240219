package ch11.lecture.p1exception;

import java.util.List;

public class C07Finally {
    public static void main(String[] args) {
        try {
            List.of("A, B").get(2); // exception
            List.of("a", "b").get(1); // exception 발생 안함

            return;
        } finally {
            System.out.println("암튼 실행");
        }
        // System.out.println("프로그램 종료");
    }
}
