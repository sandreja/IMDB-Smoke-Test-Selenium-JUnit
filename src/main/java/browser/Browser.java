package browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {
    private static FirefoxDriver browser;
    //private static ChromeDriver browserC  (moze isto bukvalno samo za Chrome, da se isto pravi instanca, naravno opet treba ovaj donji deo za instanciranje)

    public static FirefoxDriver getBrowser(){
        WebDriverManager.firefoxdriver().setup();
        if(browser==null){
            browser = new FirefoxDriver();
        }
        return browser;
    }


}
