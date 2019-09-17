package Observer;

public class Test {
    public static void main(String[] args) {
//        NumberGenerator generator = new RandomNumberGenerator();
        NumberGenerator generator = new IncreaseNumberGenerator(10, 50, 5);
        Observer observer1 = new DigitObserver();
        Observer observer2 = new GraphObserver();
        generator.addObserver(observer1);
        generator.addObserver(observer2);
        generator.generate();
    }
}