package pages;

import org.openqa.selenium.WebElement;

public class IMDbCreateAccountPage extends BasePage{
    private String _passwordTextField = "//input[@id=\"ap_password\"]";
    private String _emailTextField = "//input[@id=\"ap_email\"]";
    private String _signInButton = "//input[@id=\"signInSubmit\"]";
    private String _profileButton = "(//label[@aria-label=\"Toggle account menu\"])[2]";
    private String _signOutButton = "//a[@class=\"ipc-list__item imdb-header-account-menu__sign-out\"]";

    public WebElement getEmailTextField(){
        return findElementXpath(_emailTextField);
    }

    public WebElement getPasswordTextField(){
        return findElementXpath(_passwordTextField);
    }

    public WebElement getSignInButton(){
        return findElementXpath(_signInButton);
    }

    public WebElement getProfileButton(){
        return findElementXpath(_profileButton);
    }

    public WebElement getSignOutButton(){
        return findElementXpath(_signOutButton);
    }
}
