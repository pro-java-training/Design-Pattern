package Facade.pageMaker;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class PageMaker {

    // 单例模式的私有构造函数
    private PageMaker() {

    }

    public static void make(String site) {
        try {
            Properties properties = Database.getProperties("sites.txt");
            String link = properties.getProperty(site);
            String filename = site + ".md";
            MdWriter writer = new MdWriter(new FileWriter(filename));
            writer.title(site);
            writer.paragraph("the link for " + site);
            writer.link(link, site);
            writer.close();
            System.out.println(filename + " created.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void makeLink(String filename) {
        try {
            Properties properties = Database.getProperties("sites.txt");
            MdWriter writer = new MdWriter(new FileWriter(filename));
            writer.title("Links");
            Set sites = properties.keySet();
            for (Object site : sites) {
                String siteStr = (String) site;
                writer.link(properties.getProperty(siteStr), siteStr);
            }
            writer.close();
            System.out.println(filename + " created.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
