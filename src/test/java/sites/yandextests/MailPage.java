package sites.yandextests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.WebDriverRunner;

import java.time.Duration;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class MailPage {

    public void clickFolder(){
        $(byXpath("//*[@id=\"app\"]/div/div/div[3]/div[2]/div[3]/div/div/div[3]/div/div[1]")).contextClick();
    }
    public void manageClick() {
        $(byCssSelector(".resources-actions-popup__action_type_share-access")).should(Condition.exist,Duration.ofMillis(5000)).click();
    }
    public boolean checkPage(){
        $(byXpath("//*[@id=\"app\"]/div/div/div[1]/div[3]/div/div/a[1]/div/img")).should(Condition.exist, Duration.ofMillis(3000));
        return WebDriverRunner.url().contains("https://disk.yandex.com/client");
    }
}
