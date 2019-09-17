package Strategy;

import java.util.Date;

public class Test {
    public static void main(String[] args) {
        Date date = new Date();
        Player player1 = new Player("James", new WinStrategy(date.getTime()));
        Player player2 = new Player("Andy", new ProbStrategy(date.getTime() - 1000));
        for (int i = 0; i < 1000; i++) {
            Hand hand1 = player1.nextHand();
            Hand hand2 = player2.nextHand();
            if (hand1.isStrongerThan(hand2)) {
                System.out.println("Winner: " + player1);
                player1.win();
                player2.lose();
            } else if (hand1.isWeakerThan(hand2)) {
                System.out.println("Winner: " + player2);
                player1.lose();
                player2.win();
            } else {
                System.out.println("Even");
                player1.even();
                player2.even();
            }
        }
        System.out.println("Total result: ");
        System.out.println(player1.toString());
        System.out.println(player2.toString());
    }
}
