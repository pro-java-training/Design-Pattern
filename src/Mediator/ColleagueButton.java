package Mediator;

import java.awt.*;

public class ColleagueButton extends Button implements Colleague {
    public Mediator mediator;

    public ColleagueButton(String title) {
        super(title);
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void setColleagueEnabled(boolean enabled) { // Mediator 下达启用指令
        setEnabled(enabled);
    }
}
