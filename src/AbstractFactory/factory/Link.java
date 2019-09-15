package AbstractFactory.factory;

public abstract class Link extends Item{

    protected String url;

    public Link(String name, String url) {
        super(name);
        this.url = url;
    }
}
