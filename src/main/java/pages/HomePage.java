package pages;

import org.openqa.selenium.WebElement;

public class HomePage extends BasePage{
    private String _logo = "//a[@class=\"sc-3f7a066b-0 ekjSlF imdb-header__logo-link imdb-header__logo-link--large\"]";
    private String _menu = "//label[@id=\"imdbHeader-navDrawerOpen\"]";
    private String _searchTextbox = "//input[@id=\"suggestion-search\"]";
    private String _searchFilter = "//div[@class=\"sc-6ba245e3-0 bVjXEB searchCatSelector-menuWrapper searchCatSelector-all-breakpoints\"]";
    private String _searchIcon = "//button[@id=\"suggestion-search-button\"]";
    private String _signIn = "//a[@class=\"ipc-btn ipc-btn--single-padding ipc-btn--center-align-content ipc-btn--default-height ipc-btn--core-baseAlt ipc-btn--theme-baseAlt ipc-btn--button-radius imdb-header__signin-text\"]";
    private String _top250MovieLink = "//a[@href=\"/chart/top/?ref_=hm_nv_menu\"]";


    public WebElement getLogo(){
        return findElementXpath(_logo);
    }

    public WebElement getMenu(){
        return findElementXpath(_menu);
    }

    public WebElement getSearchFilter(){
        return findElementXpath(_searchFilter);
    }

    public WebElement getSearchTextbox(){
        return findElementXpath(_searchTextbox);
    }

    public WebElement getSearchIcon(){
        return findElementXpath(_searchIcon);
    }

    public WebElement getSignIn(){
        return findElementXpath(_signIn);
    }

    public WebElement getTop250MovieLink(){
        return findElementXpath(_top250MovieLink);
    }
}
