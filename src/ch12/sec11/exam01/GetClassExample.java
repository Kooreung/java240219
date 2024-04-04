package ch12.sec11.exam01;

public class GetClassExample {
    public static void main(String[] args) throws ClassNotFoundException {
        Class clazz1 = Car.class;

        // Class clazz2 = Class.forName("ch12.sec11.exam01.Car");

        // Car car = new Car();
        // Class clazz3 = car.getClass();

        System.out.println("패키지 : " + clazz1.getPackage().getName());
        System.out.println("클래스 간단 이름 : " + clazz1.getSimpleName());
        System.out.println("클래스 전체 이름 : " + clazz1.getName());
    }
}
