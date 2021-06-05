package Base;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

    @Test
    public void SetUp() {
        System.setProperty("webdriven.chrome.driver", "resources/chromedriven.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.demo.guru99.com/V4/");
        WebElement username=driver.findElement(By.name("uid"));
        WebElement password=driver.findElement(By.name("password"));
        WebElement login=driver.findElement(By.name("btnLogin"));
        username.sendKeys("mngr332012");
        password.sendKeys("anyvera");
        login.click();
        String actualUrl="http://www.demo.guru99.com/V4/manager/Managerhomepage.php";
        String expectedUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
    }
}
