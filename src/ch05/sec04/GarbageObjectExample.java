package ch05.sec04;

public class GarbageObjectExample {
    public static void main(String[] args) {
        String hobby = "여행";
        hobby = null; // "여행" 이라는 String 객체는 쓰레기가 됨

        String kind1 = "자동차";
        String kind2 = kind1; // kind1의 변수에 저장 된 번지를 kind2에 대입
        kind1 = null; // "자동차" 라는 String 객체는 kind2가 참조하기 때문에 쓰레기가 아님.

    }
}
