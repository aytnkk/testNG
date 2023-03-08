package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class Driver {

    /*
    Daha fazla kontrol imkani ve extends kullanmadan driver'a ulasmak icin webdriver objesini
    driver classindaki static bir method ile olustruacagiz.
    Ancak getdriver methodu her kullanildiginda yeni bir driver olusturuyor.Bunu engellemek icin
    ve kodumuzun duzgun calismasini saglamak icin ilk kullanimda new ChromeDriver();kodu calissin
    sonraki kullanimlarda calismasin diye bir yontem gelistirmeliyiz.

     */
    private Driver(){

    }

    public static WebDriver driver;

    public static WebDriver getDriver(){

        String istenenBrowser=ConfigReader.getProperty("browser");

        if (driver==null){
            switch (istenenBrowser){
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver=new FirefoxDriver();
                    break;
                case "edge" :
                    WebDriverManager.edgedriver().setup();
                    driver=new EdgeDriver();
                    break;
                case "safari" :
                    WebDriverManager.safaridriver().setup();
                    driver=new SafariDriver();
                    break;
                default:
                    WebDriverManager.chromedriver().setup();
                    driver=new ChromeDriver();
            }
        }



        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        return driver;

    }

    public static void closeDriver(){

        if (driver != null){
          driver.close();
            driver=null;
        }

    }

    public static void quitDriver(){

        if (driver != null){
            driver.quit();
            driver=null;
        }

    }
}
