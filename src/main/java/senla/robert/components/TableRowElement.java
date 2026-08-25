package senla.robert.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TableRowElement {

    private final WebElement rootElement;

    public TableRowElement(WebElement rootElement) {
        this.rootElement = rootElement;
    }

    private final By number = By.xpath(".//td[1]");

    public String getNumberValue() {
        return rootElement.findElement(number).getText();
    }
}
