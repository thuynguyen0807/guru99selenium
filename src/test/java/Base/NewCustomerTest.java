package Base;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewCustomerTest {
    @Test
    public void SetUp() {
        System.setProperty("webdriven.chrome.driver", "resources/chromedriven.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.demo.guru99.com/V4/manager/addcustomerpage.php");
        WebElement customer_name=driver.findElement(By.name("name"));
        WebElement dob=driver.findElement(By.name("dob"));
        WebElement address=driver.findElement(By.name("addr"));
        WebElement city=driver.findElement(By.name("city"));
        WebElement state=driver.findElement(By.name("state"));
        WebElement pin=driver.findElement(By.name("pinno"));
        WebElement phone=driver.findElement(By.name("telephoneno"));
        WebElement email=driver.findElement(By.name("emailid"));
        WebElement password=driver.findElement(By.name("password"));
        WebElement submit=driver.findElement(By.name("sub"));
        customer_name.sendKeys("Thuy Nguyen");
        dob.sendKeys("01/01/2000");
        address.sendKeys("Gia Lai");
        city.sendKeys("Pleiku");
        state.sendKeys("Single");
        pin.sendKeys("010100");
        phone.sendKeys("0988121212");
        email.sendKeys("nttthuy.18it5@sict.udn.vn");
        password.sendKeys("123123");
        submit.click();
        String actualUrl="http://www.demo.guru99.com/V4/manager/addcustomerpage.php";
        String expectedUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
    }
}
