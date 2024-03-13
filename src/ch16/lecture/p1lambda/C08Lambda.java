package ch16.lecture.p1lambda;

public class C08Lambda {
    public static void main(String[] args) {
        C08MyInterface obj1 = () -> {
            System.out.println("C08Lambda.method");
            System.out.println("C08Lambda.method");
        };

        C08MyInterface obj2 = () -> System.out.println("C08Lambda.main");
    }
}

// 3. 3. 매개변수가 없고 Return 이 없는 추상 메소드
@FunctionalInterface
interface C08MyInterface {
    void method();
}