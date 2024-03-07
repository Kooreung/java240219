package ch07.lecture.p2polymrphism;

public class C03Polymorphism {
    public static void main(String[] args) {
        C03Fish fish = new C03Fish();
        fish.breathe();
        fish.swin();

        System.out.println("-----");

        C03Cat cat = new C03Cat();
        cat.breathe();
        cat.walk();

        System.out.println("-----");

        C03Animal animal = fish;
        animal.breathe();

        animal = cat;
        animal.breathe();
    }
}
class C03Animal {
    public void breathe() {
        System.out.println("호흡하다");
    }
}

class C03Fish extends C03Animal {
    @Override
    public void breathe() {
        System.out.println("아가미 호흡");
    }
    public void swin() {
        System.out.println("헤엄치다");
    }
}

class C03Cat extends C03Animal{
    @Override
    public void breathe() {
        System.out.println("폐 호흡");
    }

    public void walk() {
        System.out.println("걷다");
    }
}