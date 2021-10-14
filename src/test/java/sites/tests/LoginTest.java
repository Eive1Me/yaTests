package sites.tests;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class LoginTest {

    public static LoginPage loginPage;
    public static LoggedInPage loggedInPage;
    public static WebDriver driver;
    private String login = "EMZadorkina", password = "8zj7hpyb";

    @BeforeClass
    public static void setup(){
        System.setProperty("webdriver.chrome.driver", "/Users/ANoctrum/Downloads/chromedriver.exe");
        //System.setProperty("webdriver.chrome.driver", "/Users/Eva/Downloads/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); //неявное ожидание
        driver.get("https://students.kpfu.ru/");

        loginPage = new LoginPage(driver);
        loggedInPage = new LoggedInPage(driver);
    }

    //@Test
    public void loginTest() {
        loginPage.clickInitLog();
        loginPage.inputLogin(login);
        loginPage.inputPassword(password);
        loginPage.clickLogin();

        Assert.assertEquals("Е. Задоркина", loggedInPage.getUserName());
    }

    @AfterClass
    public static void tearDown(){
        loggedInPage.entryMenu();
        loggedInPage.userLogout();
        driver.quit();
    }

}
