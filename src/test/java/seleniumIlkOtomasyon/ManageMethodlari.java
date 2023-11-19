package seleniumIlkOtomasyon;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ManageMethodlari {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.chrome.drive", "src/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        //driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));// sayfa acılana kadar en fazla 15 sn bekler.
        //sayfa acılmazsa exception fırlatır. Amac sleep de oldugu gibi beklemek degil gorevi yapmaktır.
        /*
        imlicitlyWait() ssayfanın yuklenmesi ve/veya arayacagımız webelemenetleri bulmak icin inamik olarak anımlanmıs
        maksimum bekleme suresidir. Bizim icin uygun sureyi tanımlarız bulursa bulur bulamazsa hata verir
         */
        System.out.println("İlk bastaki konum: "+ driver.manage().window().getPosition()); //(22, 47)
        System.out.println("İlk bastaki size: "+ driver.manage().window().getSize());//(1200, 774)
        Thread.sleep(2000);

        driver.manage().window().maximize();
        System.out.println("Maksimize konum: "+ driver.manage().window().getPosition());//(0, 25)
        System.out.println("Maksimize size: "+driver.manage().window().getSize()); //(1440, 818)
        Thread.sleep(2000);

        driver.manage().window().fullscreen();
        System.out.println("Fullscreen konum: " + driver.manage().window().getPosition());//(0, 0)
        System.out.println("Fullscreen size: " +driver.manage().window().getSize());//(1440, 900)
        Thread.sleep(2200);

        //Pencereyi aslangıc noktası (50, 100) e size' i(1000, 700)  yapın
        driver.manage().window().setPosition(new Point(50,100));
        driver.manage().window().setSize(new Dimension(1000,700));
        System.out.println("Özel konum: " + driver.manage().window().getPosition());//(0, 0)
        System.out.println("Özel size: " +driver.manage().window().getSize());//(1440, 900)
        Thread.sleep(2200);
        driver.manage().window().minimize(); //asağı indirir
        Thread.sleep(2200);
        driver.close();

    }
}
