package Practice.Day02;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class C01 {
    public static void main(String[] args) {

        //http://babayigit.net/testdocs/ adresine git
        //INFO FORM butonuna tikla
        //Form verileri gir
        //Save butonuna tikla
        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://babayigit.net/testdocs/");
        driver.findElement(By.xpath("//*[@src='img/info.png']")).click();
        Actions actions = new Actions(driver);
        WebElement veriler = driver.findElement(By.id("firstName"));
        actions.click(veriler).sendKeys("Berivan").sendKeys(Keys.TAB)
                .sendKeys("Salman").sendKeys(Keys.TAB)
                .sendKeys("bberivansalman@gmail.com")
                .sendKeys(Keys.TAB)
                .sendKeys("4433666").sendKeys(Keys.TAB)
                .sendKeys("14").sendKeys(Keys.TAB)
                .sendKeys("ogretmen").perform();
        driver.findElement(By.id("female")).click();
        WebElement city = driver.findElement(By.id("city"));
        actions.click(city).sendKeys("ankara").sendKeys(Keys.TAB)
                .sendKeys("TURKEY").sendKeys(Keys.TAB).click().perform();

    }
}
