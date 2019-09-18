package Proxy;

public class PrinterProxy implements Printable {
    private String name;
    private Printable real; // 被代理的对象, 委托的适配器模式
    private String className; // 被代理的类

    public PrinterProxy() {

    }

    public PrinterProxy(String name, String className) {
        this.name = name;
        this.className = className;
    }

    @Override
    public synchronized void setPrinterName(String name) {
        if (real != null) {
            real.setPrinterName(name);
        }
        this.name = name;
    }

    @Override
    public String getPrinterName() {
        return name;
    }

    @Override
    public void print(String string) {
        realize();
        real.print(string);
    }

    private synchronized void realize() {
        if (real == null) {
            try {
                real = (Printable) Class.forName(className).newInstance();
                real.setPrinterName(name);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
