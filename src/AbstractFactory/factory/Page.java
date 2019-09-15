package AbstractFactory.factory;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

public abstract class Page {
    protected String title;
    protected String author;
    protected ArrayList<Item> content = new ArrayList<>();

    public Page(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void add(Item item) {
        content.add(item);
    }

    public void print() {
        try {
            String filename = title + ".txt";
            Writer writer = new FileWriter(filename);
            writer.write(makeText());
            writer.close();
            System.out.println(filename + " 编辑完成.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public abstract String makeText();
}
