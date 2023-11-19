package seleniumIlkOtomasyon;

import Utilities.ReusableMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Question1 {
    public static void main(String[] args) throws InterruptedException {
        //1- Bir test class’i olusturun ilgili ayarlari yapin
        System.setProperty("Webdriver.chrome.driver", "src/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //2- https://www.automationexercise.com/ adresine gidin
        driver.get("https://www.automationexercise.com/ ");
        Thread.sleep(2000);
        //3- Category bolumundeki elementleri locate edin
        List<WebElement> kategoriler = driver.findElements(By.className("panel-title"));
        //4- Category bolumunde 3 element oldugunu test edin
        int expectedElementSayisi = 3;
        int actualElementSayisi = kategoriler.size();
        if (expectedElementSayisi == kategoriler.size()) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }
        //5- Category isimlerini yazdirin
        System.out.println(ReusableMethods.stringListeDonustur(kategoriler));
        //6- Sayfayi kapatin
        driver.quit();
    }
}
