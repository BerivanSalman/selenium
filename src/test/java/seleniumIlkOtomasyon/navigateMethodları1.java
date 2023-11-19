package seleniumIlkOtomasyon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigateMethodları1 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.chrome.driver", "src/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //testotomasyonu anasayfaya gidin
        driver.get("https://www.testotomasyonu.com");
        Thread.sleep(1000);
        //title'nin otomasyon icerdigini test edin
        driver.getTitle();
        String expectedResult = "Otomasyon";
        String actualResult = driver.getTitle();
        if (actualResult.contains(expectedResult)) {
            System.out.println("Test Passed");
        }
        else {
            System.out.println("Test Failed");
            System.out.println("Actual result: " + actualResult);
        }
        Thread.sleep(1000);
        //sonra wisequarter anasayfaya gidin
        driver.get("https://www.wisequarter.com");
        Thread.sleep(1000);
        //URL in wisequarter icerdigini test edin
        String expectedresult = "wisequarter";
        String actualresult = driver.getCurrentUrl();
        if (actualresult.contains(expectedresult)){
            System.out.println("Test Passed");
        }else {
            System.out.println("Test Failed");
            System.out.println("Actual result: " + actualresult);
        }
        Thread.sleep(1000);
        //tekrar testotomasyonu sayfasına donun
        driver.navigate().back();
        Thread.sleep(1000);
        //URL'in otomasyon icerdigini test edin
        String expected = "otomasyon";
        String actual = driver.getCurrentUrl();
        if (actual.contains(expected)){
            System.out.println("Test Passed");
        }else {
            System.out.println("Test Failed");
            System.out.println("Actual result : " + actual);
        }
        Thread.sleep(1000);
        //sayfayı kapatın
        driver.close();
    }
}
