package Base;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewAccountTest {
    @Test
    public void SetUp() {
        System.setProperty("webdriven.chrome.driver", "resources/chromedriven.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.demo.guru99.com/V4/manager/addAccount.php");
        WebElement customerId=driver.findElement(By.name("cusid"));
        WebElement accountType=driver.findElement(By.name("selaccount"));
        WebElement initialDeposit=driver.findElement(By.name("inideposit"));
        WebElement submit=driver.findElement(By.name("button2"));
        customerId.sendKeys("TN001");
        accountType.sendKeys("Current");
        initialDeposit.sendKeys("012345");
        submit.click();
        String actualUrl="http://www.demo.guru99.com/V4/manager/Managerhomepage.php";
        String expectedUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
    }
}
