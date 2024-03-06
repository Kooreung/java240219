package ch06.lecture.p3constructor;

public class C09DefaultConstructor {
    public static void main(String[] args) {
        C09MyClass1 obj1 = new C09MyClass1(30);
        C09MyClass2 obj2 = new C09MyClass2();
        C09MyClass3 obj3 = new C09MyClass3();
        C09MyClass4 obj4 = new C09MyClass4(3);
        C09MyClass4 obj5 = new C09MyClass4();
    }
}

class C09MyClass1 {
    int age;

    public C09MyClass1(int age) {
        this.age = age;
    }
}

class C09MyClass2 {
    public C09MyClass2() {
    }
}

class C09MyClass3 {
    // 필드, 생성자, 메소드 모두 x
    // 그래도 인스턴스 생성 가능
    // 생성자를 작성하지 않으면 파라미터가 없는 생성자가 자동으로 추가된다.
        // default constructor, no-args constructor
        // 생성자를 작성하면 추가되지 않음
}

class C09MyClass4 {
    int age;

    public C09MyClass4() {
        // 파라미터가 없는 클래스가 필요하다면 빈 생성자를 만들어야 한다.
    }

    public C09MyClass4(int age) {
        this.age = age;
    }
}