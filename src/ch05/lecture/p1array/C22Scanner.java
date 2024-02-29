package ch05.lecture.p1array;

import java.util.Scanner;

public class C22Scanner {
    public static void main(String[] args) {
        String str = "your name is lee kang in.";
        Scanner scanner = new Scanner(str);

        if (scanner.hasNext()) {
            String token1 = scanner.next();
            System.out.println("token1 = " + token1);
        } // 개별 토큰으로 추출

        while (scanner.hasNext()) {
            String token = scanner.next();
            System.out.println("token = " + token);
        } // 반복문으로 토큰이 나오도록 설정
    }
}
