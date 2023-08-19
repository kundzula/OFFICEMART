package StepObject;

import PageObject.RegistrationPage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;


public class RegistrationStep extends RegistrationPage {
    @Step("იურიდიულ ფორმაზე არაფრის შევსებისას გაგზავნა ღილაკზე დაკლიკების შემთხვევაში")
    public RegistrationStep Regchek() {
        send.click();
        return this;
    }

    @Step("კომპანიის დასახელების ველში ჩავწერთ ნებისმიერ მნიშვნელობას და კვლავ დავაკლიკებთ გაგზავნა ღილაკს")
    public RegistrationStep Company(String n) {
        name.setValue(n).pressEnter();
        return this;
    }

    @Step("იურიდიული პირის ფორმაზე ველში \"საიდენტიფიკაციო კოდი\" ტექსტური ტიპის მონაცემის შეყვანისას")
    public RegistrationStep Code(String n) {
        code.setValue(n).pressEnter();
        return this;
    }

    @Step("იურიდიული პირის ფორმაზე ველში \"საიდენტიფიკაციო კოდი\" თუ შევიყვანთ 9 სიმბოლოზე ნაკლებ რიცხვით მნიშვნელობას და დავაჭერთ გაგზავნა ღილაკს")
    public RegistrationStep WrongCode(String n) {
        code.setValue(n).pressEnter();
        return this;
    }

    @Step("იურიდიული პირის ფორმაზე ველში \"საიდენტიფიკაციო კოდი\" თუ შევიყვანთ მაგ 12 სიმბოლს")
    public RegistrationStep WrongCode1(String n) {
        code.setValue(n).pressEnter();
        return this;
    }

    @Step("იურიდიული პირის ფორმაზე ველში \"საიდენტიფიკაციო კოდი\" თუ შევიყვანთ მაგ 9 სიმბოლს")
    public RegistrationStep CorrectCode(String n) {
        code.setValue(n).pressEnter();
        return this;
    }

    @Step("თუ ფაქტიური მისამართის ველში ჩავწერთ ნებისმიერ მნიშვნელობას და კვლავ დავაკლიკებთ გაგზავნა ღილაკს")
    public RegistrationStep Address(String n) {
        address.setValue(n).pressEnter();
        return this;
    }

    @Step("იურიდიული პირის ფორმაზე ველში \"საკონტაქტო ნომერი\" ტექტსური ტიპის მონაცემის შეყვანა")
    public RegistrationStep Phone1(String n) {
        phone.setValue(n).pressEnter();
        return this;
    }

    @Step("იურიდიული პირის ფორმაზე ველში \"საკონტაქტო ნომერი\" თუ შევიყვანთ 9 სიმბოლოზეზე ნაკლებ რიცხვით მნიშნელობას და დავაჭერთ გაგზავნა ღილაკს")
    public RegistrationStep Phone2(String n) {
        phone.setValue(n).pressEnter();
        return this;
    }

    @Step("იურიდიული პირის ფორმაზე ველში \"საკონტაქტო ნომერი\" შევიყვანთ 12 სიმბოლოს")
    public RegistrationStep Phone3(String n) {
        phone.setValue(n).pressEnter();
        return this;
    }

    @Step("იურიდიული პირის ფორმაზე ველში \"საკონტაქტო ნომერი\" შევიყვანთ 9 სიმბოლოს")
    public RegistrationStep Phone4(String n) {
        phone.setValue(n).pressEnter();
        return this;
    }

    @Step("იურიდიული პირის ფორმაზე ველში \"საკონტაქტო ნომერი\" შევიყვანთ 9 სიმბოლოს")
    public RegistrationStep Quection1(String n) {
        quection.setValue(n).pressEnter();
        return this;
    }

    @Step("იურიდიულ ფორმაზე არაფრის შევსებისას გაგზავნა ღილაკზე დაკლიკებისას ველი \"როდის გსურთ შეკვეთის მიღება?\" წითლდება თუ ჩავწერთ ნებისმიერ მნიშვნელობას რომელიც 5 სიმბოლოზე მეტია")
    public RegistrationStep Quection2(String n) {
        quection.setValue(n).pressEnter();
        return this;
    }

    @Step("იურიდიულ ფორმაზე არაფრის შევსებისას გაგზავნა ღილაკზე დაკლიკებისას ველი \"ელ.ფოსტა\" წითლდება თუ ჩავწერთ მეილისთვის დასაშვებ ფორმატში მნიშვნელობას test@gmail.com მაგალითად ")
    public RegistrationStep Email1(String n) {
        email.setValue(n).pressEnter();
        return this;
    }

    @Step("იურიდიულ ფორმაზე არაფრის შევსებისას გაგზავნა ღილაკზე დაკლიკებისას ველი \"ელ.ფოსტა\" წითლდება თუ ჩავწერთ მეილისთვის დასაშვებ ფორმატში მნიშვნელობას test@gmail.com მაგალითად ")
    public RegistrationStep Email2(String n) {
        email.setValue(n).pressEnter();
        return this;
    }

    @Step("იურიდიულ ფორმაზე არაფრის შევსებისას გაგზავნა ღილაკზე დაკლიკებისას ველი \"ელ.ფოსტა\" წითლდება თუ ჩავწერთ მეილისთვის დაუშვებელ ფორმატს test@gmail")
    public RegistrationStep Email3(String n) {
        email.setValue(n).pressEnter();
        return this;
    }

    @Step("იურიდიულ ფორმაზე არაფრის შევსებისას გაგზავნა ღილაკზე დაკლიკებისას ველი \"ელ.ფოსტა\" წითლდება თუ ჩავწერთ მეილისთვის დაუშვებელ ფორმატს test.gmail@")
    public RegistrationStep Email4(String n) {
        email.setValue(n).pressEnter();
        return this;
    }
}
