package sites.yandextests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class MainPage {

    public void clickInitLogin(){
        if ($(byXpath("/html/body/div[1]/div/div/div[2]/a[2]")).is(Condition.visible)) {
            $(byXpath("/html/body/div[1]/div/div/div[2]/a[2]")).click();
        }
    }
    public void inputLogin(String login){
        if ($(byName("login")).is(Condition.visible)) {
            $(byName("login")).should(Condition.exist).val(login);
        }
    }
    public void clickCont(){
        if ($(byId("passp:sign-in")).is(Condition.visible)) {
            $(byId("passp:sign-in")).should(Condition.exist).click();
        }
    }
    public void inputPassword(String password){
        $(byName("passwd")).should(Condition.exist).val(password);
    }
    public void clickLogin(){
        $(byId("passp:sign-in")).click();
    }
    public void checkQuestion(){
        if ($(byName("question")).is(Condition.exist)) {
            $(byName("question")).val("Minecraft");
            $(byXpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div[2]/div[3]/div/div/div/div[1]/form/div[3]/button")).should(Condition.exist).click();
        }
    }
}
