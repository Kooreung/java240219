package ch17.lecture.p1stream;

import java.util.List;

public class C01Stream {
    public static void main(String[] args) {
        // Stream API
        // Collection 의 Element 를 반복 처리하는 Method 제공
        // 이 Method 로 코드를 간결하게 작성 가능

        // Method 종류
        // 1. 중간 연산 (intermediate operation)
        //      Stream 객체 Return
        // 2. 최종 연산 (terminal operation)
        //      Stream 객체 Return 안함

        int sum = 0;
        List<Integer> list = List.of(10, 5, 9, 20, 7, 22, 33, 55, 66);
        for (Integer item : list) {
            if (item % 2 == 1) {
                sum += item;
            }
        }
        System.out.println("sum = " + sum);

        int sum1 = list.stream()
                .filter(a -> a % 2 == 1)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println(sum1);
    }
}
