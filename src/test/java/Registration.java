import StepObject.BasketStep;
import StepObject.RegistrationStep;
import Utils.ChromeStarter;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

import static DataObject.BasketData.searchProduct;
import static DataObject.RegistrationData.companyname;

public class Registration extends ChromeStarter {
    BasketStep basketStep=new BasketStep();
    RegistrationStep registrationStep=new RegistrationStep();
    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("უნდა გამოვიდეს ორი ფორმა \"იურიდიული პირები\" და \"ფიზიკური პირები\"")
    public void Chekregistration(){
        basketStep.ChooseProduct(searchProduct)
                .GoToBasket()
                .Continiu();
        Assert.assertTrue(registrationStep.iuridiuli.isEnabled());
        Assert.assertTrue(registrationStep.fizikuri.isEnabled());
    }
     @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("უნდა გაწითლდეს ველი \"კომპანიის სახელწოდება\",საიდენტიფიკაციო კოდი,ფაქტიური მისამართი,საკონტაქტო ნომერი,როდის გსურთ შეკვეთის მიღება, ელექტრონული ფოსტის ველები")
    public void Emptyfield(){
        basketStep.ChooseProduct(searchProduct)
                 .GoToBasket()
                 .Continiu();
        registrationStep.Regchek();
         Assert.assertTrue(registrationStep.namefield.isEnabled());
         Assert.assertTrue(registrationStep.codefield.isEnabled());
         Assert.assertTrue(registrationStep.addressfield.isEnabled());
         Assert.assertTrue(registrationStep.phonenumberfield.isEnabled());
         Assert.assertTrue(registrationStep.questionfield.isEnabled());
         Assert.assertTrue(registrationStep.emailfield.isEnabled());
     }
     @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("კომპანიის დასახელების ველი აღარ უნდა იყოს წითელი")
    public void CompanyField(){
        basketStep.ChooseProduct(searchProduct)
                .GoToBasket()
                .Continiu();
        registrationStep.Company(companyname);
        Assert.assertFalse(registrationStep.namefield.isDisplayed());



     }
}
