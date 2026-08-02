package senla.robert;

import net.datafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.LocalDate;
import java.util.Locale;

public class Main {
    static void main() {
        Faker faker = new Faker(Locale.of("ru_RU"));

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        LocalDate birthday = faker.timeAndDate().birthday();

        driver.get("https://user:senlatest@regoffice.senla.eu/");
        driver.findElement(By.xpath("//button[text()='Войти как администратор']")).click();
        driver.findElement(By.id("TextInputField-1")).sendKeys(faker.name().lastName());
        driver.findElement(By.id("TextInputField-2")).sendKeys(faker.name().firstName());
        driver.findElement(By.id("TextInputField-3")).sendKeys(faker.name().firstName());
        driver.findElement(By.cssSelector("[type='phone']")).sendKeys(faker.phoneNumber().phoneNumber());
        driver.findElement(By.xpath("//label[text()='Номер паспорта']/../../input")).sendKeys(faker.passport().valid());
        driver.findElement(By.cssSelector("[type='date']")).sendKeys(String.valueOf(birthday.getDayOfMonth()));
        driver.findElement(By.cssSelector("[type='date']")).sendKeys(String.valueOf(birthday.getMonthValue()));
        driver.findElement(By.cssSelector("[type='date']")).sendKeys(String.valueOf(birthday.getYear()));
        driver.findElement(By.xpath("//button[text()='Далее']")).click();

        driver.quit();
    }
}