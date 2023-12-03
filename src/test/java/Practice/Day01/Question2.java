package Practice.Day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Question2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
        //1. saniyede acılsa hic bekleme yapmaz devam eder ama thread sleep bekler
        driver.manage().window().maximize();
        //https://www.otto.de adresine git
        driver.get("https://www.otto.de ");
        Thread.sleep(2000);
        //sayfanın url ini al ve OTTO kelimesi icerip icermediğini kontrol et
        String expectedUrl = "otto";
        String actualUrl = driver.getCurrentUrl();
        if (actualUrl.contains(expectedUrl)){
            System.out.println("Url testi Passed");
        }else {
            System.out.println("Url testi Failed");
        }
        //sayfanin titlesini al ve OTTO kelimesi icerip icermediğini kontrol et
        String expectedTitle = "OTTO";
        String actualTitle =driver.getTitle();
        if (actualTitle.contains(expectedTitle)){
            System.out.println("Title testi Passed");
        }else {
            System.out.println("Title testi Failed");
        }
        //https://www.wisequarter.com adresine git
        driver.navigate().to("https://www.wisequarter.com");
        Thread.sleep(2000);
        //  Title ın Quarter kelimesini icerip icermediğini test et
        String expectedTitleWise = "Quarter";
        String actualTitleWise = driver.getTitle();
        if (actualTitleWise.contains(expectedTitleWise)){
            System.out.println("Wise title test Passed");
        }else {
            System.out.println("Wise title test Failed");
        }
        //Bir onceki sayfaya git
        driver.navigate().back();
        Thread.sleep(2000);
        //sayfayı yenile
        driver.navigate().refresh();
        Thread.sleep(2000);
        //cıkıs yap
        driver.close();



    }
}
