package Iterator;

public interface Iterator {

    // 是否存在下一个元素
    public abstract boolean hasNext();

    // 获取下一个元素, 同时将迭代器移至下一个元素的位置.
    public abstract Object next();
}
