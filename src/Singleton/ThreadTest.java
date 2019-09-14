package Singleton;

public class ThreadTest extends Thread {

    public void run() {
        Singleton s = Singleton.getInstance();
        System.out.println(s.getNum());
    }

    public ThreadTest(String name) {
        super(name);
    }

    public static void main(String[] args) {
        new ThreadTest("A").start();
        new ThreadTest("B").start();
        new ThreadTest("C").start();
    }

}
