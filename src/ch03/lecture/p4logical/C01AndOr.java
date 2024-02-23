package ch03.lecture.p4logical;

public class C01AndOr {
    public static void main(String[] args) {
        int x = 6;
        int y = 3;

        boolean r1 = x < 10 && y > 1;
        boolean r2 = x == 5 || y == 5;

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
    }
}
