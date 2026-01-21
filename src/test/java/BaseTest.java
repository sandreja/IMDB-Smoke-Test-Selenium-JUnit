import browser.Browser;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import pages.Imdb;

public class BaseTest{
    protected static Imdb imdb;

        private String searchTerm = "12 гневних људи"; //sajt je po defaultu na srpskom
        private String email = "mock@email.com";
        private String password = "Test1234";

    public String getSearchTerm() {
        return searchTerm;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }




        @BeforeClass
        public static void setup(){
            imdb = new Imdb();

        }
        @AfterClass
        public static void cleanup(){
            Browser.getBrowser().quit();
        }
        @Before
        public void testSetup(){
            Browser.getBrowser().manage().window().maximize();
            Browser.getBrowser().get("https://www.imdb.com/");
        }


}
