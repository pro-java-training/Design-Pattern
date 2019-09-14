package Iterator;

public interface Iterator<T> {

    // 是否存在下一个元素
    public abstract boolean hasNext();

    // 获取当前元素, 同时将迭代器移至下一个元素的位置.
    public abstract T next();
}
