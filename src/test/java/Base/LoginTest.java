package Base;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;

public class LoginTest {
    WebDriver driver;
    protected LoginPage loginPage;

    @BeforeEach
    public void refresh() {
        System.setProperty("webdriver.chrome.driver", "D:\\selenium\\FinalTestGuru\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://www.demo.guru99.com/V4/");
    }

    @Test
    @DisplayName("TC001")
    public void TestCase001() {
        loginPage = new LoginPage(driver);
        loginPage.setUserName("mngr332012");
        loginPage.setPassword("anyvera");
        loginPage.clickLoginButton();
        Assertions.assertEquals("http://www.demo.guru99.com/V4/manager/Managerhomepage.php", driver.getCurrentUrl());
    }

    @Test
    @DisplayName("TC002")
    public void TestCase002() {
        loginPage = new LoginPage(driver);
        loginPage.setUserName("mngr332012");
        loginPage.setPassword("123");
        loginPage.clickLoginButton();
        Assertions.assertEquals("http://www.demo.guru99.com/V4/manager/Managerhomepage.php", driver.getCurrentUrl());
    }
   @Test
    @DisplayName("TC003")
    public void TestCase003() {
        loginPage = new LoginPage(driver);
        loginPage.setUserName("");
        loginPage.setPassword("UnUqEcE");
        loginPage.clickLoginButton();
        Assertions.assertEquals("http://www.demo.guru99.com/V4/manager/Managerhomepage.php", driver.getCurrentUrl());
    }

    @Test
    @DisplayName("TC004")
    public void TestCase004() {
        loginPage = new LoginPage(driver);
        loginPage.setUserName("mngr330087");
        loginPage.setPassword("");
        loginPage.clickLoginButton();
        Assertions.assertEquals("http://www.demo.guru99.com/V4/manager/Managerhomepage.php", driver.getCurrentUrl());
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}