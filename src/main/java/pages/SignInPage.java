package pages;

import org.openqa.selenium.WebElement;

public class SignInPage extends BasePage{
    private String _createAnAccountButton = "//a[@data-testid=\"create_account_aap\"]";
    private String _signInToAnExistingAccountButton = "//button[@data-testid=\"navigate_to_sign_in_button\"]";
    private String _signInWithImdbButton = "//a[@data-testid=\"sign_in_option_IMDB\"]";
    private String _signInWithAmazonButton = "//a[@data-testid=\"sign_in_option_AMAZON_AAP\"]";
    private String _signInWithGoogleButton = "//a[@data-testid=\"sign_in_option_GOOGLE\"]";
    private String _signInWithAppleButton = "//a[@data-testid=\"sign_in_option_APPLE\"]";
    private String _createYourAmazonAccountButton = "//a[@id=\"createAccountSubmit\"]";

    public WebElement getCreateAnAccountButton(){
        return findElementXpath(_createAnAccountButton);
    }

    public WebElement getSignInToAnExistingAccountButton(){
        return findElementXpath(_signInToAnExistingAccountButton);
    }

    public WebElement getSignInWithImdbButton(){
        return findElementXpath(_signInWithImdbButton);
    }

    public WebElement getSignInWithAmazonButton(){
        return findElementXpath(_signInWithAmazonButton);
    }

    public WebElement getSignInWithGoogleButton(){
        return findElementXpath(_signInWithGoogleButton);
    }

    public WebElement getSignInWithAppleButton(){
        return findElementXpath(_signInWithAppleButton);
    }

    public WebElement getCreateYourAmazonAccountButton(){
        return findElementXpath(_createYourAmazonAccountButton);
    }
}
