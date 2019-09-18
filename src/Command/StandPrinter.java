package Command;

public class StandPrinter implements Printable {

    // 历史命令
    private MacroCommand history;

    public StandPrinter(MacroCommand history) {
        this.history = history;
    }

    public void printAll() {
        history.execute();
    }

    @Override
    public void print(String string) {
        System.out.println(string);
    }
}
