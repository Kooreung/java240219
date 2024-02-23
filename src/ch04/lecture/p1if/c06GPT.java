package ch04.lecture.p1if;

import java.util.Random;
import java.util.Scanner;

public class c06GPT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("가위(1), 바위(2), 보(3): ");
        int user = Integer.parseInt(scanner.nextLine());
        int computer = random.nextInt(3) + 1;

        System.out.println("user = " + getName(user));
        System.out.println("computer = " + getName(computer));

        if (user == computer) {
            System.out.println("비겼습니다!");
        } else if ((user == 1 && computer == 3) || (user == 2 && computer == 1) || (user == 3 && computer == 2)) {
            System.out.println("당신이 이겼습니다!");
        } else {
            System.out.println("당신이 졌습니다!");
        }
    }
    static String getName(int choice) {
        switch (choice) {
            case 1:
                return "가위";
            case 2:
                return "바위";
            case 3:
                return "보";
            default:
                return "";
        }
    }


}