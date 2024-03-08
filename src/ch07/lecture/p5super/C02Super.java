package ch07.lecture.p5super;

public class C02Super {
    public static void main(String[] args) {
        C02Parent parent = new C02Parent();
        C02Child child = new C02Child();
    }
}

class C02Parent {
    // 생성자 : 객체가 만들어 질 때 초기화 하는 코드들
    // = 필드 초기화

    public C02Parent() {

    }
}

class C02Child extends C02Parent {
    public C02Child() {
        // 상위 타입 생성자를 호출
        // 상위 타입의 no-args 생성자 호출 코드는 자동으로 삽입
        super();
    }
} // 상속 되어 있으므로, Parent 생성자도 초기화를 해야 한다.