package Bridge;

public class StarDisplayImpl extends DisplayImpl {
    private char start;
    private char middle;
    private char end;

    public StarDisplayImpl(char start, char middle, char end) {
        this.start = start;
        this.middle = middle;
        this.end = end;
    }

    @Override
    public void rawOpen() {
        System.out.print(start);
    }

    @Override
    public void rawPrint() {
        System.out.print(middle);
    }

    @Override
    public void rawClose() {
        System.out.println(end);
    }
}
