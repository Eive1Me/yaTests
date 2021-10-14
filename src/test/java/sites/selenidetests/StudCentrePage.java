package sites.selenidetests;

import com.codeborne.selenide.Condition;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class StudCentrePage {
    public void docsClick(){
        $(byXpath("//*[@id=\"under-slider-menu\"]/div/a[8]/span")).should(Condition.exist).click();
    }
    public void exampleDocsClick(){
        $(byXpath("//*[@id=\"mCSB_1_container\"]/ul/li[1]/a")).should(Condition.exist).click();
    }
    public String getFile(){
        File f = null;
        String fStr = null;
        try {
            f = $(byXpath("//*[@id=\"tab1\"]/p[3]/a")).download();
            fStr = FileUtils.readFileToString(f, "Windows-1251");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return fStr;
    }
}
