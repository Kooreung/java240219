package ch06.lecture.p5static;

public class C01Static {
    public static void main(String[] args) {
        C01MyClass obj01 = new C01MyClass();
        obj01.name = "son";

        C01MyClass obj02 = new C01MyClass();
        obj02.name = "lee";

        // 인스턴스를 통해서 static 멤버 (필드, 메소드) 의
        // 값을 설정하는 건 가능하나, 비권장
        obj01.location = "seoul"; // = 비권장 형 (인스턴스를 통했기 때문)
        C01MyClass.location = "daejeon"; // = 권장형 (클래스 변수이기 때문)


        System.out.println(obj01.name);
        System.out.println(obj02.name);
        System.out.println(obj01.location);
        System.out.println(obj02.location);
    }
}

class C01MyClass {
    // (인스턴스) 필드 (= 인스턴스 변수)
    String name;

    // static 필드 (= class 변수)
    // 인스턴스에 대한 정보가 아닌 클래스에 대한 정보이다.
    // 공통으로 가지게 되는 정보
    // 다른 클래스에서 static 필드를 지정해주면, 공통사항으로 변경 된다.
    static String location;


    // (인스턴스) 메소드
    void method1() {

    }
}