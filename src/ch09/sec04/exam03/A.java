package ch09.sec04.exam03;

public class A {
    public void method1(int arg) { // final int arg
        int var = 1; // final int var = 1;

        class B {
            void method2() {
                System.out.println("arg : " + arg);
                System.out.println("var : " + var);

                // Local 변수 수정 불가능
                // arg = 2;
                // var = 2;
            }
        }

        B b = new B();
        b.method2();
        // Local 변수 수정 불가능
        // arg = 2;
        // var = 2;

        // Local 변수들을 Local Class 에서
        // 사용하고 있기 때문에 변경에 제한

        // Local 변수 = 생성자 또는 메소드의 매개변수
        //              내부에서 선언된 변수
    }
}
