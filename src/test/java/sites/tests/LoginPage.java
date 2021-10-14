package sites.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }

    public void clickInitLog(){
        driver.findElement(By.xpath("//*[@id=\"page\"]/header/a[1]")).click();
    }
    public void inputLogin(String login){
        driver.findElement(By.xpath("//*[@id=\"p_login\"]")).sendKeys(login);
    }
    public void inputPassword(String password){
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(password);
    }
    public void clickLogin(){
        driver.findElement(By.xpath("//*[@id=\"start-auth\"]")).click();
    }

}
