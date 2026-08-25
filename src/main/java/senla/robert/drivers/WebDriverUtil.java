package senla.robert.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public final class WebDriverUtil {

    private static WebDriver driver;

    private WebDriverUtil() {
    }

    public static WebDriver getDriver() {
        if (driver == null) {
            initDriver();
        }
        return driver;
    }

    private static void initDriver() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public static void quitDriver() {
        driver.quit();
    }
}
