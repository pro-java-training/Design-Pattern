package Bridge;

public class Test {
    public static void main(String[] args) {
        Display display1 = new Display(new StringDisplayImpl("hello, world"));
        CountDisplay display2 = new CountDisplay(new StringDisplayImpl("hello, java"));
        display1.display();
        display2.display();
        display2.multiDisplay(3);

        RandomDisplay display3 = new RandomDisplay(new StringDisplayImpl("hello, Jimmy"));
        display3.randomDisplay(3);

        String filename = "test.txt";
        CountDisplay display4 = new CountDisplay(new FileDisplayImpl(filename));
        display4.multiDisplay(3);


    }
}
