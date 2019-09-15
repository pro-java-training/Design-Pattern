package Bridge;

public class Display {
    private DisplayImpl impl; // 委托适配器模式

    public Display(DisplayImpl impl) {
        this.impl = impl;
    }

    public void open() {
        impl.rawOpen();
    }

    public void print() {
        impl.rawPrint();
    }

    public void close() {
        impl.rawClose();
    }

    // 模板方法模式
    public final void display() {
        open();
        print();
        close();
    }
}
