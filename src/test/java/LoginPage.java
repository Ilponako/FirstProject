import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginPage {
    public WebDriver driver;
    public String testUrl = "https://rozetka.com.ua/";


    @Test
    public void rozetkaLogim () {

        System.setProperty("webdriver.chrome.driver", "C:\\Automation\\FirstProject\\driver\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.navigate().to(testUrl);
        driver.manage().window().maximize();

        WebElement LoinBtn = driver.findElement (By.xpath ("//a[@class=\"header-topline__user-link link-dashed\"]"));
        LoinBtn.click();

        WebElement LoginField = driver.findElement (By.id("auth_email"));
        LoginField.sendKeys("popichko@ukr.net");

        WebElement PasswordFild = driver.findElement(By.id("auth_pass"));
        PasswordFild.sendKeys("Qwerty123456");

        WebElement SingBtn = driver.findElement(By.xpath("//button[@class=\"button button_color_navy auth-modal__login-button\"]"));
        SingBtn.click();

        WebElement FindName = driver.findElement(By.xpath("//a[@class=\"header-topline__user-link link-dashed\"]")); //это что такое?

    }
}


