package StepObject;

import PageObject.SearchPage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.openqa.selenium.support.ui.Sleeper;

public class SearchStep extends SearchPage {
    @Step("საძიებო ღილაკზე დაკლიკებით უნდა გამოვიდეს ჩასაწერი ველი")
    public SearchStep SearchPage(){
        searchButton.click();
        inputField.shouldBe(Condition.visible);
        return this;

    }
}
