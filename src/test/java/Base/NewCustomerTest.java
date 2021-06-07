package Base;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;
import pages.NewCustomerPage;

public class NewCustomerTest {

    WebDriver driver;
    protected NewCustomerPage newCustomerPage;

    @BeforeEach
    public void refresh() {
        System.setProperty("webdriver.chrome.driver", "D:\\selenium\\FinalTestGuru\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://www.demo.guru99.com/V4/manager/addcustomerpage.php");
    }

    @Test
    @DisplayName("TC001")
    public void TestCase001() {
        newCustomerPage = new NewCustomerPage(driver);
        newCustomerPage.setCustomer_name("Thuy Nguyen");
        newCustomerPage.setDob("01/01/2000");
        newCustomerPage.setAddress("Gia Lai");
        newCustomerPage.setCity("Pleiku");
        newCustomerPage.setState("Single");
        newCustomerPage.setPin("123456");
        newCustomerPage.setPhone("0988765766");
        newCustomerPage.setEmail("thuy@gmail.com");
        newCustomerPage.setPassword("123123");
        newCustomerPage.clickSubmitButton();
    }

    @Test
    @DisplayName("TC002")
    public void TestCase002() {
        newCustomerPage = new NewCustomerPage(driver);
        newCustomerPage.setCustomer_name("Tuan Anh");
        newCustomerPage.setDob("01/02/2000");
        newCustomerPage.setAddress("Quang Binh");
        newCustomerPage.setCity("Dong Hoi");
        newCustomerPage.setState("Single");
        newCustomerPage.setPin("");
        newCustomerPage.setPhone("0869192153");
        newCustomerPage.setEmail("tanh@gmail.com");
        newCustomerPage.setPassword("123123");
        newCustomerPage.clickSubmitButton();
    }

    @Test
    @DisplayName("TC003")
    public void TestCase003() {
        newCustomerPage = new NewCustomerPage(driver);
        newCustomerPage.setCustomer_name("Tuan Anh");
        newCustomerPage.setDob("01/02/2000");
        newCustomerPage.setAddress("Quang Binh");
        newCustomerPage.setCity("Dong Hoi");
        newCustomerPage.setState("Single");
        newCustomerPage.setPin("AAA");
        newCustomerPage.setPhone("0869192153");
        newCustomerPage.setEmail("tanh@gmail.com");
        newCustomerPage.setPassword("123123");
        newCustomerPage.clickSubmitButton();
    }


    @Test
    @DisplayName("TC004")
    public void TestCase004() {
        newCustomerPage = new NewCustomerPage(driver);
        newCustomerPage.setCustomer_name("Thuy Nguyen");
        newCustomerPage.setDob("01/01/2000");
        newCustomerPage.setAddress("Gia Lai");
        newCustomerPage.setCity("Pleiku");
        newCustomerPage.setState("Single");
        newCustomerPage.setPin("123456");
        newCustomerPage.setPhone("0988765766");
        newCustomerPage.setEmail("thuy");
        newCustomerPage.setPassword("123123");
        newCustomerPage.clickSubmitButton();
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}
