package senla.robert.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class StartPage extends BasePage {

    public StartPage(WebDriver driver) {
        super(driver);
    }

    private final By enterAsAdminBtn = By.xpath("//button[text()='Войти как администратор']");

    public void clickEnterAsAdminBtn() {
        wait.until(ExpectedConditions.elementToBeClickable(enterAsAdminBtn)).click();
    }

    public void openStartPage() {
        driver.get("https://user:senlatest@regoffice.senla.eu/");
    }
}
