package sites.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class StudOnlinePage {

    WebDriver driver;

    public StudOnlinePage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }

    public void clickAboutMeBtn(){
        driver.findElement(By.xpath("//*[@id=\"under-slider-menu\"]/div/a[2]")).click();
    }
    public void clickPerformance(){
        driver.findElement(By.xpath("//*[@id=\"main-blocks\"]/div[1]/div[6]/a")).click();
    }
}
