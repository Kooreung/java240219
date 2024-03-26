package ch14.lecture.p1thread;

public class C08Thread {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
            for (int i =0; i < 30000; i++) {
                System.out.println(i);
            }
        });

        t.start(); // thread 시작
        t.join(); // 현재 Thread 가(=main) t Thread 의 종료를 대기.기다림

        for (int i =0; i < 30000; i++) {
            System.err.println(i);
        }
    }
}
