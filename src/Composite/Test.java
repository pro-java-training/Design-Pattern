package Composite;


import Builder.Director;

public class Test {
    public static void main(String[] args) {
        try {
            System.out.println("making root entry...");
            Directory rootDir = new Directory("root");
            Directory binDir = new Directory("bin");
            Directory tmpDir = new Directory("tmp");
            Directory usrDir = new Directory("usr");

            rootDir.add(binDir);
            rootDir.add(tmpDir);
            rootDir.add(usrDir);

            binDir.add(new File("vi", 100));
            binDir.add(new File("latex", 200));

            rootDir.printList();

            System.out.println();

            System.out.println("Making user entries...");
            Directory Jimmy = new Directory("jimmy");
            Directory Anna = new Directory("anna");

            usrDir.add(Jimmy);
            usrDir.add(Anna);

            Jimmy.add(new File("bill.xls", 100));
            Jimmy.add(new File("note.page", 300));
            Anna.add(new File("paper.page", 400));

            File file = new File("Comp.java", 200);
            Jimmy.add(file);

            rootDir.printList();

            System.out.println();

            System.out.println(file.getPath());

        } catch (FileTreatException e) {
            e.printStackTrace();
        }
    }
}
