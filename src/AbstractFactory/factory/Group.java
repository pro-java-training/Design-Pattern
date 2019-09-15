package AbstractFactory.factory;

import java.util.ArrayList;

public abstract class Group extends Item {

    protected ArrayList<Item> items = new ArrayList<>();

    public Group(String name) {
        super(name);
    }

    public void add(Item item) {
        items.add(item);
    }
}
