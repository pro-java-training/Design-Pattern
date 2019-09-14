package Adapter.Exercise;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/*使用委托的适配器*/
public class DelegatedFileProperties implements FileIO {

    private Properties properties;

    public DelegatedFileProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public void readFromFile(String filename) throws IOException {
        properties.load(new FileInputStream(filename));
    }

    @Override
    public void writeToFile(String filename) throws IOException {
        properties.store(new FileOutputStream(filename), "Written by Delegated FileProperties");
    }

    @Override
    public void setValue(String key, String value) {
        properties.setProperty(key, value);
    }

    @Override
    public String getValue(String key) {
        return properties.getProperty(key, "");
    }
}
