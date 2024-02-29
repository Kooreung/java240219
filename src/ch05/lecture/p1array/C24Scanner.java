package ch05.lecture.p1array;

import java.util.Scanner;

public class C24Scanner {
    public static void main(String[] args) {
        String str = """
                my age 33
                your age 44
                """;

        Scanner scanner = new Scanner(str);
        String t1 = scanner.next();
        String t2 = scanner.next();
        int t3 = scanner.nextInt();

        System.out.println("t3 = " + t3);

        String line1 = scanner.nextLine();
        String line2 = scanner.nextLine();

        System.out.println("line1 = " + line1);
        System.out.println("line2 = " + line2);

        // scanner 는 토큰 별로 읽어가는 기능을 한다.
        // 한 토큰 읽고 커서 이동, 한 토큰 읽고 커서 이동을 반복한다.
        // 위 과정 중 line1은 마지막 커서에서 다음 라인으로 넘어가기 전에 빈 string 을 리턴한다.

    }
}
