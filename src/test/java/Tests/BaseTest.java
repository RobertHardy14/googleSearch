package Tests;

import POMs.GoogleHomePage;
import POMs.SearchResultsPage;
import POMs.SouthParkPage;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class BaseTest
{
    public WebDriver driver;

    public GoogleHomePage home;
    public SearchResultsPage results;
    public SouthParkPage park;

    @Before
    public void Setup()
    {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        home = new GoogleHomePage(driver);
        results = new SearchResultsPage(driver);
        park = new SouthParkPage(driver);
    }
    @After
    public void TearDown()
    {
        driver.quit();
    }
}
