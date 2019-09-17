package Observer;

import java.util.ArrayList;

public abstract class NumberGenerator {
    private ArrayList<Observer> observers = new ArrayList<>();

    // 添加观察者
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    // 删除观察者
    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    // 向观察者发送通知
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    public abstract int getNumber();

    public abstract void generate();

}
