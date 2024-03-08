package ch07.lecture.p3casting;

public class C01Casting {
    public static void main(String[] args) {
        C01Animal animal1 = new C02Tiger();
        animal1.breathe();

        // 강제 형변환 (casting)
        // animal1 은 C01Animal 타입이라서
        C02Tiger tiger = (C02Tiger) animal1;
        tiger.roar();

        C01Animal animal2 = new C02Cat();
        animal2.breathe();

        C02Cat cat = (C02Cat) animal2;
        cat.meow();

        System.out.println(System.identityHashCode(animal1));
        System.out.println(System.identityHashCode(tiger));
        System.out.println(System.identityHashCode(animal2));
        System.out.println(System.identityHashCode(cat));
    }
}

class C01Animal {
    public void breathe(){
        System.out.println("숨을 쉰다.");
    }
}

class C01Tiger extends C01Animal {
    @Override
    public void breathe() {
        System.out.println("폐로 숨을 쉰다.");
    }

    public void roar() {
        System.out.println("어흥");
    }
}

class C01Cat extends C01Animal{
    @Override
    public void breathe() {
        System.out.println("폐로 숨을 쉰다더라.");
    }

    public void meow() {
        System.out.println("애옹");
    }
}