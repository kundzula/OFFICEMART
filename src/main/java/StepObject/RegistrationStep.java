package StepObject;

import PageObject.RegistrationPage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

public class RegistrationStep extends RegistrationPage {
    @Step("იურიდიულ ფორმაზე არაფრის შევსებისას გაგზავნა ღილაკზე დაკლიკების შემთხვევაში")
    public RegistrationStep Regchek(){
        send.click();
        return this;
    }
    @Step("კომპანიის დასახელების ველში ჩავწერთ ნებისმიერ მნიშვნელობას და კვლავ დავაკლიკებთ გაგზავნა ღილაკს")
    public RegistrationStep Company(String n){
       name.setValue(n).pressEnter();
       return this;
    }

}
