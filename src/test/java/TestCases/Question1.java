package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Question1 {
    public static void main(String[] args) {
        //1. Launch browser
        System.setProperty("Webdriver.chrome.driver", "src/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        //2. Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");
        //3. Verify that home page is visible successfully
        WebElement homePage = driver.findElement(By.xpath("//i[@class='fa fa-home']"));
        if (homePage.isDisplayed()) {
            System.out.println("HomePage gorunurluk testi Passed");
        } else {
            System.out.println("HomePage gorunurluk testi Failed");
        }
        //4. Click on 'Signup / Login' button
        WebElement LoginSignup = driver.findElement(By.xpath("//i[@class='fa fa-lock']"));
        LoginSignup.click();
        //5. Verify 'Login to your account' is visible
        WebElement Login = driver.findElement(By.xpath("//h2[text()='Login to your account']"));
        if (Login.isDisplayed()) {
            System.out.println("Login gorunurluk testi Passed");
        } else {
            System.out.println("Login gorunurluk testi Failed");
        }
        //6. Enter correct email address and password
        driver.findElement(By.xpath("//input[@data-qa='login-email']")).sendKeys("samet03y@gmail.com");
        driver.findElement(By.xpath("//input[@data-qa='login-password']")).sendKeys("123456");
        //7. Click 'login' button
        driver.findElement(By.xpath("//button[@data-qa='login-button']")).click();
        //8. Verify that 'Logged in as username' is visible
        WebElement username = driver.findElement(By.xpath("//*[text()=' Logged in as '] "));
        if (username.isDisplayed()) {
            System.out.println("Username gorunurluk testi passed");
        } else {
            //sorun nerdeydi acıyorum hocam
            System.out.println("Username gorunurluk testi failed");
        }
        // 9. Click 'Delete Account' button
        driver.findElement(By.xpath("//i[@class='fa fa-trash-o']")).click();
        //10. Verify that 'ACCOUNT DELETED!' is visible
        WebElement accountDeleted = driver.findElement(By.xpath("//b[text()='Account Deleted!']"));
        if (accountDeleted.isDisplayed()) {
            System.out.println("Account deleted gorunurluk testi Passed");
        } else {
            System.out.println("Account deleted gorunurluk testi Failed");
        }
driver.quit();
    }
}
