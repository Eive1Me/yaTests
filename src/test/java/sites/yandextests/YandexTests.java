package sites.yandextests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.junit.Assert.assertTrue;

public class YandexTests {

    @BeforeClass
    public static void setup(){
        System.setProperty("webdriver.chrome.driver", "/Users/ANoctrum/Downloads/chromedriver.exe");
        Configuration.browser = "chrome";
    }

    @Before
    public void loadStartPage(){
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(true));
        open("https://disk.yandex.com/");
        MainPage mainPage = new MainPage();
        mainPage.clickInitLogin();
        mainPage.inputLogin("***");
        mainPage.clickCont();
        mainPage.inputPassword("***");
        mainPage.clickLogin();
        mainPage.checkQuestion();
    }

    @Test
    public void checkLogin(){
        MailPage mailPage = new MailPage();
        assertTrue(mailPage.checkPage());
    }

    @Test
    public void addUserTest(){
        MailPage mailPage = new MailPage();
        ManagePage managePage = new ManagePage();
        mailPage.clickFolder();
        mailPage.manageClick();
        managePage.inputMail();
        managePage.invite();
        //assertTrue(managePage.checkAdd());
        managePage.closeWindow();
    }

    @After
    public void logOut(){
        $(byXpath("//*[@id=\"app\"]/div/div/div[1]/div[3]/div/div/a[1]/div/img")).should(Condition.exist).click();
        $(byXpath("//*[@id=\"app\"]/div/div/div[1]/div[3]/div/div/div/ul/ul/li[6]/a")).should(Condition.exist).click();
    }
}
