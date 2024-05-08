package utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtil {

    public static String getData(String key) throws IOException {
        String path=System.getProperty("user.dir")+ File.separator+"android.properties";
        Properties prop=new Properties();
        FileReader reader=new FileReader(path);
        prop.load(reader);
        return prop.getProperty(key);
    }
}
