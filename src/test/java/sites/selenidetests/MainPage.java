package sites.selenidetests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.WebDriverRunner;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {

    public void clickInitLogin(){
        $(byXpath("//*[@id=\"top-panel\"]/div[1]/div[1]/a")).click();
    }
    public void inputLogin(String login){
        $(byName("p_login")).should(Condition.exist).val(login);
    }
    public void inputPassword(String password){
        $(byName("p_pass")).should(Condition.exist).val(password);
    }
    public void clickLogin(){
        $(byXpath("//*[@id=\"eu_enter\"]/input[3]")).click();
    }
    public boolean rightPage(){
        return WebDriverRunner.url().equals("https://kpfu.ru/");
    }
}
