package Visitor;

import java.util.ArrayList;
import java.util.Iterator;

public class ElementArrayList extends ArrayList implements Element {
    @Override
    public void accept(Visitor visitor) {
        Iterator iterator = iterator();
        while (iterator.hasNext()) {
            Element e = (Element) iterator.next();
            e.accept(visitor);
        }
    }
}
