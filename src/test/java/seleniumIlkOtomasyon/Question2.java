package seleniumIlkOtomasyon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Question2 {
    public static void main(String[] args) throws InterruptedException {
        //Gerekli ayarlamaları yapın
        System.setProperty("Webdriver.chrome.drive","src/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //testotomasyonu.com adresine gidin
        driver.get("https://www.testotomasyonu.com");
        //shoes linkine tıklayın
        driver.findElement(By.linkText("Shoes")).click();
        Thread.sleep(1000);

        //cıkan urunlerden ucuncu urune tıklayın
        List<WebElement> shoesElementlerList = driver.findElements(By.className("prod-img"));
        //Hepsini listeye koyduk simdi de 3. elemente click yapalım
        shoesElementlerList.get(2).click();
        Thread.sleep(1000);

        //urun kısa acıklamalarında  case sensitive olmadan shoe gecip gecmedigini test edin
        WebElement kelimeBulma = driver.findElement(By.className("prod-detail"));
        String expectedIcerik = "shoe";
        String actualIcerik = kelimeBulma.getText().toLowerCase();
        if (actualIcerik.contains(expectedIcerik)){
            System.out.println("Kelime bulma testi Passed");
        }else {
            System.out.println("Kelime bulma testi Failed");
        }
            Thread.sleep(1000);
        driver.quit();
    }
}
