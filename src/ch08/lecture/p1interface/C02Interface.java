package ch08.lecture.p1interface;

public class C02Interface {
    public static void main(String[] args) {
        C02Cat cat = new C02Cat();
        C02Tiger tiger = new C02Tiger();
        C02GoldenFish goldenFish = new C02GoldenFish();

        C02Animal animal;
        animal = cat;
        animal = tiger;
        animal = goldenFish;

        C02Pet pet;
        animal = cat;
        animal = tiger;
        animal = goldenFish;

        C02Aquatic aquatic;
        aquatic = goldenFish;
    }
}

// @formatter:off
interface C02Pet {}
interface C02Aquatic {}
class C02Animal {}

class C02Cat  extends C02Animal implements C02Pet{}
class C02GoldenFish  extends C02Animal implements C02Pet, C02Aquatic{}
class C02Tiger  extends C02Animal{}

// 상속은 한 번에 하나만 가능, 인터페이스는 한 여러 개 사용은 가능