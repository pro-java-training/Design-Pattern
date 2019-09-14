package Prototype;

import Prototype.framework.Product;

public class MessageBox implements Product {
    private char ch;

    public MessageBox(char ch) {
        this.ch = ch;
    }

    @Override
    public void use(String str) {
        int length = str.getBytes().length;
        for (int i = 0; i < length + 4; i++) {
            System.out.print(ch);
        }
        System.out.println("");
        System.out.println(ch + " " + str + " " + ch);

        for (int i = 0; i < length + 4; i++) {
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
