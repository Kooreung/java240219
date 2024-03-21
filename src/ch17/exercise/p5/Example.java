package ch17.exercise.p5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(
                "This is a java book",
                "Lambda Expressions",
                "Java8 supports lambda expressions"
        );

        String word = "java";
        List<String> javaWord = list.stream()
                .filter(e -> e.toLowerCase().contains(word))
                .collect(Collectors.toList());

        javaWord.forEach(System.out::println);
    }
}
