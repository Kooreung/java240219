package ch09.lecture.p1nested;

public class C02InstanceNestedClass {
    public static void main(String[] args) {
//        C02MyClass.C02NestedClass obj = new C02MyClass.C02NestedClass();
        // Static 중첩과 다르게 Instance 중첩은 바로 사용 불가능

        C02MyClass obj1 = new C02MyClass();
        C02MyClass.C02NestedClass obj2 = obj1.new C02NestedClass();
        // A 의 객체가 있어야 B 객체도 생성이 가능하다.
    }
}

class C02MyClass {
    // Instance Nested Class (인스턴스 중첩 클래스)
    class C02NestedClass {

    }

    int i; // Instance Field
    static int j; // Static Field

    void method1() {
        C02NestedClass obj1 = new C02NestedClass();
        // 같은 클래스 내에 있으니
        // 중첩 클래스를 메소드로 호출 가능
    }
}