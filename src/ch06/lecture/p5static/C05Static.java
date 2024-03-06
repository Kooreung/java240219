package ch06.lecture.p5static;

public class C05Static {
    //instance field

    //static field ( = class field)
    static int age = 30;
    static double area;

        //static block
            //static member 의 초기 설정용
            //static 값을 초기화 하는데 많은 statement 가 필요하다면 사용
    static {
        area = Math.PI * 10 * 10;
        method1(); // static method 사용 가능
        }

    //constructor

    //instance method

    //static method ( = class method)
    static void method1() {}

}
