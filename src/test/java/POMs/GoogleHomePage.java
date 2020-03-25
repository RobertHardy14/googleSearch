package POMs;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleHomePage extends BasePage
{

    String expectedTitle = "Google";
    @FindBy (id = "hplogo")
    WebElement googleLogo; // <--- Aun lo tendria que declarar aqui?
    @FindBy (name = "q")
    WebElement searchBar;
    @FindBy (name = "btnK")
    WebElement searchButton;

    public GoogleHomePage(WebDriver driver)
    {
        super(driver);

        PageFactory.initElements(driver,this);
    }

    public void gotoWebpage()
    {
        driver.get("http://google.com");
        String actualTitle = driver.getTitle();
        wait = new WebDriverWait(driver,15);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("hplogo"))); // <--- Aun que este aqui?
        Assert.assertEquals(actualTitle,expectedTitle);
        System.out.println("Correct webpage");
    }

    public void typeInSearchbar()
    {
        searchBar.click();
        searchBar.sendKeys("South Park");
    }

    public void clickSearchButton()
    {
        searchButton.click();
    }

}
