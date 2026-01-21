package pages;

import org.openqa.selenium.WebElement;

public class Top250Page extends BasePage{
    private String _detailedViewButton = "//button[@id=\"list-view-option-detailed\"]";
//    private String _movieName = "//h3[@class="ipc-title__text ipc-title__text--reduced"][2]";
    private String _250thMovie = "(//span[@class=\"ipc-btn__text\" and text()='Mark as watched'])[250]";
    public String movieTitle = "";
    public String movieYear = "";
    public String movieRating = "";
//    private String _buttonGenreSelect = "Genre Select Button";
//    private String _buttonSortBy = "Sort By Button";
//    private String _buttonShare = "Share Button";

    public WebElement getDetailedViewButton(){
        return findElementXpath(_detailedViewButton);
    }
    public WebElement get250thMovie(){
        return findElementXpath(_250thMovie);
    }


}

