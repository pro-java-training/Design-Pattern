package AbstractFactory.conFactory;

import AbstractFactory.factory.Item;
import AbstractFactory.factory.Page;

public class ConPage extends Page {
    public ConPage(String title, String author) {
        super(title, author);
    }

    @Override
    public String makeText() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("=" + title + "\n\n");
        for (Item item : content) {
            buffer.append(item.makeText());
        }

        buffer.append("==" + author + "\n");
        return buffer.toString();
    }
}
