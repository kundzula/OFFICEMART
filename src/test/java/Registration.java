import StepObject.BasketStep;
import StepObject.RegistrationStep;
import Utils.ChromeStarter;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;
import static DataObject.BasketData.searchProduct;
import static DataObject.RegistrationData.*;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.sleep;

public class Registration extends ChromeStarter {
    BasketStep basketStep=new BasketStep();
    RegistrationStep registrationStep=new RegistrationStep();
    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("18 ტესტი. უნდა გამოვიდეს ორი ფორმა \"იურიდიული პირები\" და \"ფიზიკური პირები\"")
    public void Chekregistration(){
        basketStep.ChooseProduct(searchProduct)
                .GoToBasket()
                .Continiu();
        sleep(1000);
        Assert.assertTrue(registrationStep.iuridiuli.isDisplayed());
        Assert.assertTrue(registrationStep.fizikuri.isDisplayed());
    }
     @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("19-24 ტესტი.უნდა გაწითლდეს ველი \"კომპანიის სახელწოდება\",საიდენტიფიკაციო კოდი,ფაქტიური მისამართი,საკონტაქტო ნომერი,როდის გსურთ შეკვეთის მიღება, ელექტრონული ფოსტის ველები")
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
    @Description("25 ტესტი. კომპანიის დასახელების ველი აღარ უნდა იყოს წითელი")
    public void CompanyField(){
        basketStep.ChooseProduct(searchProduct)
                .GoToBasket()
                .Continiu();
        registrationStep.Company(companyname);
        Assert.assertEquals(registrationStep.name.getCssValue("border-color"),blackcolor);



     }
    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("26 ტესტი. არ უნდა ჩაიწეროს ველში მნიშვნელობა")
    public void CodeField() {
        basketStep.ChooseProduct(searchProduct)
                .GoToBasket()
                .Continiu();
        registrationStep.Code(companycode);
        Assert.assertTrue(registrationStep.code.is(empty));
    }
    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("27 ტესტი. უნდა გაწითლდეს ველი \"საიდენტიფიკაციო კოდი\"")
    public void Chekcode() {
        basketStep.ChooseProduct(searchProduct)
                .GoToBasket()
                .Continiu();
        registrationStep.WrongCode(wrongcode);
        Assert.assertTrue(registrationStep.codefield.isEnabled());
    }

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("28 ტესტი. ველში მაინც უნდა ჩაიწეროს 9 სიმბოლო")
    public void Chekcode1() {
        basketStep.ChooseProduct(searchProduct)
                .GoToBasket()
                .Continiu();
        registrationStep.WrongCode1(incorrectcode);
       Assert.assertEquals(registrationStep.code.getValue(),correctcod);
    }
    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("29 ტესტი. ველში მაინც უნდა ჩაიწეროს 9 სიმბოლო ველი აღარ უნდა იყოს წითელი")
    public void Chekcode2() {
        basketStep.ChooseProduct(searchProduct)
                .GoToBasket()
                .Continiu();
        registrationStep.CorrectCode(correctcod);
        Assert.assertEquals(registrationStep.code.getCssValue("border-color"),blackcolor);
    }
    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("30 ტესტი. ფაქტიური მისამართის ველი აღარ უნდა იყოს წითელი")
    public void ChekAddress() {
        basketStep.ChooseProduct(searchProduct)
                .GoToBasket()
                .Continiu();
        registrationStep.Address(addresss);
        Assert.assertEquals(registrationStep.address.getCssValue("border-color"),blackcolor);
    }
    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("31 ტესტი. არ უნდა ჩაიწეროს ველში მნიშვნელობა")
    public void ChekPhone1() {
        basketStep.ChooseProduct(searchProduct)
                .GoToBasket()
                .Continiu();
        registrationStep.Phone1(incorrectphone1);
        Assert.assertTrue(registrationStep.phone.is(empty));
    }
    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("32 ტესტი. უნდა გაწითლდეს ველი \"საკონტაქტო ნომერი\"")
    public void ChekPhone2() {
        basketStep.ChooseProduct(searchProduct)
                .GoToBasket()
                .Continiu();
        registrationStep.Phone2(incorectphone2);
       /* String ph=$(byClassName("iur-phone")).getCssValue("border-color");
        System.out.println(ph);
        String hex= Color.fromString(ph).asHex();
        System.out.println(hex);// სხვადასხვა ჰექსი მოაქვს*/
        Assert.assertTrue(registrationStep.phonenumberfield.isEnabled());


    }
    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("33 ტესტი. ველში მაინც უნდა ჩაიწეროს 9 სიმბოლო")
    public void ChekPhone3() {
        basketStep.ChooseProduct(searchProduct)
                .GoToBasket()
                .Continiu();
        registrationStep.Phone3(incorrectphone3);
        Assert.assertEquals(registrationStep.phone.getValue(),correctphone);
    }

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("34 ტესტი. ველი აღარ უნდა იყოს წითელი")
    public void ChekPhone4() {
        basketStep.ChooseProduct(searchProduct)
                .GoToBasket()
                .Continiu();
        registrationStep.Phone4(correctphone);
        Assert.assertEquals(registrationStep.phone.getCssValue("border-color"),blackcolor);
    }
    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("35 ტესტი. ველი \"როდის გსურთ შეკვეთის მიღება?\" უნდა დარჩეს წითელი")
    public void QuectionCheck1() {
        basketStep.ChooseProduct(searchProduct)
                .GoToBasket()
                .Continiu();
        registrationStep.Quection1(quection1);
        Assert.assertTrue(registrationStep.questionfield.isEnabled());
    }
    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("36 ტესტი. ველი აღარ უნდა იყოს წითელი")
    public void QuectionCheck2() {
        basketStep.ChooseProduct(searchProduct)
                .GoToBasket()
                .Continiu();
        registrationStep.Quection1(quection2);
        Assert.assertEquals(registrationStep.quection.getCssValue("border-color"),blackcolor);
    }
    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("37 ტესტი. ველი აღარ უნდა იყოს წითელი ")
    public void EmailCheck1() {
        basketStep.ChooseProduct(searchProduct)
                .GoToBasket()
                .Continiu();
        registrationStep.Email1(correctemail);
        Assert.assertEquals(registrationStep.email.getCssValue("border-color"), blackcolor);
    }
    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("38 ტესტი. ველი \"ელ.ფოსტა\" უნდა დარჩეს წითელი")
    public void EmailCheck2() {
        basketStep.ChooseProduct(searchProduct)
                .GoToBasket()
                .Continiu();
        registrationStep.Email2(incorrectemail1);
        Assert.assertFalse(registrationStep.emailfield.is(visible));//არ აწითლებს ბაგია
    }
    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("39 ტესტი. ველი \"ელ.ფოსტა\" უნდა დარჩეს წითელი")
    public void EmailCheck3() {
        basketStep.ChooseProduct(searchProduct)
                .GoToBasket()
                .Continiu();
        registrationStep.Email3(incorrectemail2);
        Assert.assertFalse(registrationStep.emailfield.is(visible));//არ აწითლებს ბაგია
    }
    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("40 ტესტი. ველი \"ელ.ფოსტა\" უნდა დარჩეს წითელი")
    public void EmailCheck4() {
        basketStep.ChooseProduct(searchProduct)
                .GoToBasket()
                .Continiu();
        registrationStep.Email4(incorrectemail3);
        Assert.assertFalse(registrationStep.emailfield.is(visible));//არ აწითლებს ბაგია
    }
}

