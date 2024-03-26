package ch14.lecture.p1thread;

public class C03Thread {
    public static void main(String[] args) {
        // Thread 만드는 방법
        // 1. Thread Class 상속
        //      run Method 재정의

        // 2. Runnable Interface 구현
        //      run Method 재정의

        // Thread 시작하는 방법
        MyThread03 thread03 = new MyThread03();
        thread03.start(); // Thread 시작

        // 위 Thread 와 동시에 시작
        for (int i = 0; i < 30000; i++) {
            System.err.println(i);
        }
    }
}

class MyThread03 extends Thread {
    @Override
    public void run() {
        // 이 Thread 가 할 일
        // 우리가 임의로 run 을 실행 시키면 안된다.
        for (int i = 0; i < 30000; i++) {
            System.out.println(i);
        }
    }
}