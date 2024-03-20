package ch15.lecture.p4queue;

import java.util.LinkedList;
import java.util.Queue;

public class C01Queue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        // Item 추가 (offer)
        queue.offer("java");
        queue.offer("spring");
        queue.offer("jdbc");
        queue.offer("mariadb");

        System.out.println(queue.size());

        // Item 꺼내기 (poll)

        String e1 = queue.poll();
        String e2 = queue.poll();
        String e3 = queue.poll();
        String e4 = queue.poll();

        System.out.println(queue.size());

        System.out.println("e1 = " + e1);
        System.out.println("e2 = " + e2);
        System.out.println("e3 = " + e3);
        System.out.println("e4 = " + e4);
    }
}
