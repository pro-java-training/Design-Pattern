package AbstractFactory.conFactory;

import AbstractFactory.factory.*;

public class ConFactory extends Factory {
    @Override
    public Link createLink(String name, String url) {
        return new ConLink(name, url);
    }

    @Override
    public Group createGroup(String name) {
        return new ConGroup(name);
    }

    @Override
    public Page createPage(String title, String author) {
        return new ConPage(title, author);
    }
}
