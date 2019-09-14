package FactoryMethod;

import FactoryMethod.framework.Factory;
import FactoryMethod.framework.Product;
import FactoryMethod.idcard.IDCard;
import FactoryMethod.idcard.IDCardFactory;

public class Test {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("James");
        Product card2 = factory.create("Andrew");
        Product card3 = factory.create("Jimmy");

        card1.use();
        card2.use();
        card3.use();
    }
}
