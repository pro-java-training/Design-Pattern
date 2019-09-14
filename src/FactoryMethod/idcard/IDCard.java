package FactoryMethod.idcard;

import FactoryMethod.framework.Product;

public class IDCard extends Product {
    private String owner;
    private int id;

    IDCard(String owner, int id) {
        System.out.println("制作 " + owner + " 的 ID 卡.");
        this.owner = owner;
        this.id = id;
    }

    @Override
    public void use() {
        System.out.println("使用 " + owner + " 的 ID 卡, ID 为: " + getId());
    }

    public String getOwner() {
        return owner;
    }

    public int getId() {
        return id;
    }
}
