import StepObject.SearchStep;
import Utils.ChromeStarter;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;
import static DataObject.SearchData.correctSearchProduct;
import static DataObject.SearchData.incorrectSearchProduct;


public class Search extends ChromeStarter {
    SearchStep searchStep=new SearchStep();
    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("1 ტესტი. გამოდის ჩასაწერი ველი")
    public void SearchButton(){
        searchStep.Searchpage();
        Assert.assertTrue(searchStep.inputField.isDisplayed());

    }
    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("2 ტესტი. დაბრუნებული მონაცემების სახელებში უნდა იყოს ძებნისას გადაცემული სიტყვა")
      public void SortByName(){
        searchStep.CorrectProduct(correctSearchProduct);
        Assert.assertTrue(searchStep.sortByName.isDisplayed());

    }

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("3 ტესტი.უნდა გამოიტანოს შედეგი ტექსტით: საძიებო სიტყვა satesto ვერაფერი მოიძებნა")
    public void IncorrectName(){
        searchStep.Incirrectproduct(incorrectSearchProduct);
        Assert.assertFalse(searchStep.invalidDataSearch.isDisplayed());

    }
}


