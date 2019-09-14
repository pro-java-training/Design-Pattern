package Adapter.Exercise;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

public class Test {
    public static void main(String[] args) {
        FileIO f = new DelegatedFileProperties(new Properties());
        String path = System.getProperty("user.dir");
        path += File.separator + "src" + File.separator + "Adapter" + File.separator + "Exercise" + File.separator;
        try {
            f.readFromFile(path + "file.txt");
            f.setValue("year", "2019");
            f.setValue("month", "9");
            f.setValue("day", "14");
            f.writeToFile(path + "newFile.txt");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("done.");
    }
}
