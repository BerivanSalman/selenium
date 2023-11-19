package seleniumIlkOtomasyon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ilkTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.chrome.driver", "src/resources/chromedriver");
        /*testotomasyonu anasayfaya gidin URL'in http://www.testotomasyonu.com oldugunu
        Ve Title'nin test kelimesi icerdigini test edin
         */
        //Her test icin mutlaka WebDriver olusturmalı ve gerekli ayarlamaları yapmalıyız
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //testotomasyonu anasayfaya gidin
        driver.get("https://www.testotomasyonu.com");

        //Titlenin Test kelimesi icerdigini test edelim:
        String expectedTitleIcerigi = "Test";
        String actualTitle = driver.getTitle();
        if (actualTitle.contains(expectedTitleIcerigi)) {
            System.out.println("Title testi PASSED");
        }else {
           System.out.println("Title testi FAILED");
            System.out.println("Actual title : " +actualTitle);
        }
        Thread.sleep(3000);

        //URL'in http://testotomasyonu.com oldugunu test edelim
      String expectedUrl = "https://www.testotomasyonu.com/";
        String actualUrl = driver.getCurrentUrl();
        if (expectedUrl.equals(actualUrl)){
            System.out.println("URL testi passed");
        }
        else {
            System.out.println("URL testi failed");
            System.out.println("Actual URL: "+ actualUrl);
        }

        Thread.sleep(3000);
        driver.close();
        /*
        URL testi failed
        Actual URL: https://www.testotomasyonu.com/
        o yüzden sonuna / koyup tekrar deneyince test passed oluyor
         */


    }
}
