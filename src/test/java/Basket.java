import StepObject.BasketStep;
import Utils.ChromeStarter;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;

import static DataObject.BasketData.bainder;
import static DataObject.BasketData.searchProduct;

public class Basket extends ChromeStarter {
    BasketStep basketStep=new BasketStep();
    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("უნდა გამოიტანოს შედეგი შეტყობინება: პროდუქტი წარმატებით დაემატა კალათაში")
    public void BasscetAdd(){
        basketStep.ChooseProduct(searchProduct);
        Assert.assertTrue(basketStep.addBasket.isDisplayed());
    }
    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("უნდა ჩანდეს დამატებული პროდუქტის დასახელება, ფერი,კოდი,რაოდენობა, ფასი, ჯამი")
    public void BasketChek(){
        basketStep.ChooseProduct(searchProduct)
                .GoToBasket();
        Assert.assertTrue(basketStep.correctproduct.isDisplayed());
        Assert.assertTrue(basketStep.color.isDisplayed());
        Assert.assertTrue(basketStep.code.isDisplayed());
        Assert.assertTrue(basketStep.quantity.isDisplayed());
        Assert.assertTrue(basketStep.price.isDisplayed());
        Assert.assertTrue(basketStep.bowl.isDisplayed());
    }

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("თუ გავზრდით კალათაში არსებული პროუქტის რაოდენობას პროპორციულად უნდა გაიზარდოს თითოეული ველის \"სულ\" მნიშვნელობა")
    public void IncreaseQuantity(){
        basketStep.ChooseProduct(searchProduct)
                .GoToBasket()
                .Pricechek1();
    }

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("პროდუქტი ქრება კალათიდან")
    public void ClearBasket(){
        basketStep.ChooseProduct(searchProduct)
                .GoToBasket()
                .EmptyBasket();
        Assert.assertTrue(basketStep.empty.isDisplayed());
    }

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("\"კალათის გასუფთავება\" ღილაკზე დაჭერით ყველა პროდუქტი ქრება კალათიდან")
    public void ClearAll(){
        basketStep.ChooseProduct(bainder)
                .ClearBasket();
        Assert.assertFalse(basketStep.dasaxeleba.isDisplayed());
        Assert.assertTrue(basketStep.empty.isDisplayed());
        Assert.assertFalse(basketStep.gagrdzeleba.isDisplayed());
        Assert.assertFalse(basketStep.clearbasket.isDisplayed());

    }
}
