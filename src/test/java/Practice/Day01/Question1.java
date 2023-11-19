package Practice.Day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Question1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.chrome.driver", "src/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        //Open google home page https://www.google.com
        driver.get("https://www.google.com");
        Thread.sleep(1000);
        //On the same class, navigate to amazon home page https://www.amazon.com
        driver.navigate().to(" https://www.amazon.com ");
        //Wait about 4 sn
        Thread.sleep(2000);
        //and navigate back to google
        driver.navigate().back();
        Thread.sleep(1000);
        //Navigate forward to amazon
        driver.navigate().forward();
        Thread.sleep(1000);
        //Refresh page
        driver.navigate().refresh();
        Thread.sleep(1000);
        //Close/quit the browser
        driver.close();
        //And Last step print "All is well" on console
        System.out.println("All is well");
    }
}
