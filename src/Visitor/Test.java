package Visitor;

import Composite.FileTreatException;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        try {
            System.out.println("making root entry...");
            Directory rootDir = new Directory("root");
            Directory binDir = new Directory("bin");
            Directory tmpDir = new Directory("tmp");
            Directory usrDir = new Directory("usr");

            rootDir.add(binDir).add(tmpDir).add(usrDir);

            binDir.add(new File("vi", 100));
            binDir.add(new File("latex", 200));
            rootDir.accept(new ListVisitor());

            System.out.println();

            System.out.println("Making user entries...");
            Directory Jimmy = new Directory("jimmy");
            Directory Anna = new Directory("anna");

            usrDir.add(Jimmy).add(Anna);

            Jimmy.add(new File("bill.xls", 100));
            Jimmy.add(new File("note.page", 300));
            Anna.add(new File("paper.page", 400));

            File file = new File("Comp.java", 200);
            Jimmy.add(file);

            rootDir.accept(new ListVisitor());

            System.out.println();

            // 查找指定类型的文件
            System.out.println("Search for specific files:");
            FileFindVisitor findVisitor = new FileFindVisitor("page");
            rootDir.accept(findVisitor);

            Iterator it = findVisitor.getFilesIterator();
            while (it.hasNext()) {
                File tmpFile = (File) it.next();
                System.out.println(tmpFile.toString());
            }
            System.out.println();

            // 测试 ElementArrayList
            ElementArrayList list = new ElementArrayList();
            list.add(usrDir);
            list.add(binDir);
            list.accept(new ListVisitor());

        } catch (FileTreatException e) {
            e.printStackTrace();
        }
    }
}
