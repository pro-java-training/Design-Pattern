package Proxy;

public class Test {
    public static void main(String[] args) {
        Printable p = new PrinterProxy("Dell", "Proxy.Printer");
        System.out.println(p.getPrinterName());

        p.setPrinterName("HP");
        p.print(p.getPrinterName());
    }
}
