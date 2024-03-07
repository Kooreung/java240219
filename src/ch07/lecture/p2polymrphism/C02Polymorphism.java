package ch07.lecture.p2polymrphism;

public class C02Polymorphism {
    public static void main(String[] args) {
        C02Cat cat = new C02Cat();
        cat.breathe();

        C02Animal animal = cat;
        animal.breathe();

        C02Animal animal1 = new C02Animal();
        C02Animal animal2 = new C02Cat();

        animal1.breathe();
        animal2.breathe();

    }
}

class C02Animal {
    public void breathe() {
        System.out.println("숨 쉽니다.");
    }
}

class C02Cat extends C02Animal {
    @Override
    public void breathe() {
        System.out.println("폐로 호흡합니다.");
    }
}