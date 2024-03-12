package ch09.lecture.p1nested;

public class C06NestedInterface {
}

class C06OtherClass implements C06MyClass.C06NestedInterface {
    @Override
    public void someMethod() {
        System.out.println("C06OtherClass.someMethod");
    }
}
// 외부에서 중첩 인터페이스 호출

class C06MyClass {
    interface C06NestedInterface {
        void someMethod();
    }

    void method1() {
        class LocalClass implements C06NestedInterface {
            @Override
            public void someMethod() {
                System.out.println("LocalClass.someMethod");
            }
        }
        // 내부에서 중첩 인터페이스 호출
    }
}