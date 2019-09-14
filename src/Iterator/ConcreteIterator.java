package Iterator;

/*具体的迭代器*/
public class ConcreteIterator<T> implements Iterator {

    private ConcreteSet<T> concreteSet; // 集合的引用

    private int index;

    public ConcreteIterator(ConcreteSet<T> concreteSet) {
        this.concreteSet = concreteSet;
    }

    @Override
    public boolean hasNext() {
        return index < concreteSet.getLength();
    }

    @Override
    public T next() {
        T t =  concreteSet.get(index);
        index++;
        return t;
    }
}
