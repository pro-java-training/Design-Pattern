package Prototype;

import Prototype.framework.Product;

public class Underline implements Product {
    private char ch;

    public Underline(char ch) {
        this.ch = ch;
    }

    @Override
    public void use(String str) {
        int length = str.getBytes().length;
        System.out.println("\"" + str + "\"");
        System.out.print(" ");
        for (int i = 0; i < length; i++) {
            System.out.print(ch);
        }
        System.out.println(" ");
    }

    @Override
    public Product createClone() {
        Product pro = null;
        try {
            pro = (Product) clone();
        } catch (CloneNotSupportedException e) {
            System.out.println(e.getMessage());
        }
        return pro;
    }
}
