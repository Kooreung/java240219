package ch15.sec07;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class SynchronizedMapExample {
    public static void main(String[] args) {
        Map<Integer, String> map = Collections.synchronizedMap(new HashMap<>());
        // var map = Collections.synchronizedMap(new HashMap<Integer, String>());
        // var map = new HashMap<Integer, String>();
        // var map = new Hashtable<Integer, String>();

        Thread threadA = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i <= 1000; i++) {
                    map.put(i, "내용"+i);
                }
            }
        };

        Thread threadB = new Thread() {
            @Override
            public void run() {
                for (int i = 1001; i <= 2000; i++) {
                    map.put(i, "내용"+i);
                }
            }
        };

        threadA.start();
        threadB.start();

        try {
            threadA.join();
            threadB.join();
        } catch (Exception e) {

        }

        int size = map.size();
        System.out.println("총 객체 수 : size");
        System.out.println();
    }
}
