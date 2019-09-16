package Strategy;

public class Player {
    private String name;
    private Strategy strategy; // 委托的适配器模式
    private int winCount; // 获胜次数
    private int loseCount;
    private int gameCount;

    public Player(String name, Strategy strategy) {
        this.name = name;
        this.strategy = strategy;
    }

    public Hand nextHand() {
        return strategy.nextHand();
    }

    public void win() {
        strategy.study(true);
        winCount++;
        increaseGameCount();
    }

    public void lose() {
        strategy.study(false);
        loseCount++;
        increaseGameCount();
    }

    public void even() {
        increaseGameCount();
    }

    public String toString() {
        return name + ": " + gameCount + " games, " + winCount + " win, " + loseCount + " lose.";
    }

    public void increaseGameCount() {
        gameCount ++;
    }
}
