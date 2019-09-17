package Memento;

import Memento.game.Gamer;
import Memento.game.Memento;

public class Test {
    public static void main(String[] args) {
        Gamer gamer = new Gamer(100);
        Memento memento = gamer.createMemento();
        for (int i = 0; i < 100; i++) {
            System.out.print(i + ": ");
            System.out.println(gamer);

            gamer.play();
            System.out.println(gamer.getMoney() + " left.");

            if (gamer.getMoney() > memento.getMoney()) {
                System.out.println("create memento");
                memento = gamer.createMemento();
            } else if (gamer.getMoney() < memento.getMoney() / 2) {
                System.out.println("restore memento");
                gamer.restore(memento);
            }
            System.out.println();
        }
    }
}
