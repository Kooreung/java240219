package ch07.exercise.p04;

public class Exercise04 {
    public static void main(String[] args) {

    }
}

class Parent {
    public void method1(int a) {

    }
}

class Child extends Parent {
    @Override// 컴파일러가 컴파일 시 해당 메소드가 재정의 한 것인지 체크 함
    public void method1(int a) {
        // 확인문제 4번 오버라이드 이론 정의 체크
    }
}