package ch07.lecture.p7object;

public class C03Sample {
    public static void main(String[] args) {
        Shape shape1 = new Round(3);
        Shape shape2 = new Rectangle(5,7);
        shape1.printArea();
        shape2.printArea();

        printDescription(shape1);
        // 반지름이 3인 원의 면적은 ... 입니다.
        printDescription(shape2);
        // 가로5, 세로 7인 사각형의 면적은 ... 입니다.
    }

    public static void printDescription (Object o) {
        System.out.println(o.toString());
    }
}

abstract class Shape {
    public abstract void printArea();
}

class Round extends Shape {

    private final int radius;

    public Round(int radius) {
        this.radius = radius;
    }

    @Override
    public void printArea() {
        double area = getArea();
        System.out.println(area);
    }

    @Override
    public String toString() {
        double area = getArea();
        return STR."반지름이 \{radius}인 원의 면적은 \{area} 입니다.";
    }

    private double getArea() {
        double area = radius * radius * Math.PI;
        return area;
    }


}

class Rectangle extends Shape {

    private final int width;
    private final int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void printArea() {
        double area = getArea();
        System.out.println(area);
    }

    @Override
    public String toString() {
        double area = getArea();
        return STR."가로 \{width}, 세로 \{height} 인 사각형의 넓이는 \{area} 입니다.";
    }

    private double getArea() {
        double area = width * height;
        return area;
    }
}