package TemplateMethod;

public class Test {
    public static void main(String[] args) {
        Display d1 = new CharDisplay('H');
        Display d2 = new StringDisplay("hello, world");
        Display d3 = new StringDisplay("你好, 世界");

        d1.display();
        d2.display();
        d3.display();
    }
}
