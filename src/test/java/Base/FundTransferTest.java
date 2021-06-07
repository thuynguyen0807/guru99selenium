package Base;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.DepositPage;
import pages.FundTransferPage;

public class FundTransferTest {
    WebDriver driver;
    protected FundTransferPage fundTransferPage;

    @BeforeEach
    public void refresh() {
        System.setProperty("webdriver.chrome.driver", "D:\\selenium\\FinalTestGuru\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://www.demo.guru99.com/V4/manager/FundTransInput.php");
    }

    @Test
    @DisplayName("TC001")
    public void TestCase001() {
        fundTransferPage = new FundTransferPage(driver);
        fundTransferPage.setPayersAccount("123TT");
        fundTransferPage.setPayeeAccount("1000");
        fundTransferPage.setAmmount("10000");
        fundTransferPage.setDesc("met moi qua");
        fundTransferPage.clickSubmitButton();
    }
    @Test
    @DisplayName("TC002")
    public void TestCase002() {
        fundTransferPage = new FundTransferPage(driver);
        fundTransferPage.setPayersAccount("123");
        fundTransferPage.setPayeeAccount("1030");
        fundTransferPage.setAmmount("10003");
        fundTransferPage.setDesc("met qua");
        fundTransferPage.clickSubmitButton();
    }
    @Test
    @DisplayName("TC003")
    public void TestCase003() {
        fundTransferPage = new FundTransferPage(driver);
        fundTransferPage.setPayersAccount("123");
        fundTransferPage.setPayeeAccount("");
        fundTransferPage.setAmmount("10300");
        fundTransferPage.setDesc("moi qua");
        fundTransferPage.clickSubmitButton();
    }
    @Test
    @DisplayName("TC004")
    public void TestCase004() {
        fundTransferPage = new FundTransferPage(driver);
        fundTransferPage.setPayersAccount("423");
        fundTransferPage.setPayeeAccount("4000");
        fundTransferPage.setAmmount("");
        fundTransferPage.setDesc("met moi ");
        fundTransferPage.clickSubmitButton();
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}
