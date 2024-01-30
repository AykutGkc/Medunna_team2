package utilities;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;


public class Driver {

    private Driver(){

    }


    private static WebDriver driver;
    /*
     * driver'ı başka class'lardan sadece Driver class ismi ile çağırabilmek icin statik yaptık.
     * Henüz bu driver ile ilgili ayarlar yapmadığım için başka class'lar bunu yanlışlıkla kullanmasın diye
     erişimi private yaptık (sadece bu class'in kullanımına açık yaptık).
Singleton Pattern
     */

    public static WebDriver getDriver() {
        if (driver == null){
            switch (ConfigReader.getProperty("browser")){
                case "chrome":
                    driver = new ChromeDriver();
                    break;
                case "edge":
                    driver = new EdgeDriver();
                    break;
                case "safari":
                    driver = new SafariDriver();
                    break;
                default:
                    driver=new InternetExplorerDriver();
            }

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
            driver.manage().window().maximize();
        }
        return driver;
    }

    public static void closeDriver(){
        if (driver!=null){
            driver.quit();
        }
        /*
            Burada yeniden null değeri atamamızın sebebi, bir sonraki getDriver metodu çağırışımızda
            yeni değer atayabilmek istememizdir.
        */
        driver=null;
    }
}