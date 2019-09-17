package Mediator;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends Frame implements ActionListener, Mediator {
    private ColleagueCheckbox guestCheck;
    private ColleagueCheckbox loginCheck;
    private ColleagueTextField nameField;
    private ColleagueTextField passField;
    private ColleagueButton okButton;
    private ColleagueButton cancelButton;

    public LoginFrame(String title) {
        super(title);
        setBackground(Color.lightGray);
        setLayout(new GridLayout(4, 2));

        createColleagues();
        add(guestCheck);
        add(loginCheck);
        add(new Label("Username:"));
        add(nameField);
        add(new Label("Password"));
        add(passField);
        add(okButton);
        add(cancelButton);

        colleagueChanged();

        pack();
        setVisible(true);
    }

    @Override
    public void createColleagues() {
        CheckboxGroup group = new CheckboxGroup();
        guestCheck = new ColleagueCheckbox("Guest", group, true);
        loginCheck = new ColleagueCheckbox("Login", group, false);

        nameField = new ColleagueTextField("", 10);
        passField = new ColleagueTextField("", 10);
        passField.setEchoChar('*');

        okButton = new ColleagueButton("OK");
        cancelButton = new ColleagueButton("Cancel");

        // 设置 Mediator
        guestCheck.setMediator(this);
        loginCheck.setMediator(this);
        nameField.setMediator(this);
        passField.setMediator(this);
        okButton.setMediator(this);
        cancelButton.setMediator(this);

        // 设置 Listener
        guestCheck.addItemListener(guestCheck);
        loginCheck.addItemListener(loginCheck);
        nameField.addTextListener(nameField);
        passField.addTextListener(passField);
        okButton.addActionListener(this);
        cancelButton.addActionListener(this);

    }

    @Override
    public void colleagueChanged() {
        if (guestCheck.getState()) { // 游客模式
            nameField.setColleagueEnabled(false);
            passField.setColleagueEnabled(false);
            okButton.setColleagueEnabled(true);
        } else {
            nameField.setColleagueEnabled(true);
            passWordChanged();
        }
    }

    private void passWordChanged() {
        if (nameField.getText().length() > 0) {
            passField.setColleagueEnabled(true);
            if (nameField.getText().length() >= 4 && passField.getText().length() >= 4) {
                okButton.setColleagueEnabled(true);
            } else {
                okButton.setColleagueEnabled(false);
            }
        } else {
            passField.setColleagueEnabled(false);
            okButton.setColleagueEnabled(false);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.toString());
        System.exit(0);
    }


}
