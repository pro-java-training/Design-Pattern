package Command;

public class Test {
    public static void main(String[] args) {
        MacroCommand history = new MacroCommand();
        StandPrinter printer = new StandPrinter(history);

        Command cmd1 = new PrintCommand(printer, "hello");
        cmd1.execute();
        history.append(cmd1);

        Command cmd2 = new PrintCommand(printer, "world");
        cmd2.execute();
        history.append(cmd2);

        history.append(new Command() {
            @Override
            public void execute() {
                System.out.println("匿名内部类");
            }
        });

//        history.undo(); // 删掉最后一条命令 cmd2

        printer.printAll(); // 重新执行一遍

        history.clear();



    }
}
