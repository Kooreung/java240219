package ch04.lecture.p2switch;

import java.util.Scanner;

public class C08SwitchExpression {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("지역을 검색하세요 : ");
        String city = String.format(scanner.nextLine());

        String area = switch (city) {
            case "서울", "도쿄", "방콕" -> "아시아";
            case "런던", "파리" -> "유럽";
            default -> "기타";
        };

        System.out.println(city + "는 " + area + "에 있습니다.");

    }
}
