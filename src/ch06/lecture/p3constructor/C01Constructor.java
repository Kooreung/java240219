package ch06.lecture.p3constructor;

public class C01Constructor {
    public static void main(String[] args) {
        System.out.println("1");
        // new 와 생성자 코드를 실행시키는 것이었다.
        C01MyClass obj1 = new C01MyClass();
        C01MyClass obj2 = new C01MyClass();
        C01MyClass obj3 = new C01MyClass();
        System.out.println("2");
    }
}

class C01MyClass {
    //필드

    //생성자 : constructor
        // 객체 생성 시 실행되는 코드블럭
        // 생성자 이름은 class 이름과 같다.
        // 필요하면 파라미터 작성 가능
    C01MyClass() {
        // 객체 생성 시 실행되어야 하는 코드들
        // 보통 필드 값 초기화
        // 초기 설정
        System.out.println("객체 생성 시 초기화 코드");
    }

    //메소드
}