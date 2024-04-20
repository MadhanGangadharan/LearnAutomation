package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Loginmainclass {
    WebDriver driver =new ChromeDriver();

    public void loadurl(String url){
        driver.get(url);

    }
    public void enterUsername(String userName, String passWord){
        driver.findElement(By.id("username")).sendKeys(userName);
        driver.findElement(By.id("password")).sendKeys(passWord);
    }
    public void clickLoginbutton(){
        driver.findElement(By.id("Login")).click();
    }

}
