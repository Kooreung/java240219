package ch09.lecture.p2annonymous;

public class C08Lambda {
    public static void main(String[] args) {
        C08MyInterface obj = () -> System.out.println("재정의 1");

        obj.method();
    }
}

/*
추상 메소드가 하나인 인터페이스의
익명 클래스 객체 생성 시 람다 표현식으로
코드를 간단하게 작성 가능하다.
 */


interface C08MyInterface {
    void method();
}