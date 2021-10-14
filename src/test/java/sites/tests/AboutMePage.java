package sites.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AboutMePage {

    WebDriver driver;

    public AboutMePage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }

    public String getFio(){
        return driver.findElement(By.xpath("//*[@id=\"info\"]/div/div[1]/div[2]/div[2]/span[2]")).getText();
    }
    public void logout(){
        driver.findElement(By.xpath("//*[@id=\"page\"]/header/a[1]")).click();
    }
}
