package Adapter.Extended;

public class Show {
    private String str;

    public Show(String str) {
        this.str = str;
    }

    public void showWeak() {
        System.out.println("(" + str + ")");
    }

    public void showStrong() {
        System.out.println("*" + str + "*");
    }
}
