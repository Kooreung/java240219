package ch07.lecture.p6final;

public class C01Final {

}

class C01Parent {
    // final : 하위 클래스가 재정의 하지 못하도록 함
    final public void method1() {
        System.out.println("C01Parent.method1");
    } // 자식 클래스에서 재정의 불가능
}

class C01Child extends C01Parent {

}