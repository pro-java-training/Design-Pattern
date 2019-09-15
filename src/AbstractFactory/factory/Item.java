package AbstractFactory.factory;

public abstract class Item {
    protected String name;

    public Item(String name) {
        this.name = name;
    }

    public abstract String makeText();
}
