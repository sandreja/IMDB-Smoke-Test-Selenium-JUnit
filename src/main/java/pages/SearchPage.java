package pages;

import org.openqa.selenium.WebElement;

public class SearchPage extends BasePage{
    private String _firstSearchResultTitle = "(//h3[@class=\"ipc-title__text ipc-title__text--reduced\"])[2]";

    public WebElement getFirstSearchResultTitle(){
        return findElementXpath(_firstSearchResultTitle);
    }
}
