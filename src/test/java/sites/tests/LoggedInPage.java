package sites.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoggedInPage {

    WebDriver driver;

    public LoggedInPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public String getUserName() {
        return driver.findElement(By.xpath("//*[@id=\"user_name\"]")).getText();
    }
    public void entryMenu() {
        driver.findElement(By.xpath("//*[@id=\"user_name\"]")).click();
    }
    public void userLogout() {
        driver.findElement(By.xpath("//*[@id=\"page\"]/header/ul[1]/li/ul/li[2]/a")).click();
    }
    public void clickMenu() {
        driver.findElement(By.xpath("//*[@id=\"links\"]/a[5]")).click();
    }
    public void clickStudOnline(){
        driver.findElement(By.xpath("//*[@id=\"page\"]/header/ul[1]/li/ul/li[1]/a")).click();
    }

}
