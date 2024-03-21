package ch17.lecture.p1stream;

import java.util.Comparator;
import java.util.List;

public class C09Sorted {
    public static void main(String[] args) {
        // sorted : 정렬된 stream Return
        List<Integer> list = List.of(9, 3, 10, 6, 5, 7, 1, 3, 9, 10);

        list.stream()
                .sorted()
                .forEach(System.out::println);

        System.out.println();

        list.stream()
                .distinct()
                .sorted()
                .forEach(System.out::println);

        System.out.println();

        list.stream()
                .sorted(Comparator.reverseOrder())
                .distinct()
                .forEach(System.out::println);

        System.out.println();

        List<String> list1 = List.of("java", "css", "react", "html", "vue");
        list1.stream()
                .sorted()
                .forEach(System.out::println);

        System.out.println();

        list1.stream()
                .map(e -> e.length())
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }
}
