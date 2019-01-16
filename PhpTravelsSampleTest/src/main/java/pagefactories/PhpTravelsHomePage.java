package pagefactories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PhpTravelsHomePage {

    WebDriver driver;

    public PhpTravelsHomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[@id=\"body-section\"]/section/div[2]/div/div/div[2]/ul/li[1]/a")
    WebElement hotelsTab;

    @FindBy(xpath = "//*[@id=\"body-section\"]/section/div[2]/div/div/div[2]/ul/li[2]/a")
    WebElement flightsTab;

    @FindBy(xpath = "//*[@id=\"body-section\"]/section/div[2]/div/div/div[2]/ul/li[3]/a")
    WebElement toursTab;

    @FindBy(xpath = "//*[@id=\"body-section\"]/section/div[2]/div/div/div[2]/ul/li[4]/a")
    WebElement carsTab;

    @FindBy(xpath = "//*[@id=\"body-section\"]/section/div[2]/div/div/div[2]/ul/li[5]/a")
    WebElement visaTab;

    @FindBy(xpath = "//*[@id=\"s2id_autogen8\"]/a/span[1]")
    WebElement hotelSearchBar;

    @FindBy(xpath = "//*[@id=\"s2id_location_from\"]/a/span[1]")
    WebElement flightSearchBar;

    @FindBy(xpath = "//*[@id=\"s2id_autogen10\"]/a/span[1]")
    WebElement tourSearchBar;

    @FindBy(xpath = "//*[@id=\"s2id_carlocations\"]/a/span[1]")
    WebElement carLocation;

    @FindBy(xpath = "//*[@id=\"s2id_autogen4\"]/a/span[1]")
    WebElement visaSelectCountry;

    public void clickHotelsTab(){
        hotelsTab.click();
    }

    public void clickFlightsTab(){
        flightsTab.click();
    }

    public void clickToursTab(){
        toursTab.click();
    }

    public void clickCarsTab(){
        carsTab.click();
    }

    public void clickVisaTab(){
        visaTab.click();
    }

    public boolean hotelTabVisible()
    {
        return hotelSearchBar.isDisplayed();
    }

    public boolean flightsTabVisible(){
        return flightSearchBar.isDisplayed();
    }

    public boolean toursTabVisible(){
        return tourSearchBar.isDisplayed();
    }

    public boolean carsTabVisible(){
        return carLocation.isDisplayed();
    }

    public boolean visaTabVisible(){
        return visaSelectCountry.isDisplayed();
    }
}
