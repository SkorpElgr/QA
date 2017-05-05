package pages;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by PS on 4/18/2017.
 */
public enum Name {
    TestBrowser,
    ImplicitlyWait,
    TestUserName,
    TestUserPass,
    TestEnvUrl;

    public String getFromProperty(){
        String rez = null;
        try {
            FileReader reader = new FileReader("src/main/resources/config.properties");
            Properties properties = new Properties();
            properties.load(reader);
            rez = properties.getProperty(String.valueOf(this));

        }
        catch (IOException e){
            e.printStackTrace();
        }
        return rez;
    }
}
