package ch05.lecture.p1array;

import java.util.Scanner;

public class C23Scanner {
    public static void main(String[] args) {
        String str = "my age is 33 or 44";
        Scanner scanner = new Scanner(str);

        System.out.println(scanner.next());
        System.out.println(scanner.next());
        System.out.println(scanner.next());
        System.out.println(scanner.nextInt());
        System.out.println(scanner.next());

        int number = scanner.nextInt();
        System.out.println("number = " + number);


    }
}
