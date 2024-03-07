package ch06.sec15;

public class Singleton {

    private static Singleton singleton = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        // 같은 객체만 return 하도록 코드 작성
        return singleton;
    }
}
