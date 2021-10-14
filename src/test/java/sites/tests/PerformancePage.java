package sites.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PerformancePage {

    WebDriver driver;

    public PerformancePage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }

    public String getText(){
        return driver.findElement(By.xpath("//*[@id=\"slider\"]/div/h1")).getText();
    }
    public void logout(){
        driver.findElement(By.xpath("//*[@id=\"page\"]/header/a[1]")).click();
    }
}
