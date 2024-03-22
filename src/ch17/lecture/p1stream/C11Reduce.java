package ch17.lecture.p1stream;

import java.util.List;

public class C11Reduce {
    public static void main(String[] args) {
        // reduce : reduction 연산 | 최종 연산

        List<String> list = List.of("java", "css", "spring", "html");

        // javacssspringhtml"
        String result1 = "";
        for (String s : list) {
            result1 += s;
        }
        System.out.println(result1);

        List<Integer> list1 = List.of(3, 6, 9, 10);
        int sum1 = 0;
        for (Integer i : list1) {
            sum1 += 1;
        }
        System.out.println(sum1);


    }
}
