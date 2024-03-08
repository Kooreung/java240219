package ch07.lecture.p3casting;

public class C04InstanceOf {
    public static void main(String[] args) {

        C04Tiger c04Tiger = new C04Tiger();
        C04Animal animal = c04Tiger;

        boolean b1 = animal instanceof C04Cat; // false
        // animal 의 인스턴스가 cat인가?
        boolean b2 = animal instanceof C04Tiger; // true
        // animal 의 인스턴스가 tiger인가?
        boolean b3 = animal instanceof C04Animal; // true

        if(animal instanceof C04Cat) {
            C04Cat cat = (C04Cat) animal;
            cat.meow();
        } // 안전하게 강제 형번환을 하는 방법

        if (animal instanceof C04Cat cat) {
            cat.meow();
        } // 안전한 강제 형변환을 한 번에 하는 방법

        // C04Cat cat = (C04Cat) animal // 불가능
    }
}

class C04Animal {

}
class C04Tiger extends C04Animal{}

class C04Cat extends C04Animal{
    public void meow() {
        System.out.println("애옹");
    }
}