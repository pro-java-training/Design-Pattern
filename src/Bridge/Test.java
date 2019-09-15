package Bridge;

public class Test {
    public static void main(String[] args) {
        Display display1 = new Display(new StringDisplayImpl("hello, world"));
        CountDisplay display2 = new CountDisplay(new StringDisplayImpl("hello, java"));
        display1.display();
        display2.display();
        display2.multiDisplay(3);
    }
}
