package ch06.lecture.p2method;

public class C04Parameter {
    public static void main(String[] args) {
        C04Calculator cal = new C04Calculator();
        // 메소드 호출 시 파라미터에 값(매개값, 인수, argument) 를 줘야함
        cal.printSum(3,5);
        cal.printSum(9,13);
        cal.printSum(300,200);
        // 메소드 선언 시 들어가는 값이 parameter
        // 메소드 호출 시 기입하는 값이 argument

        cal.printDivide(3.14, 0.5);
        cal.printDivide(9.0, 3);
        cal.printDivide(10, 2);

    }

}

class C04Calculator {
    void printSum (int a, int b) {
        int result = a + b;
        System.out.println("result = " + result);
    }

    void printDivide (double a, double b) {
        double result = a / b;
        System.out.println("result = " + result);
    }
}
