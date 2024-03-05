package ch06.lecture.p5static;

public class C04Static {
    public static void main(String[] args) {

    }
}

class C04MyClass {
    // 인스턴스 멤버는 static 멤버로 접근 가능
    // static 멤버에서 인스턴스 멤버에 접근 불가능

    // 인스턴스 필드
    String name;

    // static 필드
    static String location;

    // 인스턴스 메소드
    void moethod1() {
        System.out.println(name);
        System.out.println(location); // 가능
    }

    // static 메소드

    static void method2() {
//        System.out.println(name); 불가능. name 은 인스턴스 필드
        System.out.println(location);
    }
}