import StepObject.SearchStep;
import Utils.ChromeStarter;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import java.time.Duration;

import static DataObject.SearchData.correctSearchProduct;
import static DataObject.SearchData.incorrectSearchProduct;


public class Search extends ChromeStarter {
    SearchStep searchStep=new SearchStep();
    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("გამოდის ჩასაწერი ველი")
    public void SearchButton(){
        searchStep.SearchPage();
        Assert.assertTrue(searchStep.inputField.isDisplayed());

    }
    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("დაბრუნებული მონაცემების სახელებში უნდა იყოს ძებნისას გადაცემული სიტყვა")
      public void SortByName(){
        searchStep.CorrectProduct(correctSearchProduct);
        Assert.assertTrue(searchStep.sortByName.isDisplayed());

    }

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("უნდა გამოიტანოს შედეგი ტექსტით: საძიებო სიტყვა satesto ვერაფერი მოიძებნა")
    public void IncorrectName(){
        searchStep.IncirrectProduct(incorrectSearchProduct);
        Assert.assertFalse(searchStep.invalidDataSearch.isDisplayed());

    }
}


