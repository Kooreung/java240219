package ch09.lecture.p1nested;

public class C01StaticNestedClass {
    public static void main(String[] args) {
        // 하단의 중첩 클래스 호출
        C01MyClass.C01NestedClass obj1 = new C01MyClass.C01NestedClass();

    }
}

class C01MyClass {
    // Static Nested Class (정적 중첩 클래스)
    static class C01NestedClass {
        // Field, Constructor, Method
        // Static 이니까 외부 객체 만들 필요 없다.
    }

    // Field, Constructor, Method
    void method1() {
        C01NestedClass obj1 = new C01NestedClass();
        // 같은 클래스 내에 있으니
        // 중첩 클래스를 메소드로 호출 가능
    }
}