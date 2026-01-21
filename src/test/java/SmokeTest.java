import browser.Browser;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class SmokeTest extends BaseTest{

    @Test
        public void searchResultTest(){
            imdb.homePage().getSearchTextbox().sendKeys(getSearchTerm());
            imdb.homePage().getSearchIcon().click();
            Assert.assertEquals(getSearchTerm() , imdb.searchPage().getFirstSearchResultTitle().getText().toLowerCase());
            Assert.assertTrue(imdb.searchPage().getFirstSearchResultTitle().getText().toLowerCase().equals(getSearchTerm()));
        }

   @Test
        public void signInOptions(){


                imdb.homePage().getSignIn().click();
            imdb.signInPage().getSignInToAnExistingAccountButton().click();
            Assert.assertEquals("Sign in with IMDb", imdb.signInPage().getSignInWithImdbButton().getText());
            Assert.assertTrue(imdb.signInPage().getSignInWithAmazonButton().getText().contains("Amazon"));
            Assert.assertEquals("Sign in with Google", imdb.signInPage().getSignInWithGoogleButton().getText());
            Assert.assertTrue(imdb.signInPage().getSignInWithAppleButton().getText().equals("Sign in with Apple"));
    }


    @Test
        public void signInWithImdbTest(){
        WebDriverWait wait = new WebDriverWait(Browser.getBrowser(), Duration.ofSeconds(10));


        imdb.homePage().getSignIn().click();
        imdb.signInPage().getSignInToAnExistingAccountButton().click();
        imdb.signInPage().getSignInWithImdbButton().click();
        imdb.imdbCreateAccountPage().getEmailTextField().sendKeys(getEmail());
        imdb.imdbCreateAccountPage().getPasswordTextField().sendKeys(getPassword());
        imdb.imdbCreateAccountPage().getSignInButton().click();
        wait.until(ExpectedConditions.visibilityOf(imdb.imdbCreateAccountPage().getProfileButton()));
        imdb.imdbCreateAccountPage().getProfileButton().click();
        Assert.assertEquals("sign out", imdb.imdbCreateAccountPage().getSignOutButton().getText().toLowerCase());

    }
    @Test
        public void top250Test(){
        WebDriverWait wait1 = new WebDriverWait(Browser.getBrowser(), Duration.ofMillis(15000));

        imdb.homePage().getMenu().click();
        imdb.homePage().getTop250MovieLink().click();

        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@class=\"ipc-btn__text\" and text()='Mark as watched'])[250]")));


        ArrayList <pages.Top250Page> lista250 = new ArrayList<>();

        List<WebElement> brojElemenata = Browser.getBrowser().findElements(By.xpath("//li[@class=\"ipc-metadata-list-summary-item\"]"));

        for(WebElement element : brojElemenata){
            pages.Top250Page top250Page = new pages.Top250Page();

            top250Page.movieTitle = element.findElement(By.tagName("h3")).getText();
            top250Page.movieRating = element.findElement(By.className("ipc-rating-star--rating")).getText();
            top250Page.movieYear = element.findElement(By.className("sc-caa65599-7")).getText();


            lista250.add(top250Page);
        }

        Assert.assertEquals(250, brojElemenata.size());
        Assert.assertEquals("Бекство из Шошенка", lista250.get(0).movieTitle);
        Assert.assertEquals("1972",lista250.get(1).movieYear);
        Assert.assertEquals(4,lista250.stream().filter(i ->i.movieRating.equals("9.0")).count() );

    }


}
