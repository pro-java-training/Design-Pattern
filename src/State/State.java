package State;

public interface State {
    public abstract void changeState(Context context, int hour);

    public abstract void doAct(Context context);
}
