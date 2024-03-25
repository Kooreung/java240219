package ch11.lecture.p1exception;

import java.util.List;

public class C13MultiCatch {
    public static void main(String[] args) {
        try {
            Class.forName("java.lang.String"); // ClassNotFoundException
            List.of().get(0); // IndexOutOfBoundsException
            Integer.parseInt("two"); // NumberFormatException
        } catch (ClassNotFoundException e) {
            System.out.println("예외처리코드1");
        } catch (RuntimeException e) {
            System.out.println("예외처리코드2");
        } /* catch (IndexOutOfBoundsException | NumberFormatException e) {
            System.out.println("예외처리코드2");
        } */
    }
}
