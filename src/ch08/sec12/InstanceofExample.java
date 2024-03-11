package ch08.sec12;

public class InstanceofExample {
    public static void main(String[] args) {
        Taxi taxi = new Taxi();
        Bus bus = new Bus();

        ride(taxi);
        System.out.println( );
        ride(bus);
    }

    public static void ride(Vehicle vehicle) {
        if (vehicle instanceof Bus bus) {
            bus.checkFare();
        } // if 문을 통해 버스인지 검증을 한 후 형변환을 하여 안전하게 진행 시키게 된다.

        vehicle.run();
    }
}
