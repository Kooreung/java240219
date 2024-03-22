package ch17.lecture.p3optional;

import java.util.Optional;
import java.util.OptionalInt;

public class C02Primitive {
    public static void main(String[] args) {

        // OptionalInt : 기본타입 int 값을 가지고 있을 수 있는 컨테이너
        // OptionalDouble : 기본타입 double 값을 가지고 있을 수 있는 컨테이너
        // OptionalLong : 기본타입 long 값을 가지고 있을 수 있는 컨테이너

        //만드는 방법
        OptionalInt o1 = OptionalInt.of(3);
        OptionalInt o2 = OptionalInt.of(50);
        OptionalInt o3 = OptionalInt.empty();

        // isPresent : 값이 있으면 true
        // isEmpty : 값이 없으면 true

        o1.isPresent();
        o3.isPresent();
        o1.isEmpty();
        o3.isEmpty();

        // getAsInt : 값 얻기 (없으면 Exception)
        o1.getAsInt(); // 3

        // orElse : 값이 없으면 기본값 얻기
        o1.orElse(0); // 3
        o3.orElse(0); // 0
    }

}
