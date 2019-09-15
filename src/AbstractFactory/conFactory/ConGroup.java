package AbstractFactory.conFactory;

import AbstractFactory.factory.*;

public class ConGroup extends Group {
    public ConGroup(String name) {
        super(name);
    }

    @Override
    public String makeText() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("==" + name + "\n");
        for (Item item : items) {
            buffer.append( item.makeText());
        }
        buffer.append("\n");
        return buffer.toString();
    }
}
