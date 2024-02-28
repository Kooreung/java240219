package ch05.lecture.p1array;

public class C02StackHeep {
    public static void main(String[] args) {
        int a = 3;
        int[] arr = new int[]{7,8};
        int address = System.identityHashCode(arr);
        System.out.println("address = " + address);
        arr = new int [] {1};
        address = System.identityHashCode(arr);
        System.out.println("address = " + address);
    }
}
