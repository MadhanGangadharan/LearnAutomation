package loginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
public class SalesforceLoginPage {

    WebDriver driver=new ChromeDriver();
    String appLauncher = "div[class='slds-icon-waffle']";

    // webdriver initilization only once in common class

    public void loadurl(String url){  // meaningfull fun name
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.get(url);
    }
    public void enterUsername(String userName){
        driver.findElement(By.id("username")).sendKeys(userName);
        //TypeText(By, someText)
    }
    public void enterUserPassword(String passWord){
        driver.findElement(By.id("password")).sendKeys(passWord);
        //TypeText(By, someText)
    }
    public String clickLoginbutton() {
        driver.findElement(By.id("Login")).click();
        //click()
        //waitforElementToBeClick
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10)); //hard code
        wait.until(ExpectedConditions.titleContains("Home | Salesforce")); //dry it should come feature file
        return driver.getTitle();  //commond function
    }
    public void Quit(){
        driver.close();
    }
    public String clickLoginbuttonNegative(){
        driver.findElement(By.id("Login")).click();
        return driver.findElement(By.id("error")).getText();
    }
    public void createNewAccount(String accountname){

        driver.findElement(By.cssSelector(appLauncher)).click();
        /*Actions actions=new Actions(driver);
        actions.sendKeys(Keys.ESCAPE).build().perform();*/
        /*driver.findElement(By.cssSelector("input[class='slds-input']")).click();
        driver.findElement(By.cssSelector("input[class='slds-input']")).sendKeys(accountname);
        driver.findElement(By.xpath("//p/b[text()='Accounts']")).click();*/

    }

}
