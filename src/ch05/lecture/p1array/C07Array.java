package ch05.lecture.p1array;

public class C07Array {
    public static void main(String[] args) {
        // 배열 전체 탐색
        int[] arr = new int[] {3,4,1,5};


        // 향상된(enhanced) for 문
        for (int item : arr) {
            System.out.println("item = " + item);
        }
    }
}
