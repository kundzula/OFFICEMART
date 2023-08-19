package StepObject;

import PageObject.BasketPage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.testng.Assert;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.sleep;

public class BasketStep extends BasketPage {
    @Step("კონკრეტული პროდუქტის კალათაში დამატების ღილაკზე დაჭერა")
    public BasketStep ChooseProduct(String name) {
        searchButton.click();
        inputField.setValue(name).pressEnter();
        chooseProduct.click();
        Duration.ofMillis(5000);
        addBasket.shouldBe(Condition.visible);

        return this;
    }

    @Step("პროდუქტის დამატების შემდეგ კალათაში გადასვლა")
    public BasketStep GoToBasket() {
        goToBasket.click();
        correctproduct.shouldBe(Condition.visible);
        return this;
    }

    @Step("თუ გავზრდით კალათაში არსებული პროუქტის რაოდენობას პროპორციულად უნდა გაიზარდოს თითოეული ველის \"სულ\" მნიშვნელობა")
    public BasketStep Pricechek1() {
        increasenumber.click();
        String count1 = quantity.getValue();
        String price1 = price.getText().replaceAll("A", "");
        String bowl1 = bowl.getText();
        int count2 = Integer.parseInt(count1);
        float price2 = Float.parseFloat(price1);
        float bowl2 = Float.parseFloat(bowl1);
        System.out.println(count2);
        System.out.println(price2);
        System.out.println(bowl2);
        if (bowl2 == count2 * price2) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        Assert.assertTrue(bowl2 == count2 * price2);
        return this;
    }

    @Step("თუ შევამცირებთ კალათაში არსებული პროუქტის რაოდენობას პროპორციულად უნდა შემცირდეს თითოეული ველის \"სულ\" მნიშვნელობა")
    public BasketStep Pricechek2() {
        decreasenumber.click();
        String count1 = quantity.getValue();
        String price1 = price.getText().replaceAll("A", "");
        String bowl1 = bowl.getText();
        int count2 = Integer.parseInt(count1);
        float price2 = Float.parseFloat(price1);
        float bowl2 = Float.parseFloat(bowl1);
        System.out.println(count2);
        System.out.println(price2);
        System.out.println(bowl2);
        if (bowl2 == count2 * price2) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        Assert.assertTrue(bowl2 == count2 * price2);
        return this;
    }

    @Step("შესაძლებელი უნდა იყოს კალათაში არსებული კონკრეტული პროდუქტის წაშლა, \"X\" ღილაკზე დაჭერით")
    public BasketStep EmptyBasket() {
        x.click();
        goToBasket.click();
        empty.shouldBe(Condition.visible);
        return this;
    }

    @Step("თუ რამდენიმე პროდუქტი გვაქვს კალათაში დამატებული შესაძლებელი უნდა იყოს მთლიანი კალათის გასუფთავება")
    public BasketStep ClearBasket() {
        prodact1.click();
        prodact2.click();
        prodact3.click();
        goToBasket.click();
        clearbasket.click();
        dasaxeleba.shouldNotBe(Condition.visible);
        return this;
    }

    @Step("კალათაში პროდუქტის დამატების შემდეგ გაგრძელება ღილაკზე დაჭერა")
    public BasketStep Continiu() {
        gagrdzeleba.click();
        return this;
    }
}

