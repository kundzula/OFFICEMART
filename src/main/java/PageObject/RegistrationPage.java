package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class RegistrationPage {
    public SelenideElement
    send=$(byText("გაგზავნა")),
    iuridiuli=$(byText("იურიდიული პირი")),
            fizikuri=$(byText("ფიზიკური პირი")),
            namefield=$(by("style","border: 1px solid red;"),0),
    codefield=$(by("style","border: 1px solid red;"),1),
    addressfield=$(by("style","border: 1px solid red;"),2),
    phonenumberfield=$(by("style","border: 1px solid red;"),3),
    questionfield=$(by("style","border: 1px solid red;"),4),
    emailfield=$(by("style","border: 1px solid red;"),5),
    name=$(byClassName("form_group")).$(byName("name")),
    code=$(byText("საიდენტიფიკაციო კოდი")),
    address=$(byText("ფაქტიური მისამართი")),
    phone=$(byText("საკონტაქტო ნომერი")),
    quection=$(byText("როდის გსურთ შეკვეთის მიღება?")),
    email=$(byText("ელ.ფოსტა"));




}
