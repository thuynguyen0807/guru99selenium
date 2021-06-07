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
import pages.WidthdrawPage;

public class WidthdrawTest {
    WebDriver driver;
    protected WidthdrawPage widthdrawPage;

    @BeforeEach
    public void refresh() {
        System.setProperty("webdriver.chrome.driver", "D:\\selenium\\FinalTestGuru\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://www.demo.guru99.com/V4/manager/WithdrawalInput.php");
    }

    @Test
    @DisplayName("TC001")
    public void TestCase001() {
        widthdrawPage = new WidthdrawPage(driver);
        widthdrawPage.setAccountNo("TN001");
        widthdrawPage.setAmount("1000");
        widthdrawPage.setDesc("met moi qua");
        widthdrawPage.clickSubmitButton();
    }

    @Test
    @DisplayName("TC002")
    public void TestCase002() {
        widthdrawPage = new WidthdrawPage(driver);
        widthdrawPage.setAccountNo("001");
        widthdrawPage.setAmount("1000");
        widthdrawPage.setDesc("met moi qua");
        widthdrawPage.clickSubmitButton();
    }

    @Test
    @DisplayName("TC003")
    public void TestCase003() {
        widthdrawPage = new WidthdrawPage(driver);
        widthdrawPage.setAccountNo("003");
        widthdrawPage.setAmount("");
        widthdrawPage.setDesc("met moi qua");
        widthdrawPage.clickSubmitButton();
    }

    @Test
    @DisplayName("TC004")
    public void TestCase004() {
        widthdrawPage = new WidthdrawPage(driver);
        widthdrawPage.setAccountNo("");
        widthdrawPage.setAmount("1000");
        widthdrawPage.setDesc("met moi qua");
        widthdrawPage.clickSubmitButton();
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}
