package Base;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.DepositPage;
import pages.NewAccountPage;

public class DepositTest {
    WebDriver driver;
    protected DepositPage depositPage;

    @BeforeEach
    public void refresh() {
        System.setProperty("webdriver.chrome.driver", "D:\\selenium\\FinalTestGuru\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://www.demo.guru99.com/V4/manager/DepositInput.php");
    }

    @Test
    @DisplayName("TC001")
    public void TestCase001() {
        depositPage = new DepositPage(driver);
        depositPage.setAccountNo("TN001");
        depositPage.setAmount("1000");
        depositPage.setDesc("met moi qua");
        depositPage.clickSubmitButton();
    }

//    @AfterEach
//    public void tearDown() {
//        driver.quit();
//    }
}
