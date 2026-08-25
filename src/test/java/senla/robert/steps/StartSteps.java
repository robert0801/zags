package senla.robert.steps;

import org.openqa.selenium.WebDriver;
import senla.robert.pages.StartPage;

public class StartSteps {

    private StartPage startPage;

    public StartSteps(WebDriver driver) {
        startPage = new StartPage(driver);
    }

    public void openStartPage() {
        startPage.openStartPage();
    }

    public void clickEnterAsAdminBtn() {
        startPage.clickEnterAsAdminBtn();
    }
}
