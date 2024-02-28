package ch05.lecture.p1array;

public class C14Copy {
    public static void main(String[] args) {
        int[] arr1 = {3, 4, 6, 1, 2};
        int[] arr2 = new int [5];

        System.arraycopy(arr1, 0,arr2,0,5);

        System.out.println(System.identityHashCode(arr1));
        System.out.println(System.identityHashCode(arr2));



    }
}
