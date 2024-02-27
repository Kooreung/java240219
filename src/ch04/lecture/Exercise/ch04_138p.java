package ch04.lecture.Exercise;

import java.util.Scanner;

public class ch04_138p {
    public static void main(String[] args) {

        // 138p 2번 문항
        String grade = "B";
        int score1 = 0;
        int result;

        switch (grade) {
            case "A" -> score1 = 100;
            case "B" -> {result = 100 - 20;
            score1 = result;}
            default -> score1 = 60;
        }

        // 138p 3번 문항
        for (int i = 3; i <= 100; i+=3) {
            System.out.println("i = " + i);
        }

        // 138p 5번 문항
        for (int x = 0; x <= 10; x++) {
            for (int y = 0; y <= 10; y++) {
                if ((4 * x) + (5 * y) == 60) {
                    System.out.println(STR."(\{x},\{y})");
                }
            }
        }

        // 138p 7번 문항
        Scanner scanner = new Scanner(System.in);
        String str1 = "";
        int money = 0;

        while (true) {
            System.out.println("------------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("------------------------------");
            System.out.print("선택> ");

            str1 = scanner.nextLine();

            if (str1.equals("1")) {
                System.out.print("예금액> ");
                String depositString = scanner.nextLine();
                int deposit = Integer.parseInt(depositString);
                money += deposit;
            } else if (str1.equals("2")) {
                System.out.print("출금액> ");
                String withdrawalString = scanner.nextLine();
                int withrawal = Integer.parseInt(withdrawalString);
                money -= withrawal;
            } else if (str1.equals("3")) {
                System.out.println(STR."잔고> \{money}");
            } else if (str1.equals("4")) {
                break;
            } else {
                System.out.println("다시 입력하세요.");
            }
        }

        System.out.println("프로그램 종료");

    }

}
