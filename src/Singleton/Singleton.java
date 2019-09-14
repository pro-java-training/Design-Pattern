package Singleton;

import java.util.Random;

public class Singleton {
    private static Singleton singleton;

    private int num;

    private Singleton() {
        num = new Random().nextInt();
    }

    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

    public int getNum() {
        return num;
    }
}
