package Visitor;

//实现了 Element 的类才可以被访问
public interface Element {
    public abstract void accept(Visitor visitor);
}
