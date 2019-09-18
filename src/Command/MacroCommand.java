package Command;

import java.util.Stack;

public class MacroCommand {
    // 命令栈
    private Stack<Command> commands = new Stack<>();

    public void execute() {
        for (Command cmd : commands) {
            cmd.execute();
        }
    }

    public void append(Command cmd) {
        if (cmd != this) {
            commands.push(cmd);
        }
    }

    // 删除最后一条命令
    public void undo() {
        if (!commands.empty()) {
            commands.pop();
        }
    }

    // 删除所有命令
    public void clear() {
        commands.clear();
    }
}
