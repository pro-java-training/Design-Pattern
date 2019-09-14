package Prototype.framework;

import java.util.HashMap;

public class Manager {
    private HashMap<String, Product> database = new HashMap<>();

    public void register(String name, Product pro) {
        database.put(name, pro);
    }

    public Product create(String name) {
        Product pro = (Product) database.get(name);
        return pro.createClone();
    }
}
