package seleniumIlkOtomasyon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethodlari2 {
    public static void main(String[] args) throws InterruptedException {
        /*
        Selenium 4.12 versiyonu ile kendi Webdriver ını da olusturabiliyor.
        Yani artık dısardan bir Webdriver tanımlama mecburiyeti kalmadı. FireFox yok bende onu da calıstırabilir
        Ama şirketlerin cogu kendilerine ozel
        satın aldıkları webdriver ları kullanabiliyorlar.
         */
        System.setProperty("Webdriver.chrome.driver", "src/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.testotomasyonu.com");
        Thread.sleep(1000);
        System.out.println(driver.getPageSource()); //tum sayfadaki html kodları bize getirdi
        System.out.println(driver.getWindowHandle()); //89624DB3DF849FA2E27D7F13FCBFBF0B
        //Window handle degeri: Selenium'un olusturdugu her webdriver objesine verdiği unique koddur.
        // her calıstırdıgımızda farklı sayı dondurur. Biz bu degerleri birden fazla sayfa acılırsa o sayfalar
        // arasında gecis yapmak icin kullanılır.
        System.out.println(driver.getWindowHandles()); //[A11CA031F196E9645B3760FFA7B5DE73]
        //WindowsHandles:  test sırasında birden fazla window acıldıysa
        // bir set olarak acılan aktif webdriver objesinin actıgı tum window handle degerlerini getirir

        Thread.sleep(3000);
        driver.quit();

    }
}
