package ch07.lecture.p3casting;


public class C03Casting {
    public static void main(String[] args) {
        C03Tiger tiger = new C03Tiger();
        C03Animal animal = tiger;

        C03Tiger tiger2 = (C03Tiger)animal; // 가능
        C03Cat cat = (C03Cat) animal; // 불가능

        C03Animal animal3 = new C03Animal();
        C03Tiger tiger3 = (C03Tiger) animal3; // 불가능
    }
}

class C03Animal {
    public void breathe() {
        System.out.println("숨 쉬다");
    }
}
class C03Tiger extends C03Animal{
    @Override
    public void breathe() {
        System.out.println("호랑이 숨쉬다");
    }
}
class C03Cat extends C03Animal{

}