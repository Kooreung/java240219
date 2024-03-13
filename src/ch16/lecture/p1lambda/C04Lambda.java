package ch16.lecture.p1lambda;

public class C04Lambda {
    public static void main(String[] args) {

        // 1번을 만드는 방법 세 가지
        C04MyInterface obj1 = (int a, int b) -> {
                System.out.println(a + b);
                System.out.println("메소드 몸체");
        };

        C04MyInterface obj2 = (a, b) -> {
            System.out.println(a * b);
        };

        C04MyInterface obj3 = (a, b) -> System.out.println(a * b);
        // Statement 가 한 줄 일 때는 중괄호 {} 도 생략 가능

        obj1.method(10,5);
        obj1.method(10,5);
        obj1.method(10,5);
    }
}

// 여러가지 람다 작성 방법
    // 1. 매개변수가 2개 이상 있고 Return 이 없는 추상 메소드
    // 2. 매개변수가 1개 있고 Return 이 없는 추상 메소드
    // 3. 매개변수가 없고 Return 이 없는 추상 메소드
    // 4. Return 이 있는 추상 메소드

// 1. 매개변수가 2개 이상 있고 Return 이 없는 추상 메소드
interface C04MyInterface {
    void method(int a, int b);
}