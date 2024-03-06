package ch06.sec10.exam02;

public class Television {
    static String company = "MyCompany";
    static String model = "LCD";
    static String info;

    // static block
    static {
        info = company + "-" + model;
    }
}
