package ch06.lecture.p2method;

public class C01Method {
    public static void main(String[] args) {
        C01Person person1 = new C01Person();
        C01Person person2 = new C01Person();

        person1.name = "son";
        person2.name = "lee";

        person1.walk(); // method 실행
        person2.walk(); // method 실행
    }
}

class C01Person {
    // Field : 이름, 나이, 주소 ...
    String name;
    int age;
    String address;

    // Method
    void walk() {
        // 메소드가 실행하는 코드들
        // 변수, 연산자, 제어문
        System.out.println(name + "이 실행됩니다.");
    }
}