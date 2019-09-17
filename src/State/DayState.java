package State;

public class DayState implements State {
    private static DayState singleton = new DayState();

    public static State getInstance() {
        return singleton;
    }

    @Override
    public void changeState(Context context, int hour) {
        if (hour < 6 || hour >= 22) {
            context.changeState(NightState.getInstance());
        }
    }

    @Override
    public void doAct(Context context) {
        context.work();
    }
}
