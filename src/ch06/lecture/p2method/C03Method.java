package ch06.lecture.p2method;

public class C03Method {
    public static void main(String[] args) {
        C04Person john = new C04Person();
        C04Person jane = new C04Person();
        john.name = "john";
        jane.name = "jane";

        john.run();
        jane.walk();

    }
}

class C04Person {
    String name;

    void run () {
        System.out.println(name + "이 달립니다.");
    }

    void walk () {
        System.out.println(name + "이 걷습니다.");
    }
}