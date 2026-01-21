import browser.Browser;
import pages.Imdb;

public class Main {
   public static void main(String[] args) throws InterruptedException {

        Imdb imdb = new Imdb();
        Browser.getBrowser().manage().window().maximize();
        Browser.getBrowser().get("https://www.imdb.com/");

        imdb.homePage().getSignIn().click();
        imdb.signInPage().getCreateAnAccountButton().click();
        imdb.signInPage().getCreateYourAmazonAccountButton().click();
        imdb.amazonCreateAccountPage().getYourNameTextField().sendKeys("Mock Name");
        imdb.amazonCreateAccountPage().getEmailTextField().sendKeys("NotAnEmailAdress@Mock.com");
        imdb.amazonCreateAccountPage().getPasswordTextField().sendKeys("123456");
        imdb.amazonCreateAccountPage().getReenterPasswordTextField().sendKeys("121345");
        imdb.amazonCreateAccountPage().getCreateYourAmazonAccountButton().click();

        imdb.homePage().getSearchTextbox().sendKeys("12 Angry Men");
        imdb.homePage().getSearchIcon().click();
        imdb.homePage().getLogo().click();
        imdb.homePage().getSearchFilter();
        imdb.homePage().getTop250MovieLink().click();





    imdb.homePage().getLogo();
    imdb.amazonCreateAccountPage().getReenterPasswordTextField();
    imdb.signInPage().getCreateAnAccountButton();
        pages.HomePage homePage = new pages.HomePage();
        pages.SignInPage signInPage = new pages.SignInPage();
        pages.AmazonCreateAccountPage amazonCreateAccountPage = new pages.AmazonCreateAccountPage();

        homePage.getLogo();
        signInPage.getCreateAnAccountButton();
        amazonCreateAccountPage.getCreateYourAmazonAccountButton();

    }

}
