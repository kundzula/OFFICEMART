package PageObject;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SearchPage {

    public SelenideElement
     searchButton=$(byClassName("fas"),1),
     inputField=$(byClassName("form_group")).$(byName("search")),
     sortByName=$(byClassName("prod_title")).$(withText("კალამი ბურთულიანი")),
    invalidDataSearch=$(byClassName("color_text")).$(byText("ვერაფერი მოიძებნა"));




    public ElementsCollection

            productCountSize=$$(byClassName("item"));


}
