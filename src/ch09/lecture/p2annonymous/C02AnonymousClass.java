package ch09.lecture.p2annonymous;

public class C02AnonymousClass {
    public static void main(String[] args) {
        C02Parent obj = new C02Parent() {
            // 상속된 멤버

            // 필요하다면 재정의 가능
            @Override
            void method1() {
                System.out.println("C02AnnoymousClass.method1");
            }
        };
        obj.method1(); // 재정의 메소드가 실행
    }
}

abstract class C02Parent {
    void method1() {
        System.out.println("C02Parent.method1");
    }
}