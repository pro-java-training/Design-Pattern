package Visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FileFindVisitor extends Visitor {
    private String suffix;

    private List<File> files = new ArrayList<>();

    public FileFindVisitor(String suffix) {
        this.suffix = suffix;
    }

    @Override
    public void visit(File file) {
        if (file.getName().endsWith(suffix)) {
            files.add(file);
        }
    }

    @Override
    public void visit(Directory directory) {
        Iterator it = directory.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            entry.accept(this);
        }
    }

    public Iterator getFilesIterator() {
        return files.iterator();
    }
}
