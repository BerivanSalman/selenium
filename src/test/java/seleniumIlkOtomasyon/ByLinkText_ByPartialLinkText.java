package seleniumIlkOtomasyon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ByLinkText_ByPartialLinkText {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        // testotomasyonu.com anasayfaya gidin
        driver.get("https://www.testotomasyonu.com");
        Thread.sleep(1000);
        // shoes linkine tiklayin
        /* driver.findElement(By.linkText("Shoes")).click(); Bunu yazdıgımızda gider Shoes linkini bulur
         driver.findElement(By.linkText("hoes")).click();
        eger By.linkText() kullanirsaniz, link uzerindeki text'i birebir ayni olarak yazmamiz gerekir
         bosluk, ? gibi karakterler varsa onlar da mutlaka yazilmalidir
         */
        /* driver.findElement(By.partialLinkText("hoes")).click();
         driver.findElement(By.partialLinkText("oes")).click();
         driver.findElement(By.partialLinkText("ho")).click();
         */
        // By.partialLinkText() kullanildiginda
        // link uzerindeki yazinin tamamina ihtiyac yoktur
        // Yazinin, istegimiz webelementi unique olarak bulabilecegimiz
        // herhangi bir parcasini kullanmamiz yeterli olur

        WebElement shoesLinki = driver.findElement(By.partialLinkText("oe"));
        shoesLinki.click();

        // acilan sayfada URL'in Shoes icerdigini test edin
        String expectedUrlIcerik = "Shoes";
        String actualUrl = driver.getCurrentUrl();
        if (actualUrl.contains(expectedUrlIcerik)){
            System.out.println("Url icerik Test Passed");
        }else {
            System.out.println("Url icerik Test Failed");
        }
        // acilan sayfada Title'in Shoes icerdigini test edin
        String expectedTitleIcerik = "Shoes";
        String actualTitle = driver.getTitle();
        if (actualTitle.contains(expectedTitleIcerik)) {
            System.out.println("Title icerik test Passed");
        } else {
            System.out.println("Title icerik test Failed");
        }
// Shoes linkinin bu sayfada da erisilebilir oldugunu test edin
        shoesLinki = driver.findElement(By.partialLinkText("oe"));
        if (shoesLinki.isEnabled()) {
            System.out.println("Shoes linki erişim testi Passed");//"StaleElementReferenceException"
        }else {
            System.out.println("Shoes linki erişim testi Failed");
        }
        /*
            Bir webelementi locate ettikten sonra
            sayfayi yenileme veya yeni bir sayfaya gitme gibi islemler yaparsak
            driver daha onceden yaptigimiz locate'leri KULLANAMAYABILIR
            ve bize "StaleElementReferenceException" verir

            bu durumda locate ve elemente kayit islemini 54. satırda oldugu gibi YENIDEN YAPMALIYIZ
         */

        driver.quit();
        }
    }

