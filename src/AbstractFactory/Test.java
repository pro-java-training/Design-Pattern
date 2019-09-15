package AbstractFactory;

import AbstractFactory.factory.*;

public class Test {
    public static void main(String[] args) {
        String factoryName = "AbstractFactory.conFactory.ConFactory";
        Factory factory = AbstractFactory.factory.Factory.getFactory(factoryName);

        Link peopleNews = factory.createLink("人民日报", "www.people.com.cn");
        Link tenCentNews = factory.createLink("腾讯新闻", "www.qq.com");

        Group newsGroup = factory.createGroup("新闻");
        newsGroup.add(peopleNews);
        newsGroup.add(tenCentNews);

        Link googleSearch = factory.createLink("Google", "www.google.com");
        Link googleHKSearch = factory.createLink("Google HK", "www.google.com.hk");
        Link baiduSearch = factory.createLink("Baidu", "www.baidu.com");

        Group googleGroup = factory.createGroup("Google");
        googleGroup.add(googleSearch);
        googleGroup.add(googleHKSearch);

        Group searchGroup = factory.createGroup("搜索引擎");
        searchGroup.add(googleGroup);
        searchGroup.add(baiduSearch);

        Page page = factory.createPage("Note", "Jimmy");
        page.add(newsGroup);
        page.add(searchGroup);
        page.print();

    }
}
