package State;

public abstract class Context {

    // 委托适配器
    protected State state;

    public abstract void setClock(int hour);

    public void changeState(State state) {  // 改变状态
        this.state = state;
    }

    public abstract void work();

    public abstract void rest();
}
