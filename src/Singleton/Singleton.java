package Singleton;

import java.util.Random;

public class Singleton {
    private static Singleton singleton;

    private int num;

    private Singleton() {
        num = new Random().nextInt();
        slowdown();
    }

    public static synchronized Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

    public int getNum() {
        return num;
    }

    private void slowdown() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

        }
    }
}
