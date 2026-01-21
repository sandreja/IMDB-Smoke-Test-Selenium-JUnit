package pages;

import org.openqa.selenium.WebElement;

public class AmazonCreateAccountPage extends BasePage{
    private String _yourNameTextField = "//input[@id=\"ap_customer_name\"]";
    private String _emailTextField = "//input[@id=\"ap_email\"]";
    private String _passwordTextField = "//input[@id=\"ap_password\"]";
    private String _reenterPasswordTextField = "//input[@id=\"ap_password_check\"]";
    private String _createYourAmazonAccountButton = "//input[@id=\"continue\"]";



    public WebElement getYourNameTextField(){
        return findElementXpath(_yourNameTextField);
    }

    public WebElement getEmailTextField(){
        return findElementXpath(_emailTextField);
    }

    public WebElement getPasswordTextField(){
        return findElementXpath(_passwordTextField);
    }

    public WebElement getReenterPasswordTextField(){
                             return findElementXpath(_reenterPasswordTextField);
    }

    public WebElement getCreateYourAmazonAccountButton(){
        return findElementXpath(_createYourAmazonAccountButton);
    }
}