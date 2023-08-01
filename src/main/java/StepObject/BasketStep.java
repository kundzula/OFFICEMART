package StepObject;

import PageObject.BasketPage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import java.time.Duration;

public class BasketStep extends BasketPage {
    @Step("კონკრეტული პროდუქტის კალათაში დამატების ღილაკზე დაჭერა")
    public BasketStep ChooseProduct(String name){
        searchButton.click();
        inputField.setValue(name).pressEnter();
        chooseProduct.click();
        Duration.ofMillis(5000);
        addBasket.shouldBe(Condition.visible);

        return this;
    }
    @Step("პროდუქტის დამატების შემდეგ კალათაში გადასვლა")
    public BasketStep GoToBasket(){
        goToBasket.click();
        correctproduct.shouldBe(Condition.visible);
        return this;
    }
    @Step("თუ გავზრდით კალათაში არსებული პროუქტის რაოდენობას პროპორციულად უნდა გაიზარდოს თითოეული ველის \"სულ\" მნიშვნელობა")
    public BasketStep Pricechek1(){
        increasenumber.click();
        System.out.println(price);
        System.out.println(bowl);
        return this;
    }
    @Step("შესაძლებელი უნდა იყოს კალათაში არსებული კონკრეტული პროდუქტის წაშლა, \"X\" ღილაკზე დაჭერით")
    public BasketStep EmptyBasket(){
        x.click();
        goToBasket.click();
        empty.shouldBe(Condition.visible);
        return this;
    }
    @Step("თუ რამდენიმე პროდუქტი გვაქვს კალათაში დამატებული შესაძლებელი უნდა იყოს მთლიანი კალათის გასუფთავება")
    public BasketStep ClearBasket(){
        prodact1.click();
        prodact2.click();
        prodact3.click();
        goToBasket.click();
        clearbasket.click();
        dasaxeleba.shouldNotBe(Condition.visible);
        return this;
    }
    @Step("კალათაში პროდუქტის დამატების შემდეგ გაგრძელება ღილაკზე დაჭერა")
    public BasketStep Continiu(){
        gagrdzeleba.click();

        return this;
    }
}

