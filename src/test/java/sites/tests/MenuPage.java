package sites.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class MenuPage {

    WebDriver driver;

    public MenuPage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }

    public void clickStudOnline(){
        driver.findElement(By.xpath("//*[@id=\"page\"]/header/ul[1]/li/ul/li[1]/a")).click();
    }
}
