package popsugar.selenium.util;

import java.io.*;
import java.util.Properties;

public class ProUtil {
    private Properties prop;
    private String filepath;

    public ProUtil(String filepath) throws IOException {
        this.filepath = filepath;
        this.prop = readProperties();
    }

    private Properties readProperties() throws IOException {
        Properties prop = new Properties();
        InputStream in = new BufferedInputStream(new FileInputStream(filepath));
        prop.load(in);
        return prop;
    }

    public String getPro(String key) {
        String username = prop.getProperty(key);
        return username;
    }

    public void writePro(String key,String value) throws IOException {
        Properties prop = new Properties();
        FileOutputStream file = new FileOutputStream(filepath);
        prop.setProperty(key, value);
        prop.store(file, "addcookie");
    }

}
