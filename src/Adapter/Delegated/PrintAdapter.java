package Adapter.Delegated;

import Adapter.Extended.Show;

public class PrintAdapter extends Print {

    private Show show;

    public PrintAdapter(String str) {
        this.show = new Show(str);
    }

    @Override
    public void printWeak() {
        show.showWeak();
    }

    @Override
    public void printStrong() {
        show.showStrong();
    }

    public static void main(String[] args) {
        Print p = new PrintAdapter("hello");
        p.printWeak();
        p.printStrong();
    }
}
