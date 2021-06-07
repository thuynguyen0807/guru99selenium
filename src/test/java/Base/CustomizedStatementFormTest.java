package Base;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.CustomizedStatementFormPage;
import pages.FundTransferPage;

public class CustomizedStatementFormTest {
    WebDriver driver;
    protected CustomizedStatementFormPage customizedStatementFormPage;

    @BeforeEach
    public void refresh() {
        System.setProperty("webdriver.chrome.driver", "D:\\selenium\\FinalTestGuru\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://www.demo.guru99.com/V4/manager/CustomisedStatementInput.php");
    }

    @Test
    @DisplayName("TC001")
    public void TestCase001() {
        customizedStatementFormPage = new CustomizedStatementFormPage(driver);
        customizedStatementFormPage.setAccountNo("123TT");
        customizedStatementFormPage.setFDate("01/01/2020");
        customizedStatementFormPage.setTDate("01/01/2021");
        customizedStatementFormPage.setTfAmountlowerlimit("2000");
        customizedStatementFormPage.setTfNumtransaction("123123");
        customizedStatementFormPage.clickSubmitButton();
    }
    @Test
    @DisplayName("TC002")
    public void TestCase002() {
        customizedStatementFormPage = new CustomizedStatementFormPage(driver);
        customizedStatementFormPage.setAccountNo("123TT");
        customizedStatementFormPage.setFDate("01/01/2020");
        customizedStatementFormPage.setTDate("01/01/2021");
        customizedStatementFormPage.setTfAmountlowerlimit("2000");
        customizedStatementFormPage.setTfNumtransaction("123456");
        customizedStatementFormPage.clickSubmitButton();
    }
    @Test
    @DisplayName("TC003")
    public void TestCase003() {
        customizedStatementFormPage = new CustomizedStatementFormPage(driver);
        customizedStatementFormPage.setAccountNo("123TT");
        customizedStatementFormPage.setFDate("01/01/2020");
        customizedStatementFormPage.setTDate("01/01/2021");
        customizedStatementFormPage.setTfAmountlowerlimit("2000");
        customizedStatementFormPage.setTfNumtransaction("");
        customizedStatementFormPage.clickSubmitButton();
    }
    @Test
    @DisplayName("TC004")
    public void TestCase004() {
        customizedStatementFormPage = new CustomizedStatementFormPage(driver);
        customizedStatementFormPage.setAccountNo("123TT");
        customizedStatementFormPage.setFDate("01/01/2020");
        customizedStatementFormPage.setTDate("01/01/2021");
        customizedStatementFormPage.setTfAmountlowerlimit("");
        customizedStatementFormPage.setTfNumtransaction("123123");
        customizedStatementFormPage.clickSubmitButton();
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}
