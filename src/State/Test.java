package State;

public class Test {
    public static void main(String[] args) {
        Person person = new Person();
        person.act();
        for (int i = 0; i < 24; i++) {
            person.setClock(i);
            person.act();
        }
    }
}
