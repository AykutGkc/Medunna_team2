package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    // 1- properties objesi oluşturuluyor
    static Properties properties;

    /*
       2- Bu class'ın amacı configuration.properties dosyasını okumak
          ve oradaki key value ikililerini kullanarak istediğimiz key'e ait value'yu bize getirmek
    */

    static {

        String dosyaYolu="configuration.properties";

        try {
            FileInputStream fileInputStream=new FileInputStream(dosyaYolu);
            properties=new Properties();
            properties.load(fileInputStream); //-->fileInputStream in okuduğu bilgileri properties'e yükler
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*
       3- Test class'larından ConfigReader class'ına ulaşıp yukarıdaki işlemleri
          yapmamızı sağlayacak bir metot oluşturacağız.
          Bu metot, verilen key'e karşılık gelen value'yu döndürür.
    */
    public static String getProperty(String key){
        String value=properties.getProperty(key);
        return value;  //-->String olarak girdiğim key'in değerini return eder
    }
}

    /*
        .properties uzantili dosyaya erişebilmek için Properties class'ından obje oluşturmamız gerekir.
     bu oluşturduğumuz obje ile akışa aldığımız dosya yolunu properties.load(fis) methodu ile properties
     dosyasındaki bilgileri objemize yükler ve properties dosyasındaki key değerini return ederiz.
     Bunu yapmak için parametreli bir method oluşturur girdiğimiz key'in değerini bize döndürür
     */