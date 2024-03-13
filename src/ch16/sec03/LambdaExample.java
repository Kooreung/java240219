package ch16.sec03;

public class LambdaExample {
    public static void main(String[] args) {
        Person person = new Person();

        person.action1((name, job) -> {
            System.out.print(name + "의 직업은 ");
            System.out.println(job + "입니다.");
        });
        person.action1((name, job) -> System.out.println(name + "의 직업은 " + job + "인 것에 떳떳합니다."));

        person.action2(word -> {
            System.out.print("\"" + word + "\"");
            System.out.println("라고 말합니다.");
        });
        person.action2(word -> System.out.println("\"" + word + "\"라고 외칩니다."));
    }
}
