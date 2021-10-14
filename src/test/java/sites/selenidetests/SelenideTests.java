package sites.selenidetests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.junit.Assert.assertTrue;

public class SelenideTests {

    @BeforeClass
    public static void setup(){
        System.setProperty("webdriver.chrome.driver", "/Users/ANoctrum/Downloads/chromedriver.exe");
        Configuration.browser = "chrome";
    }

    @Before
    public void loadStartPage(){
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(true));
        open("https://kpfu.ru/");
        MainPage mainPage = new MainPage();
        mainPage.clickInitLogin();
        mainPage.inputLogin("EMZadorkina");
        mainPage.inputPassword("8zj7hpyb");
        mainPage.clickLogin();
    }

    @Test
    public void checkLogin(){
        StudOnlinePage studOnlinePage = new StudOnlinePage();

        assertTrue(studOnlinePage.rightPage());
    }

    @Test
    public void aboutMeTest(){
        StudOnlinePage studOnlinePage = new StudOnlinePage();
        AboutMePage aboutMePage = new AboutMePage();

        studOnlinePage.aboutMeClick();
        assertTrue(aboutMePage.rightPage());
    }

    @Test
    public void performanceTest(){
        StudOnlinePage studOnlinePage = new StudOnlinePage();
        PerformancePage performancePage = new PerformancePage();

        studOnlinePage.performanceClick();
        assertTrue(performancePage.rightPage());
    }

    @Test
    public void docTest(){
        StudOnlinePage studOnlinePage = new StudOnlinePage();
        StudCentrePage studCentrePage = new StudCentrePage();

        studOnlinePage.studCentreClick();
        studCentrePage.docsClick();
        studCentrePage.exampleDocsClick();
        assertTrue(studCentrePage.getFile().contains("Задоркиной Евангелины Михайловны"));
    }

    @Test
    public void pictureTest(){
        StudOnlinePage studOnlinePage = new StudOnlinePage();
        AboutMePage aboutMePage = new AboutMePage();

        studOnlinePage.aboutMeClick();
        aboutMePage.putPicture();
        assertTrue(aboutMePage.checkPicture());
        aboutMePage.deletePicture();
    }

    @After
    public void logOut(){
        $(byText("Выход")).should(Condition.exist).click();
    }
}
