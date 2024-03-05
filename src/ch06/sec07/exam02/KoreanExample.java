package ch06.sec07.exam02;

public class KoreanExample {
    public static void main(String[] args) {
        Korean k1 = new Korean("박자바", "193202-1385923");
        System.out.println("k1.nation : " + k1.nation);
        System.out.println("k1.name : " + k1.name);
        System.out.println("k1.ssn : " + k1.ssn);
        System.out.println("");

        Korean k2 = new Korean("박쿼리", "324425-4415253");
        System.out.println("k1.nation : " + k2.nation);
        System.out.println("k1.name : " + k2.name);
        System.out.println("k1.ssn : " + k2.ssn);
    }
}
