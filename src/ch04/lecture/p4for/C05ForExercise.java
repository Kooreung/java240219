package ch04.lecture.p4for;

public class C05ForExercise {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j<= i; j++) {
            System.out.print("*");
            }
        System.out.println();
        }

        System.out.println("-------------");

        for (int i = 0; i <= 5; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("-------------");

        for (int i = 0; i <= 5; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print("*");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("#");
            }
            System.out.println();
        }

        System.out.println("-------------");

        for (int i = 0; i <= 5; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("-------------");

        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 4; k >= i; k--) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("-------------");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j<= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println("-------------");

        for (int i = 1; i < 6; i++) {
            for (int j = 1; j<= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println("-------------");

        int k = 0;
        for (int i = 0; i < 5; ++i) {
            for (int j = 0; j <= i; ++j) {
                System.out.print(k%10);
                k++;
            }
            System.out.println();
        }

    }
}
