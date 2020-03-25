package POMs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchResultsPage extends BasePage
{

    @FindBy (xpath = "//a[@href='https://southpark.cc.com/episodios-en-espanol']")
    WebElement result;

    public SearchResultsPage(WebDriver driver)
    {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public void clickResult()
    {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@href='https://southpark.cc.com/episodios-en-espanol']")));
        result.click();
    }
}
