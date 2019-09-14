package Iterator;

import java.util.ArrayList;
import java.util.List;

/*具体的集合*/
public class ConcreteSet<T> implements Aggregate {

    private List<T> list;

    private int length = 0;

    public ConcreteSet(int maxSize) {
        this.list = new ArrayList<>(maxSize);
        this.length = 0;
    }

    public T get(int index) {
        return list.get(index);
    }

    public void add(T t) {
        list.add(t);
        length++;
    }

    public int getLength() {
        return length;
    }

    @Override
    public Iterator getIterator() {
        return new ConcreteIterator<T>(this);
    }
}
