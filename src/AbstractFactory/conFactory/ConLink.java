package AbstractFactory.conFactory;

import AbstractFactory.factory.Link;

public class ConLink extends Link {
    public ConLink(String name, String url) {
        super(name, url);
    }

    @Override
    public String makeText() {
        return "===" + name + "(" + url + ")" + "\n"; // [google](www.google.com)
    }
}
