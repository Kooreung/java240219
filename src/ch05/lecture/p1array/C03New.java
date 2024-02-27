package ch05.lecture.p1array;

public class C03New {
    public static void main(String[] args) {
        int [] arr = new int [] {2, 3};
        int [] arr1 = new int [] {2, 3};

        // arr 가 가진 실제 값을 알고 싶을 때
        // System. identityHashCode(arr) 메소드 사용
        int address = System.identityHashCode(arr);
        int address1 = System.identityHashCode(arr1);
        System.out.println("address = " + address);
        System.out.println("address1 = " + address1);
    }
}
