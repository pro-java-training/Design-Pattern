package Command;

public class PrintCommand implements Command {

    private Printable printer; // 委托适配器

    private String str;

    public PrintCommand(Printable printer, String str) {
        this.printer = printer;
        this.str = str;
    }

    @Override
    public void execute() {
        printer.print(str);
    }
}
