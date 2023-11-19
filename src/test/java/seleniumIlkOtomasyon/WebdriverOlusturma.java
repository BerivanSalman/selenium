package seleniumIlkOtomasyon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverOlusturma {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.chrome.driver", "src/resources/chromedriver");
        //Bu satır olusturacagımız webdriver ın ozelliklerini set ediyor
        //Webdriver otomasyyon sırasında bizim herseyimizdir
        WebDriver driver = new ChromeDriver(); //gercek chrome degildir kopya chomedriver olusturur
        //WebDriver interface oldugu icin obje olusturamayız o yüzden childı olan ChromeDriverd<n olusturururz.
        // En günceli ChromeDriver da oldugu icin onu kullandık
     driver.get("https://www.testotomasyonu.com");
     driver.manage().window().maximize();//ful ekran gosterir
        Thread.sleep(5000); // 15 sn bekle
     driver.close();

    }
}
