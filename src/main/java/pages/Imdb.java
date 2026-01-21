package pages;
public class Imdb {
    private HomePage _homePage;
    private SignInPage _signInPage;
    private AmazonCreateAccountPage _amazonCreateAccountPage;
    private Top250Page _top250Page;
    private SearchPage _firstSearchResultTitle;
    private IMDbCreateAccountPage _imdbCreateAccountPage;

    public HomePage homePage(){
        if(_homePage == null){
            _homePage = new HomePage();
        }

        return _homePage;
    }

    public SignInPage signInPage(){
        if(_signInPage == null){
            _signInPage = new SignInPage();
        }

        return _signInPage;
    }

    public AmazonCreateAccountPage amazonCreateAccountPage(){
        if(_amazonCreateAccountPage==null){
            _amazonCreateAccountPage = new AmazonCreateAccountPage();
        }

        return _amazonCreateAccountPage;
    }
    public Top250Page top250Page(){
        if(_top250Page == null){
            _top250Page = new Top250Page();
        }

        return _top250Page;
    }
    public SearchPage searchPage(){
        if(_firstSearchResultTitle == null){
            _firstSearchResultTitle = new SearchPage();
        }

        return _firstSearchResultTitle;
    }
    public IMDbCreateAccountPage imdbCreateAccountPage(){
        if(_imdbCreateAccountPage == null){
            _imdbCreateAccountPage = new IMDbCreateAccountPage();
        }
        return _imdbCreateAccountPage;
    }
}
