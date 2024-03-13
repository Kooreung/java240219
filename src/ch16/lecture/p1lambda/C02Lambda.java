package ch16.lecture.p1lambda;

public class C02Lambda {
    public static void main(String[] args) {
        /*
        추상 메소드가 하나인 인터페이스(= Functional Interface) 의
        익명 클래스의 객체 생성 코드를 간단히 한 것
        여기서 Functional Interface -> C02MyInterface
         */
        C02MyInterface obj = (int a, int b) -> {
                System.out.println("C02Lambda.method1");
        };
    }
}

// FunctionalInterface annotation
// : 마킹 된 인터페이스의 추상 메소드가 하나인지 컴파일러가 검사
@FunctionalInterface
interface C02MyInterface{
    void method1(int a, int b);
}