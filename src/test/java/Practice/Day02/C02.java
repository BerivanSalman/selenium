package Practice.Day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02 {
    public static void main(String[] args) {
          /*
        1- www.google.com adresine gidilir
        2- sayfanın title ve Url değerleri yazdırılır
        3- yeni bir sekme açılarak www.wisequarter.com adresine gidilir
        4- gidilen sayfanın title ve url değerleri yazdırılır
        5- ilk sekmeye geçilip, burada www.testotomasyonu.com adresine gidilir
        6- gidilen sayfanın title ve url değerleri yazdırılır
        7- açılan pencere kapatılır.
         */
        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String ht="https://www.";
        //   1- www.google.com adresine gidilir
        driver.get(ht+"google.com");

        //2-sayfanın title ve Url değerleri yazdırılır
        System.out.println("1.Site URL= "+driver.getCurrentUrl());
        System.out.println("1.Site Title= "+driver.getTitle());
        System.out.println("1. Site Handle: " + driver.getWindowHandle());//Pencerenin handle numarasıdır.Her pencere  acısta handle degeri degisir.
        // AMA sayfayı kapatmazsak degismez bu deger
        String handle= driver.getWindowHandle(); //ilk açılan sekmenin handle degerini bir variable yaptık
        // cunku bu sekmeye gitmemiz isteniyor bunu 5. madde icin kullanacagız
        driver.navigate().refresh();

        //3-Sayfayı kapatmadan yeni bir sekme  (Tab) açılarak www.wisequarter.com adresine gidelim;
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get(ht+"wisequarter.com");
        System.out.println("Tum sekmeler: "+ driver.getWindowHandles());

        //4- gidilen sayfanın title ve url değerleri yazdırılır
        System.out.println("2.Site URL= "+driver.getCurrentUrl());
        System.out.println("2.Site Title= "+driver.getTitle());

        //5- ilk sekmeye geçilip, burada www.testotomasyonu.com adresine gidilir
        driver.switchTo().window(handle); //google yı actıgın sekmeye don
        driver.get(ht+"testotomasyonu.com");
        System.out.println("3.Site URL= "+driver.getCurrentUrl());
        System.out.println("3.Site Title= "+driver.getTitle());
        System.out.println("Sekme Handle: " + driver.getWindowHandle());
        driver.quit();


    }
}
