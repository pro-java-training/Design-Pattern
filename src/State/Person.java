package State;


public class Person extends Context {

    public Person() {
        state = DayState.getInstance(); // 默认状态为白天
    }

    @Override
    public void setClock(int hour) {
        state.changeState(this, hour);
    }

    @Override
    public void work() {
        System.out.println("working!");
    }

    @Override
    public void rest() {
        System.out.println("resting!");
    }

    public void act() {
        state.doAct(this);
    }
}
