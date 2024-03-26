package ch14.lecture.p2concurrency;

import java.util.ArrayList;

public class C05ArrayList {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<String> list = new ArrayList<>();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 30000; i++) {
                list.add("a");
                list.remove("a");
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 30000; i++) {
                list.add("b");
                list.remove("b");
            }
        });

        t1.start();
        t2.start();
        // 두 개의 Thread 가 하나의 List 를 수정하려고 하여 오류 발생
        t1.join();
        t2.join();

        System.out.println(list);
    }
}
