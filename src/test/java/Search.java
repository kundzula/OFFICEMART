import StepObject.SearchStep;
import Utils.ChromeStarter;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class Search extends ChromeStarter {
    SearchStep searchStep=new SearchStep();
    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("საძიებო ღილაკზე დაკლიკებით უნდა გამოვიდეს ჩასაწერი ველი")
    public void SearchButton(){
        searchStep.SearchPage();
        Assert.assertTrue(searchStep.inputField.isDisplayed());

    }
}
