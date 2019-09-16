package Composite;

public abstract class Entry {

    protected Entry parent; // 保存了父节点

    public abstract String getName();

    public abstract int getSize();

    public Entry add(Entry entry) throws FileTreatException {
        throw new FileTreatException();
    }

    // 模板方法模式
    public void printList() {
        printList("");
    }

    protected abstract void printList(String prefix);

    public String toString() {
        return getName() + "(" + getSize() + ")";
    }

    public String getPath() {
        StringBuffer buffer = new StringBuffer();
        Entry entry = this;
        do {
            buffer.insert(0, "/" + entry.getName());
            entry = entry.parent; // 回溯父节点
        } while (entry != null);
        return buffer.toString();
    }
}
