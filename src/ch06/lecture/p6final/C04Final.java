package ch06.lecture.p6final;

public class C04Final {
    public static void main(String[] args) {
        C04MyClass.i = 30;
//        C04MyClass.J;
//        C04MyClass.k = 200; // x
    }
}

// final static field
// final static field 작명 관습
    // UPPER_SNAKE_CASE
class C04MyClass {
    static int i;

    final static int J;
    final static int k = 100;

    static {
        J = 200;
    }

    static final int AMOUNT_OF_MONEY = 300;
}