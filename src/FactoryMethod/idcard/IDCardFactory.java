package FactoryMethod.idcard;

import FactoryMethod.framework.Factory;
import FactoryMethod.framework.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class IDCardFactory extends Factory {
    private HashMap<Integer, String> database = new HashMap<>();
    private int id = 1;

    @Override
    protected synchronized Product createProduct(String owner) {
        return new IDCard(owner, id ++);
    }

    @Override
    protected void registerProduct(Product product) {
        IDCard idCard = (IDCard) product;
        database.put(idCard.getId(), idCard.getOwner());
    }

    public HashMap<Integer, String> getDatabase() {
        return database;
    }
}
