package Practice.Day01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Question3 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.chrome.driver", "src/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
        driver.manage().window().maximize();
       // Navigate to  https://testpages.herokuapp.com/styled/index.html
        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html");
        Thread.sleep(2000);
        // Click on  Calculater under Micro Apps
        driver.findElement(By.id("calculatetest")).click();
        //driver.findElement(By.xpath("//a[@id='calculatest")).click();
        // Type any number in the first input
        driver.findElement(By.id("number1")).sendKeys("200");
        Thread.sleep(2000);
        //choose minus;
        driver.findElement(By.id("function")).click();
        driver.findElement(By.xpath("//option[@value ='minus']")).click();
        Thread.sleep(2000);
      //  Type any number in the second input
        driver.findElement(By.id("number2")).sendKeys("123");
        Thread.sleep(2000);
      //  Click on Calculate
        driver.findElement(By.id("calculate")).click();
        Thread.sleep(2000);
      //  Get the result
        WebElement result = driver.findElement(By.id("answer"));
      //  Print the result
        System.out.println("Answer: " +result.getText());
        Thread.sleep(2000);
        driver.close();
    }
}
