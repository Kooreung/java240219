package ch05.lecture.p1array;

public class C11Array {
    public static void main(String[] args) {

        int[] arr= new int[3];
        for (int item : arr) {
            System.out.println(item);
        } // 배열의 초기값 확인

        arr[0] = 23;
        arr[1] = 13;
        arr[2] = 53;

        System.out.println("--------");
        for (int item : arr){
            System.out.println(item);
        }
    }
}
