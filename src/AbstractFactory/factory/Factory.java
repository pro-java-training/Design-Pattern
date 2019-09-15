package AbstractFactory.factory;

public abstract class Factory {
    public static Factory getFactory(String className) {
        Factory factory = null;
        try {
            factory = (Factory) Class.forName(className).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return factory;
    }

    public abstract Link createLink(String name, String url);

    public abstract Group createGroup(String name);

    public abstract Page createPage(String title, String author);
}
