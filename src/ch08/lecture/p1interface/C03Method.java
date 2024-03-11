package ch08.lecture.p1interface;

public class C03Method {
    public static void main(String[] args) {
        C03Pet pet1 = new C03Cat();
        C03Pet pet2 = new C03GoldFish();

        pet1.feed();
        pet2.feed();
    }
}

interface C03Pet {
    void feed();
    // interface 의 메소드는 모두 추상 메소드이다.
    // 따라서 뒤에 중괄호를 붙일 수 없다.
    // public, abstract 생략 가능
    }

class C03Animal {
    public void breathe() {
        System.out.println("숨을 쉽니다.");
    }
}

class C03Cat extends C03Animal implements C03Pet{
    @Override
    public void breathe() {
        super.breathe();
    }
    @Override
    public void feed() {
        System.out.println("고양이 밥 주기");
    }
};

class C03Tiger extends C03Animal{
    @Override
    public void breathe() {
        super.breathe();
    }
};
class C03GoldFish extends C03Animal implements C03Pet{

    @Override
    public void breathe() {
        super.breathe();
    }
    @Override
    public void feed() {
        System.out.println("밥 주기");
    }
};
