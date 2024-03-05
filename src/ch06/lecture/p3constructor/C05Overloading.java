package ch06.lecture.p3constructor;

public class C05Overloading {
    public static void main(String[] args) {

    }
}

class C05MyClass {
    String name;
    int age;

    // 파라미터의 타입, 개수가 다르면 다른 생성자
    C05MyClass(String initialName, int initialAge) {
        name = initialName;
        age = initialAge;
    }
    C05MyClass(String initialName) {
        name = initialName;
        age = 1;
    }
}