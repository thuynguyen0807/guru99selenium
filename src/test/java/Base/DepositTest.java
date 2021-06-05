package Base;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DepositTest {
    @Test
    public void SetUp() {
        System.setProperty("webdriven.chrome.driver", "resources/chromedriven.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.demo.guru99.com/V4/manager/DepositInput.php");
        WebElement accountNo=driver.findElement(By.name("accountno"));
        WebElement amount=driver.findElement(By.name("ammount"));
        WebElement des=driver.findElement(By.name("desc"));
        WebElement submit=driver.findElement(By.name("AccSubmit"));
        accountNo.sendKeys("");
        amount.sendKeys("");
        des.sendKeys("");
        submit.click();
        String actualUrl="http://www.demo.guru99.com/V4/manager/Managerhomepage.php";
        String expectedUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
    }
}
