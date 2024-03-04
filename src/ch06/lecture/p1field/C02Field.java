package ch06.lecture.p1field;

public class C02Field {
    public static void main(String[] args) {
        C02Car car1 = new C02Car();

        car1.color = "검은색";
        car1.weight = 999.85;

        System.out.print("1번 차량 : " + car1.color + " | ");
        System.out.println(car1.weight);

        C02Car car2 = new C02Car();

        car2.color = "빨강색";
        car2.weight = 802.85;

        System.out.print("2번 차량 : " + car2.color + " | ");
        System.out.println(car2.weight);
    }

}
