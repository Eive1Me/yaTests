package sites.yandextests;

import com.codeborne.selenide.Condition;

import java.time.Duration;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class ManagePage {
    public void inputMail(){
        $(byCssSelector("#nb-4")).should(Condition.exist, Duration.ofMillis(3000)).val("evangelzm@gmail.com");
    }
    public void invite(){
        $(byCssSelector("#nb-5 > span")).click();
    }
    public boolean checkAdd(){
        return $(byXpath("//*[@id=\"nb-1\"]/body/div[6]/div[2]/div/div/div/div/div/div/div/div/div/div[4]/div/div/div[1]/div/div[1]/span/span[2]/span"))
                .getText().contains("evangelzm@gmail.com");
    }
    public void closeWindow(){
        $(byXpath("//*[@id=\"nb-1\"]/body/div[3]/div[2]/div/div/div/div/button")).click();
    }
}
