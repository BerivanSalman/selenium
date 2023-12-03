package Day04_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class xpath {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
       //1- https://testotomasyonu.com/addremove/ adresine gidin
        driver.get("https://testotomasyonu.com/addremove/");
        //2- Add Element butonuna basin
       driver.findElement(By.id("sub-btn")).click();
       Thread.sleep(2000);
        //3- Delete butonu’nun gorunur oldugunu test edin
        WebElement removeButton = driver.findElement(By.className("remove-btn"));
        if (removeButton.isDisplayed()){
            System.out.println("Remove button gorunurlugu testi Passed");
        }else{
            System.out.println("Remove button gorunurlugu testi  Failed");
        }
        //4- Delete tusuna basin
        driver.findElement(By.className("remove-btn")).click();
        //5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin
        WebElement addRemoveYaziElementi = driver.findElement(By.xpath("//*[@class = 'container']"));
        if (addRemoveYaziElementi.isDisplayed()){
            System.out.println("addRemoveYaziElementi  gorunurlugu testi Passed");
        }else{
            System.out.println("addRemoveYaziElementi  gorunurlugu testi  Failed");
        }
        //remove butonunun gorunur olmadıgını test et;
        //remove butonunun gorunmemesini bekliyoruz. Exception fırlatırsa testimiz gecmis olacak
        try {
            removeButton = driver.findElement(By.xpath("//*[@class = 'remove-btn']"));
            System.out.println("Remove butonu gorunmeme testi Failed");
        } catch (NoSuchElementException e) {
            System.out.println("Remove butonu gorunmeme testi Passed");
        }
        driver.quit();
    }
}
