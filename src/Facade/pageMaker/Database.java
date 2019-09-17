package Facade.pageMaker;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

class Database {

    // 单例模式的私有构造函数
    private Database() {

    }

    public static Properties getProperties(String filename) {
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }
}
