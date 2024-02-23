package ch04.lecture.p2switch;

import java.util.Scanner;

public class C05Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("지역을 검색하세요 : ");
        String city = String.format(scanner.nextLine());

        switch (city) {
            case "서울":
            case "인천":
                System.out.println("수도권");
                break;

            case "광주":
            case "전주":
                System.out.println("호남권");

            case "울산":
            case "부산":
                System.out.println("영남권");
        };


    }
}
