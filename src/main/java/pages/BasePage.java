package pages;

import browser.Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BasePage {

    public WebElement findElementXpath(String xpath){
        return Browser.getBrowser().findElement(By.xpath(xpath));
    }

    public WebElement findElementClass (String className){
        return Browser.getBrowser().findElement(By.className(className));
    }
    public WebElement findElementId (String IdName){
        return Browser.getBrowser().findElement(By.id(IdName));
    }


}
