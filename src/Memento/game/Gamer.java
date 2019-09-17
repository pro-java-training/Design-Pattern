package Memento.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Gamer {
    private int money;
    private List<String> fruits = new ArrayList<>();
    private Random random = new Random();
    private static String[] fruitNames = {
            "apple", "grape", "banana", "orange"
    };

    public Gamer(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void play() {
        int num = random.nextInt(6) + 1;
        if (num == 1) {
            money += 100;
            System.out.println("money + 100.");
        } else if (num == 2) {
            money /= 2;
            System.out.println("money / 2.");
        } else if (num == 6) {
            String fruit = getFruit();
            System.out.println("get " + fruit);
            fruits.add(fruit);
        } else {
            System.out.println("nothing happened.");
        }
    }

    // 创造快照
    public Memento createMemento() {
        Memento memento = new Memento(money);
        for (String fruit : fruits) {
            memento.addFruit(fruit);
        }
        return memento;
    }

    // 恢复快照
    public void restore(Memento memento) {
        this.money = memento.money;
        this.fruits = memento.fruits;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("money = " + money + ", fruits: ");
        String prefix = "";
        for (String fruit : fruits) {
            builder.append(prefix);
            prefix = ", ";
            builder.append(fruit);
        }
        return builder.toString();
    }

    private String getFruit() {
        return fruitNames[random.nextInt(fruitNames.length)];
    }
}
