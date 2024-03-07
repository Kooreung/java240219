package ch07.lecture.p2polymrphism;

public class C01Override {
    public static void main(String[] args) {
        C01GoldFish goldFish = new C01GoldFish();
        C01Cat cat = new C01Cat();

        goldFish.breathe();
        cat.breathe();
    }
}

class C01Animal {
    public void breathe() {
        System.out.println("숨을 쉽니다");
    }
}

// 상위 타입의 method 를 재정의 할 수 있다.
    // method override

class C01GoldFish extends C01Animal {
    public void breathe() {
        System.out.println("아가미로 숨을 쉽니다");
    }
}

class C01Cat extends C01Animal {
    @Override
    public void breathe() {
        System.out.println("코로 숨을 쉽니다");
    }
}