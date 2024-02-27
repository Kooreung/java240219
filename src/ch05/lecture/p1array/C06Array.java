package ch05.lecture.p1array;

public class C06Array {
    public static void main(String[] args) {
        // 배열 전체를 탐색
        // arr.length
        // arr[i]
        int [] arr = new int [] {7, 2, 10, 8, -1, 0, 9, 45, 23, 11};

        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr [" + i + "] = " + arr[i]);
        }
        System.out.println("arr.length = " + arr.length);
    }
}
