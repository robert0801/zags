package senla.robert.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.LocalDate;

public class AdminRegistrationDataPage extends BasePage {

    public AdminRegistrationDataPage(WebDriver driver) {
        super(driver);
    }

    private final By lastNameInput = By.id("TextInputField-1");
    private final By firstNameInput = By.id("TextInputField-2");
    private final By middleNameInput = By.id("TextInputField-3");
    private final By phoneNumberInput = By.cssSelector("[type='phone']");
    private final By passportNumberInput = By.xpath("//label[text()='Номер паспорта']/../../input");
    private final By birthdayInput = By.cssSelector("[type='date']");
    private final By continueBtn = By.xpath("//button[text()='Далее']");

    public void fillLastNameInput(String lastName) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(lastNameInput)).sendKeys(lastName);
    }

    public void fillFirstNameInput(String firstName) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(firstNameInput)).sendKeys(firstName);
    }

    public void fillMiddleNameInput(String middleName) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(middleNameInput)).sendKeys(middleName);
    }

    public void fillPhoneNumberInput(String phone) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(phoneNumberInput)).sendKeys(phone);
    }

    public void fillPassportNumberInput(String passportNumber) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(passportNumberInput)).sendKeys(passportNumber);
    }

    public void fillBirthdayInput(LocalDate birthday) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(birthdayInput)).sendKeys(String.valueOf(birthday.getDayOfMonth()));
        wait.until(ExpectedConditions.visibilityOfElementLocated(birthdayInput)).sendKeys(String.valueOf(birthday.getMonthValue()));
        wait.until(ExpectedConditions.visibilityOfElementLocated(birthdayInput)).sendKeys(String.valueOf(birthday.getYear()));
    }

    public void clickContinueBtn() {
        wait.until(ExpectedConditions.elementToBeClickable(continueBtn)).click();
    }
}
