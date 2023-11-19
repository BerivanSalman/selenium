package seleniumIlkOtomasyon;

import Utilities.ReusableMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class ByClassNameLocator {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.chrome.driver", "src/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //testotomasyonu.com sayfasına gidin
        driver.get("https://testotomasyonu.com");
        Thread.sleep(1000);
        //arama kutusuna phone yazıp aratın
        WebElement aramaKutusu = driver.findElement(By.id("global-search"));
        aramaKutusu.sendKeys("phone");
        aramaKutusu.submit();

        //arama yapıldıktan sonra, sol tarafta cıkan Categories menusundeki kategori sayisinin 8 oldugunu test et
        int expectedKategoriSayisi = 8;
      List<WebElement> kategoriElementleriList = driver.findElements(By.className("acc_head"));
      int actualKategoriSayisi = kategoriElementleriList.size();
      if (expectedKategoriSayisi == actualKategoriSayisi) {
          System.out.println("Kategori testi Passed");
      }else {
          System.out.println("Kategori testi Failed");
          System.out.println("Actual kategori sayisi: " + actualKategoriSayisi);
      }
        //kategorileri yazdırın (web elementleri direkt yazdıramayız
        //System.out.println(kategoriElementleriList); bu referansları yazdırır.
        // Bu List webelementler'den olusuyor
        // webelementler uzerindeki yaziyi direk yazdiramayiz
        // her bir webelementi ele alip, uzerindeki yaziyi yazdirmamiz gerekir
        /*
        yazdirma islemini bir for-each loop ile yapabiliriz
        ama biz bu islemi cok kullanacagimiz icin
        bir method olusturup
        webelementlerden olusan listeyi
        String'lerden olusan bir listeye cevirdik

        for (WebElement each:kategoriElementleriList
             ) {
            System.out.println(each.getText());
        }
         */
       // System.out.println(ReusableMethods.stringListeDonustur(kategoriElementleriList));
        System.out.println(ReusableMethods.stringListeDonustur(kategoriElementleriList));

        Thread.sleep(3000);
        driver.close();
    }
}
