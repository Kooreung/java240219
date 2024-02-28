package ch05.Exercise;

import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalDouble;

public class Exercise08Stream {
    public static void main(String[] args) {
        int[][] array = {{95,86}, {83,92,96}, {78,83,93,87,88}};

        double sum = Arrays.stream(array)
                .flatMapToInt(r -> Arrays.stream(r))
                .sum();

        double avg = Arrays.stream(array)
                .flatMapToInt(r -> Arrays.stream(r))
                .average()
                .getAsDouble();

        System.out.println(sum);
        System.out.println(avg);
    }
}
