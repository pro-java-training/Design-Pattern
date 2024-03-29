package Prototype.framework;

public interface Product extends Cloneable {
    public abstract void use(String str);

    public abstract Product createClone();
}
