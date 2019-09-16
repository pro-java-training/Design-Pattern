package Decorator;

public abstract class Display {
    public abstract int getColumns();

    public abstract int getRows();

    public abstract String getRowText(int row);

    // 模板方法模式
    public final void show() {
        for (int i = 0; i < getRows(); i++) {
            System.out.println(getRowText(i));
        }
    }
}
