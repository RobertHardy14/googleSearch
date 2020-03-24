package POMs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class southPark
{
    WebDriver driver = new ChromeDriver();
    WebDriverWait wait = new WebDriverWait(driver,10);
    WebElement pageTitle;
    @FindBy(xpath = "//a[contains(@class,'xbtn')]")
    WebElement popUpCloseButton;
    @FindBy(xpath = "//a[@href='https://southpark.cc.com/episodios-en-espanol/random?lang=es']")
    WebElement randomEpisode;
    public void closeAnnoyingPopUp()
    {}
    public void clickRandomEpisode()
    {}

}
