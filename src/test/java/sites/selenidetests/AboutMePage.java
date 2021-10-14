package sites.selenidetests;

import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Step;
import java.io.File;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class AboutMePage {
    public boolean rightPage(){
        return WebDriverRunner.url().equals("https://shelly.kpfu.ru/e-ksu/new_stud_personal.stud_anketa");
    }
    @Step("Загрузка картинки на сайт")
    public void putPicture(){
        $(byXpath("//*[@id=\"info\"]/div/div[1]/div[1]/div[1]/form/div[1]/input")).uploadFile(new File("C:\\Users\\ANoctrum\\Downloads\\fyZhEe4AW7o.jpg"));
        $(byXpath("//*[@id=\"info\"]/div/div[1]/div[1]/div[1]/form/div[2]/input")).click();
    }
    @Step("Проверка наличия картинки")
    public boolean checkPicture(){
        return $(byXpath("//*[@id=\"info\"]/div/div[1]/div[1]/div[1]")).exists();
    }
    @Step("Удаление картинки")
    public void deletePicture(){
        $(byXpath("//*[@id=\"info\"]/div/div[1]/div[1]/div[2]/div[2]")).click();
        $(byXpath("//*[@id=\"answer\"]/a[1]")).click();
    }
}
