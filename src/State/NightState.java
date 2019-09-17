package State;

public class NightState implements State {

    private static NightState singleton = new NightState();

    private NightState() {

    }

    public static State getInstance() {
        return singleton;
    }

    @Override
    public void changeState(Context context, int hour) {
        if (6 <= hour && hour < 22) {
            context.changeState(DayState.getInstance());
        }
    }

    @Override
    public void doAct(Context context) {
        context.rest();
    }
}
