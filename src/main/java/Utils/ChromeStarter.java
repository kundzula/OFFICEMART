package Utils;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Selenide.open;

public class ChromeStarter {


    @BeforeMethod(description = "ბრაუზერის გამართვა და გახსნა")
    public static void setUp() {
        SelenideLogger.addListener("allure", new AllureSelenide().screenshots(true).savePageSource(false));
        System.setProperty("selenide.browserSize", "1920x1080");
        open("https://officemart.ge/");

    }


    @AfterMethod(description = "ქეშის გასუფთავება და ბრაუზერის დახურვა")
    public void tearDown() {
        Selenide.clearBrowserCookies();
        Selenide.clearBrowserLocalStorage();
        Selenide.closeWindow();
        Selenide.closeWebDriver();
        SelenideLogger.removeListener("allure");


    }
}