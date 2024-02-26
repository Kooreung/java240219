package ch04.sec07;

public class FourCards {
    public static void main(String[] args) {
        int dice1;
        int dice2;
        int dice3;
        int dice4;
        int dice5;


        while (true) {
            dice1 = (int)(Math.random()*6)+1;
            dice2 = (int)(Math.random()*6)+1;
            dice3 = (int)(Math.random()*6)+1;
            dice4 = (int)(Math.random()*6)+1;
            dice5 = (int)(Math.random()*6)+1;
            System.out.print("첫 번째 주사위 = " + dice1 + " | ");
            System.out.print("두 번째 주사위 = " + dice2 + " | ");
            System.out.print("세 번째 주사위 = " + dice3 + " | ");
            System.out.print("네 번째 주사위 = " + dice4 + " | ");
            System.out.print("다섯 번째 주사위 = " + dice5 + " | ");
            System.out.println("");

            if ((dice1 == dice2 && dice2 == dice3 && dice3 == dice4) ||
                    (dice2 == dice3 && dice3 == dice4 && dice4 == dice5) ||
                    (dice1 == dice3 && dice3 == dice4 && dice4 == dice5) ||
                    (dice1 == dice2 && dice2 == dice4 && dice4 == dice5) ||
                    (dice1 == dice2 && dice2 == dice3 && dice3 == dice5) ||
                    (dice1 == dice2 && dice2 == dice3 && dice3 == dice4 && dice4 == dice5)) {
                break;
            };
        }

        System.out.println("----------------");

        do {
            dice1 = (int)(Math.random()*6)+1;
            dice2 = (int)(Math.random()*6)+1;
            dice3 = (int)(Math.random()*6)+1;
            dice4 = (int)(Math.random()*6)+1;
            dice5 = (int)(Math.random()*6)+1;
            System.out.print("첫 번째 주사위 = " + dice1 + " | ");
            System.out.print("두 번째 주사위 = " + dice2 + " | ");
            System.out.print("세 번째 주사위 = " + dice3 + " | ");
            System.out.print("네 번째 주사위 = " + dice4 + " | ");
            System.out.print("다섯 번째 주사위 = " + dice5 + " | ");
            System.out.println("");

        } while (((dice1 == dice2 && dice2 == dice3 && dice3 == dice4) ||
                (dice2 == dice3 && dice3 == dice4 && dice4 == dice5) ||
                (dice1 == dice3 && dice3 == dice4 && dice4 == dice5) ||
                (dice1 == dice2 && dice2 == dice4 && dice4 == dice5) ||
                (dice1 == dice2 && dice2 == dice3 && dice3 == dice5) ||
                (dice1 == dice2 && dice2 == dice3 && dice3 == dice4 && dice4 == dice5)));
    }
}
