package ch05.lecture.p1array;

public class C05Array {
    public static void main(String[] args) {
        // 배열의 각 원소에 접근하는 법 : index 사용
        int[ ]  arr = new int []{100, 200, 300};

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        arr[2] = 400;

        System.out.println(arr[2]);

        // 존재하지 않는 index 사용 불가

    }
}
