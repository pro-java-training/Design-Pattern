package Visitor;

import Composite.FileTreatException;

public abstract class Entry implements Element {
    public abstract String getName();

    public abstract int getSize();

    public Entry add(Entry entry) throws FileTreatException {
        throw new FileTreatException();
    }

    // 委托适配器
    @Override
    public String toString() {
        return getName() + "(" + getSize() + ")";
    }
}
