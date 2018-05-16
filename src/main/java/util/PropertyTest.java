package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyTest {

    private final Properties properties = new Properties();

    private static PropertyTest INSTANCE = null;

    private PropertyTest(){
        try {
            properties.load(new FileInputStream(new File("./" + System.getProperty("environment") + ".properties")));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static PropertyTest getInstance() {
        if (INSTANCE == null){
            INSTANCE = new PropertyTest();
        }
        return INSTANCE;
    }

    public Properties getProperties() {
        return properties;
    }
}
