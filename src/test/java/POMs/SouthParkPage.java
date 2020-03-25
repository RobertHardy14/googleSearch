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

public class SouthParkPage extends BasePage
{
    @FindBy(xpath = "//a[contains(@class,'xbtn')]")
    WebElement popUpCloseButton;
    @FindBy(xpath = "//a[@href='https://southpark.cc.com/episodios-en-espanol/random?lang=es']")
    WebElement randomEpisode;
    @FindBy(xpath = "//div[@class='edge-placeholder-button']")
    WebElement video;

    public SouthParkPage(WebDriver driver)
    {
       super(driver);
        PageFactory.initElements(driver,this);
    }
    public void closeAnnoyingPopUp() //Esto puede tronar
    {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(@class,'xbtn')]")));
        popUpCloseButton.click();
    }
    public void clickRandomEpisode()
    {
        randomEpisode.click();
    }
    public void watchEpisode()
    {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='edge-gui']")));
        video.click();
    }
}