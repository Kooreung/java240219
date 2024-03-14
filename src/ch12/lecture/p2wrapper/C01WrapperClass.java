package ch12.lecture.p2wrapper;

import ch09.exercise.p7.Chatting;

import java.io.CharArrayWriter;

public class C01WrapperClass {
    public static void main(String[] args) {
        // 기본 타입 8개를 감싼 참조 타입 (클래스) 8개

        int a = 3;

        Integer c = Integer.valueOf(a); // 기존 방식 // Boxing
        Integer b = a; // 원래는 안되던 방식 // auto Boxing

        long d = 5;
        Long e = d; // auto boxing

        double f = 3.14;
        Double g = f; // auto boxing

        char h = '가';
        Character i = h; // auto boxing

        boolean j = true;
        Boolean k = j; // auto boxing



    }
}
