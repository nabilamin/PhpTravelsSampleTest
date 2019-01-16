package testsuite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pagefactories.PhpTravelsHomePage;

public class SearchBarSmoke {

    WebDriver driver;
    PhpTravelsHomePage pageObj;
    String baseUrl = "https://www.phptravels.net/";

    @BeforeTest
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","/Users/nabilamin/Downloads/chromedriver");
        driver = new ChromeDriver();
        pageObj = new PhpTravelsHomePage(driver);
        driver.get(baseUrl);

    }

    @Test
    public void smokeTest() throws InterruptedException{

        pageObj.clickHotelsTab();
        Assert.assertEquals(pageObj.hotelTabVisible(), true);

        pageObj.clickFlightsTab();
        Thread.sleep(3000);
        Assert.assertEquals(pageObj.flightsTabVisible(), true);

        pageObj.clickToursTab();
        Thread.sleep(3000);
        Assert.assertEquals(pageObj.toursTabVisible(), true);

        pageObj.clickCarsTab();
        Thread.sleep(3000);
        Assert.assertEquals(pageObj.carsTabVisible(), true);

        pageObj.clickVisaTab();
        Thread.sleep(3000);
        Assert.assertEquals(pageObj.visaTabVisible(), true);
    }

    @AfterTest
    public void cleanUp(){
        driver.quit();
    }

}
