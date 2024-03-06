package ch06.exercise.p20;

import java.util.Scanner;

public class BankApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account[] accounts = new Account[100];
        int numberOfAccount = 0;
        boolean run = true;

        while (run) {
            System.out.println("--------------------------------------------------");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
            System.out.println("--------------------------------------------------");
            System.out.print("선택> ");
            String menu = scanner.nextLine();

            switch (menu) {
                case "1": {
                    System.out.println("""
                            --------------
                              1.계좌생성
                            --------------
                            """);
                    System.out.print("계좌번호: ");
                    String accountNumber = scanner.nextLine();
                    System.out.print("계좌주: ");
                    String accountName = scanner.nextLine();
                    System.out.print("초기입금액: ");
                    String accountBalance = scanner.nextLine();

                    Account backData = new Account();
                    backData.setAccountNumber(accountNumber);
                    backData.setAccountName(accountName);
                    backData.setAccountBalance(accountBalance);

                    accounts[numberOfAccount] = backData;
                    numberOfAccount++;
                    System.out.println("결과: 계좌가 생성되었습니다.");
                    break;
                }
                case "2": {
                    System.out.println("""
                            --------------
                              2.계좌목록
                            --------------
                            """);
                    for (int i = 0; i < numberOfAccount; i++) {
                        System.out.println(accounts[i].getAccountNumber() + " | " + accounts[i].getAccountName() + " | " + accounts[i].getAccountBalance());
                    }
                    break;
                }
                case "3": {
                    System.out.println("""
                            --------------
                                3.예금
                            --------------
                            """);
                    System.out.print("계좌번호: ");
                    String accountNumber = scanner.nextLine();
                    System.out.print("예금액: ");
                    int deposit = Integer.parseInt(scanner.nextLine());

                    // 계좌번호가 accountNumber 인 계좌 찾기
                    for (int i = 0; i < numberOfAccount; i++) {
                        if (accounts[i].getAccountNumber().equals(accountNumber)) {
                            int balance = Integer.parseInt(accounts[i].getAccountBalance());
                            accounts[i].setAccountBalance(String.valueOf(balance + deposit));
                        }
                    }
                    break;
                }
                case "4": {
                    System.out.println("""
                            --------------
                                4.출금
                            --------------
                            """);
                    System.out.print("계좌번호: ");
                    String accountNumber = scanner.nextLine();
                    System.out.print("출금액: ");
                    int withdrawal = Integer.parseInt(scanner.nextLine());

                    // 계좌번호가 accountNumber 인 계좌 찾기
                    for (int i = 0; i < numberOfAccount; i++) {
                        if (accounts[i].getAccountNumber().equals(accountNumber)) {
                            int balance = Integer.parseInt(accounts[i].getAccountBalance());
                            accounts[i].setAccountBalance(String.valueOf(balance - withdrawal));
                        }
                    }
                    System.out.println("결과 : 출금을 성공하였습니다.");

                    break;
                }
                case "5": {
                    System.out.println("프로그램 종료");
                    run = false;
                }
            }
        }
    }
}
