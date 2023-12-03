package Day04_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
public class xpath_textKullanimi {
    /*
    Xpath link olmasa bile yazisi olan webelementleri yazi ile locate etmemize imkan tanir. Mesela;
    //button[text() = 'Add'] yapariz
     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        //1- https://testotomasyonu.com/addremove/ adresine gidin
        driver.get("https://testotomasyonu.com/addremove/");
        //2- Add Element butonuna basin
        driver.findElement(By.xpath("//button[text()='Add']")).click();
        Thread.sleep(2000);
        //3- Delete butonu’nun gorunur oldugunu test edin
        WebElement removeButton = driver.findElement(By.xpath("//button[text()='Remove']"));
        if (removeButton.isDisplayed()){
            System.out.println("Remove button gorunurlugu testi Passed");
        }else{
            System.out.println("Remove button gorunurlugu testi  Failed");
        }
        //4- Delete tusuna basin
       removeButton.click();
        //5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin
        WebElement addRemoveYaziElementi = driver.findElement(By.xpath("//*[text()='Add/Remove Elements']"));
        if (addRemoveYaziElementi.isDisplayed()){
            System.out.println("addRemoveYaziElementi  gorunurlugu testi Passed");
        }else{
            System.out.println("addRemoveYaziElementi  gorunurlugu testi  Failed");
        }
        //remove butonunun gorunur olmadıgını test et;
        //remove butonunun gorunmemesini bekliyoruz. Exception fırlatırsa testimiz gecmis olacak
        try {
            removeButton = driver.findElement(By.xpath("//button[text()='Remove']"));
            System.out.println("Remove butonu gorunmeme testi Failed");
        } catch (NoSuchElementException e) {
            System.out.println("Remove butonu gorunmeme testi Passed");
        }
        driver.close();
    }
}
