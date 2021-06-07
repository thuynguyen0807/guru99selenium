package Base;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.NewAccountPage;
import pages.NewCustomerPage;

public class NewAccountTest {
    WebDriver driver;
    protected NewAccountPage newAccountPage;

    @BeforeEach
    public void refresh() {
        System.setProperty("webdriver.chrome.driver", "D:\\selenium\\FinalTestGuru\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://www.demo.guru99.com/V4/manager/addAccount.php");
    }

    @Test
    @DisplayName("TC001")
    public void TestCase001() {
        newAccountPage = new NewAccountPage(driver);
        newAccountPage.setCustomer_id("001");
        newAccountPage.setAccountType("Current");
        newAccountPage.setInitialDeposit("123000");
        newAccountPage.clickSubmitButton();
    }
    @Test
    @DisplayName("TC002")
    public void TestCase002() {
        newAccountPage = new NewAccountPage(driver);
        newAccountPage.setCustomer_id("TN002");
        newAccountPage.setAccountType("Current2");
        newAccountPage.setInitialDeposit("123010");
        newAccountPage.clickSubmitButton();
    }

    @Test
    @DisplayName("TC003")
    public void TestCase003() {
        newAccountPage = new NewAccountPage(driver);
        newAccountPage.setCustomer_id("TN003");
        newAccountPage.setAccountType("Current3");
        newAccountPage.setInitialDeposit("");
        newAccountPage.clickSubmitButton();
    }

    @Test
    @DisplayName("TC004")
    public void TestCase004() {
        newAccountPage = new NewAccountPage(driver);
        newAccountPage.setCustomer_id("004");
        newAccountPage.setAccountType("");
        newAccountPage.setInitialDeposit("113000");
        newAccountPage.clickSubmitButton();
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}
