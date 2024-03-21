package ch17.lecture.p1stream;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class C02Terminal {
    public static void main(String[] args) {
        // 최종연산 Method
        // forEach, collect, count, reduce
        // anyMatch, allMatch
        // max, min

        List<Integer> list = List.of(9, 8, 0, 10, 1, 90);

        // stream.forEach();
        Stream<Integer> stream = list.stream(); // Interface 의 특징
        stream.forEach(e -> System.out.println(e));
            // 위 두 줄과 같은 결과
        list.stream().forEach(System.out::println);

        // stream.count();
        long count = list.stream().count();
        System.out.println("count = " + count);

        // stream.max();
        Optional<Integer> max = list.stream()
                .max((a, b) -> a - b); // comparator
        System.out.println("max = " + max);

        // stream.min();
        Optional<Integer> min = list.stream().
                min((a, b) -> a - b); // comparator
        System.out.println("min = " + min);
    }
}
