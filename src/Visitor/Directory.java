package Visitor;

import java.util.ArrayList;
import java.util.Iterator;

public class Directory extends Entry {

    private String name;
    private ArrayList<Entry> entries = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        SizeVisitor visitor = new SizeVisitor();
        accept(visitor);
        return visitor.getSize();
    }

    public Entry add(Entry entry) {
        entries.add(entry);
        return this;
    }

    public Iterator iterator() {
        return entries.iterator();
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
