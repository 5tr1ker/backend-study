package i_collection;

import java.util.Enumeration;
import java.util.Properties;

public class PropertiesStudy {

    public static void main(String[] args) {
        Properties prop = new Properties();

        prop.setProperty("a", "aa");
        prop.setProperty("b", "bb");
        prop.setProperty("c", "cc");
        prop.setProperty("d", "dd");
        prop.setProperty("e", "ee");

        Enumeration e = prop.propertyNames();
        while (e.hasMoreElements()) {
            String element = e.nextElement().toString();
            System.out.println(element + " = " + prop.getProperty(element));
        }

        prop.setProperty("a" , "pqwrqwr");

        System.out.println(prop);
        System.out.println(prop.getProperty("avb" , "empty!"));
        System.out.println(prop.getProperty("awfawf"));

        Properties systemData = System.getProperties();

        System.out.println(systemData);
    }
}
