package ch06.exercise.p19;

public class Bank {
    public static void main(String[] args) {

        Account account = new Account();

        account.setBalance(10000);
        System.out.println("현재 잔고 : " + account.getBalance());

        account.setBalance(-10000);
        System.out.println("현재 잔고 : " + account.getBalance());

        account.setBalance(2000000);
        System.out.println("현재 잔고 : " + account.getBalance());

        account.setBalance(300000);
        System.out.println("현재 잔고 : " + account.getBalance());

        account.setBalance(0);
        System.out.println("현재 잔고 : " + account.getBalance());

        account.setBalance(1000000);
        System.out.println("현재 잔고 : " + account.getBalance());
    }
}
