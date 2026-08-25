package senla.robert.tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import senla.robert.drivers.WebDriverUtil;
import senla.robert.modal.AdminRegistrationData;
import senla.robert.steps.AdminSteps;
import senla.robert.steps.StartSteps;
public class AdminLoginTest {

    private AdminSteps adminSteps;
    private StartSteps startSteps ;

    @BeforeEach
    void setUp() {
        adminSteps = new AdminSteps(WebDriverUtil.getDriver());
        startSteps = new StartSteps(WebDriverUtil.getDriver());
    }

    @Test
    @DisplayName("Login as administrator")
    void loginAsAdministrator() {
        var adminData = AdminRegistrationData.randomAdminRegistrationData();

        startSteps.openStartPage();
        startSteps.clickEnterAsAdminBtn();

        adminSteps.fillAdminRegistrationData(adminData);
        adminSteps.clickContinueBtn();

        adminSteps.checkThatListOfRequestsPageIsDisplayed();
    }

    @AfterEach
    void quitBrowser() {
        WebDriverUtil.quitDriver();
    }
}
