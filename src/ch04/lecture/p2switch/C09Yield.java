package ch04.lecture.p2switch;

import java.util.Scanner;

public class C09Yield {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("지역을 검색하세요 : ");
        String city = String.format(scanner.nextLine());

        String area = switch (city) {
            case "서울", "도쿄", "방콕" -> "아시아";
            case "런던", "파리" -> {
                yield "유럽";
                //yield 가 있으면 마지막 코드이다. 일종의 break 같은 느낌?
            }
            default -> "기타";
        };

        int length = 5;
        String shape = "원";

        double result = switch (shape) {
            case "원" -> {
                double calc = 3.14 * length * length;
                yield calc;
            }
            case "정사각형" -> length * length;
            default -> 0.0;
        };

        System.out.println(city + "는 " + area + "에 있습니다.");
    }
}
