package senla.robert.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import senla.robert.components.TableRowElement;

import java.util.List;

public class ListOfRequestsPage extends BasePage {

    public ListOfRequestsPage(WebDriver driver) {
        super(driver);
    }

    private final By table = By.cssSelector("[class*='MuiTableContainer-root']");

    public List<TableRowElement> getTableRowElements() {
        return driver.findElements(By.cssSelector("table > tr[class*='MuiTableRow-root']"))
                .stream().map(TableRowElement::new)
                .toList();
    }

    public boolean isTableDisplayed() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(table)).isDisplayed();
    }
}
