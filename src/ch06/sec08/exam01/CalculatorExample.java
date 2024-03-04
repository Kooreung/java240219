package ch06.sec08.exam01;

public class CalculatorExample {
    public static void main(String[] args) {
        Calculator myCalc = new Calculator();

        myCalc.powerOn();

        int result1 = myCalc.plus(5,6);
        System.out.println("result1 = " + result1);

        int am = 10;
        int ur = 4;

        double result2 = myCalc.divide(am,ur);
        System.out.println("result2 = " + result2);

        myCalc.powerOff();
    }
}
