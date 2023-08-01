package StepObject;

import PageObject.SearchPage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.openqa.selenium.support.ui.Sleeper;

import static DataObject.SearchData.correctSearchProduct;
import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;

public class SearchStep extends SearchPage {
    @Step("საძიებო ღილაკზე დაკლიკებით უნდა გამოვიდეს ჩასაწერი ველი")
    public SearchStep SearchPage(){
        searchButton.click();
        inputField.shouldBe(Condition.visible);
        return this;

    }
    @Step ("საძიებო ველში სწორი მონაცემებით ძებნა: {correctSearchProduct}")
    public SearchStep CorrectProduct(String name){
        searchButton.click();
        inputField.setValue(name).pressEnter();
        int prodactCount=productCountSize.size();
        System.out.println(prodactCount);
        String prodactName=sortByName.getText();
        String firstName=prodactName;
        System.out.println(firstName);
        for (int i=1; i<prodactCount; i++){
            String secondname=$(byClassName("prod_title"),i).$(withText("კალამი ბურთულიანი")).getText();
            String SecondName=secondname;
            System.out.println(SecondName);
        }
        return this;

    }
    @Step("საძიებო ველში არასწორი მონაცემებით ძებნა (მაგ: satesto)")
    public SearchStep IncirrectProduct (String secondname){
        searchButton.click();
        inputField.setValue(secondname).pressEnter();
        invalidDataSearch.isDisplayed();
        return this;
    }

}
