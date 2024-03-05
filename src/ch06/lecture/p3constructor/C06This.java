package ch06.lecture.p3constructor;

public class C06This {
    public static void main(String[] args) {
        C06MyClass obj1 = new C06MyClass("son");
        System.out.println(obj1.name);

    }
}

class C06MyClass {
    // this : 현재 객체의 참조값

    String name;

    C06MyClass(String initialName) {
        this.name = initialName;
    }
}