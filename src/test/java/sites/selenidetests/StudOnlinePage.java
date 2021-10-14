package sites.selenidetests;

import com.codeborne.selenide.Condition;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class StudOnlinePage {

    public void aboutMeClick(){
        $(byXpath("//*[@id=\"under-slider-menu\"]/div/a[2]")).should(Condition.exist).click();
    }
    public void performanceClick(){
        $(byXpath("//*[@id=\"main-blocks\"]/div[1]/div[6]/a")).should(Condition.exist).click();
    }
    public void studCentreClick(){
        $(byXpath("//*[@id=\"main-blocks\"]/div[1]/div[7]/a/span")).should(Condition.exist).click();
    }
    public boolean rightPage(){
        return $(byText("Электронный университет")).exists();
    }
}
