package ch17.sec03;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPipeLineExample {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student("홍길동",10),
                new Student("신용권",20),
                new Student("유미선",30)
        );

        // 방법1
        Stream<Student> studentStream = list.stream();
        IntStream scoreStream = studentStream.mapToInt(student -> student.getScore());
        double avg = scoreStream.average().getAsDouble();

        // 방법2
        double avg2 = list.stream()
                .mapToInt(student -> student.getScore())
                .average()
                .getAsDouble();

        // 방법 3 고전적

        double sum = 0;
        for (Student student : list) {
            sum += student.getScore();
        }
        double avg3 = sum / list.size();

        System.out.println("평균점수 = " + avg);
        System.out.println("평균점수 = " + avg2);
        System.out.println("평균점수 = " + avg3);

    }
}
