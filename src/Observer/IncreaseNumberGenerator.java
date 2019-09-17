package Observer;

public class IncreaseNumberGenerator extends NumberGenerator {
    private int stop;
    private int step;
    private int number;

    public IncreaseNumberGenerator(int start, int stop, int step) {
        this.stop = stop;
        this.step = step;
        this.number = start;
    }

    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public void generate() {
        while (number <= stop) {
            notifyObservers();
            number += step;
        }
    }
}
