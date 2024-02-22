package c02.lecture.p02type;

import static java.util.FormatProcessor.FMT;

public class C29formatString {
    public static void main(String[] args) {
        String name = "홍길동";
        String job = "도적";
        System.out.printf("%6d | %-10s | %10s%n", 1, name, job);

        System.out.println(STR."\{1} | \{name} | \{job}");

        // FMT Template Processor 21버전부터
        System.out.println(FMT."%6d\{1} | %-10s\{name} | %10s\{job}");

        int v1 = 1;
        System.out.println("v1 = " + v1);
        if (true) {
            int v2 = 2;
            if (true) {
                int v3 = 3;
                System.out.println("v1 = " + v1);
                System.out.println("v2 = " + v2);
                System.out.println("v3 = " + v3);
            }
        }
    }
}
