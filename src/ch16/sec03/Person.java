package ch16.sec03;

public class Person {
    public void action1(Workable workable) {
        workable.work("홍길동", "HTML 프로그래머");
    }

    public void action2(Speakable speakable) {
        speakable.speak("HTML 프로그래머를 하는 홍길동입니다.");
    }
}
