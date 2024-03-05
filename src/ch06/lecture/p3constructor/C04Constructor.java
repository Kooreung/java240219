package ch06.lecture.p3constructor;

public class C04Constructor {
    public static void main(String[] args) {
        C04MyClass obj1 = new C04MyClass("son", 42);
        C04MyClass obj2 = new C04MyClass("lee", 23);

        System.out.println(obj1.name + " | " + obj1.age);
        System.out.println(obj2.name + " | " + obj2.age);
    }

}

class C04MyClass {
    String name;
    int age;

    C04MyClass(String initialName, int initialAge) {
        name = initialName;
        age = initialAge;
    }

}