package POMs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleHomePage
{
WebDriver driver = new ChromeDriver();
WebDriverWait wait = new WebDriverWait(driver, 10);

String expectedTitle = "Google";
String actualTitle = driver.getTitle();

WebElement googleLogo = driver.findElement(By.id("hplogo"));
WebElement searchBar = driver.findElement(By.name("q"));
WebElement searchButton = driver.findElement(By.name("btnK"));

public void gotoWebpage()
{}

public void typeInSearchbar()
{}

public void clickSearchButton()
{}

}
