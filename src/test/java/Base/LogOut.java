package Base;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.LoginPage;

public class LogOut {
    WebDriver driver;
    protected LoginPage loginPage;
    protected HomePage homePage;

    @BeforeEach
    public void refresh() {
        System.setProperty("webdriver.chrome.driver", "D:\\selenium\\FinalTestGuru\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://www.demo.guru99.com/V4/");
    }

    @Test
    @DisplayName("TC005")
    public void TestCase005() {
        loginPage = new LoginPage(driver);
        loginPage.setUserName("mngr332012");
        loginPage.setPassword("anyvera");
        loginPage.clickLoginButton();
        homePage = new HomePage(driver);
        homePage.clickLogoutButton();
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}
