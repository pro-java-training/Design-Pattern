package Adapter.Extended;

public class PrintAdapter extends Show implements Print {
    public PrintAdapter(String str) {
        super(str);
    }

    @Override
    public void printWeak() {
        showWeak();
    }

    @Override
    public void printStrong() {
        showStrong();
    }

    public static void main(String[] args) {
        Print p = new PrintAdapter("hello");
        p.printWeak();
        p.printStrong();
    }
}
