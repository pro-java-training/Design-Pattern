package Prototype;

import Prototype.framework.Manager;
import Prototype.framework.Product;

public class Test {
    public static void main(String[] args) {
        Manager manager = new Manager();
        Underline ud = new Underline('_');
        MessageBox mb = new MessageBox('*');
        manager.register("underline", ud);
        manager.register("strong", mb);

        Product p1 = manager.create("strong");
        p1.use("hello, world");

        Product p2 = manager.create("underline");
        p2.use("hello, world");
    }
}
