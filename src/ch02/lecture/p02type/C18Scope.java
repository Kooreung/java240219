package ch02.lecture.p02type;

public class C18Scope {
    public static void main(String[] args) {
        // 변수는 선언된 블럭 {} 안에서만 사용이 가능하다.
        // 따라서 변수의 선언과 할당은 동시에 하는 게 좋다.
        // 지역변수에서만 사용 가능 (필드, 파라미터, 리턴타입 사용 불가능)
        int a = 3;
        int b = 5;

        if (true) {
            System.out.println("if 안" + a + b);
        }

        System.out.println(b);
    }
}
