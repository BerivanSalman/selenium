package seleniumIlkOtomasyon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethodları {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.chrome.driver", "src/resources/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.testotomasyonu.com");
        Thread.sleep(3000);

        driver.get("https://www.wisequarter.com");
        Thread.sleep(3000);

        //driver.get("www.youtube.com");
        //driver.get(); methodu https:// olmadan calısmaz
        driver.get("https://youtube.com");
        //www yazmadan calısabilir
        driver.close();
    }
}
