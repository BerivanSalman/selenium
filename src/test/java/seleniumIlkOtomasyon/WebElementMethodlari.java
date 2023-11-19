package seleniumIlkOtomasyon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class WebElementMethodlari {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.chrome.driver"," src/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // 1- testotomasyonu.com anasayfaya gidin
        driver.get("https://www.automationexercise.com");
        Thread.sleep(1000);

        //2- Sayfada 147 adet link bulundugunu test edin.(Birden fazla oldugu icin bir List olustururuz)
        List<WebElement> LinkElementleriList = driver.findElements(By.tagName("a"));
        int expectedLinkSayisi = 147;
        int actualLinkSayisi = LinkElementleriList.size();
        if (expectedLinkSayisi ==actualLinkSayisi)
        {
            System.out.println("Link sayisi testi Passed");
        }else {
            System.out.println("Link sayisi testi Failed");
            System.out.println("Actual link sayisi: " +actualLinkSayisi);
        }
        Thread.sleep(1000);

        //3-  Products linkine tiklayin
        driver.findElement(By.partialLinkText("Products")).click();
        Thread.sleep(1000);

        //4- special offer yazisinin gorundugunu test edin. (Test edecegim icin kaydetmem gerek)
        WebElement specialOfferElementi= driver.findElement(By.id("sale_image"));
        if (specialOfferElementi.isDisplayed()) {
            System.out.println("Special offer testi Passed");
        }else {
            System.out.println("Special offer testi failed");
        }

driver.quit();
        }
}
