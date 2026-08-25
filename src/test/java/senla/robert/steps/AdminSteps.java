package senla.robert.steps;

import org.openqa.selenium.WebDriver;
import senla.robert.modal.AdminRegistrationData;
import senla.robert.pages.AdminRegistrationDataPage;
import senla.robert.pages.ListOfRequestsPage;

import static org.junit.jupiter.api.Assertions.*;

public class AdminSteps {

    private final AdminRegistrationDataPage adminRegistrationDataPage;
    private final ListOfRequestsPage listOfRequestsPage;

    public AdminSteps(WebDriver driver) {
        adminRegistrationDataPage = new AdminRegistrationDataPage(driver);
        listOfRequestsPage = new ListOfRequestsPage(driver);
    }

    public void fillAdminRegistrationData(AdminRegistrationData data) {
        adminRegistrationDataPage.fillLastNameInput(data.lastName());
        adminRegistrationDataPage.fillFirstNameInput(data.firstName());
        adminRegistrationDataPage.fillMiddleNameInput(data.middleName());
        adminRegistrationDataPage.fillPhoneNumberInput(data.phoneNumber());
        adminRegistrationDataPage.fillPassportNumberInput(data.passportNumber());
        adminRegistrationDataPage.fillBirthdayInput(data.birthday());
    }

    public void clickContinueBtn() {
        adminRegistrationDataPage.clickContinueBtn();
    }

    public void checkThatListOfRequestsPageIsDisplayed() {
        assertAll(
                () -> assertTrue(listOfRequestsPage.isTableDisplayed()),
                () -> assertFalse(listOfRequestsPage.getTableRowElements().isEmpty())
        );
    }
}
