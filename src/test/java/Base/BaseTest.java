package Base;

public class BaseTest {
    public static void main(String[] args) {
        LoginTest loginTest = new LoginTest();
        loginTest.SetUp();

        NewCustomerTest newCustomerTest = new NewCustomerTest();
        newCustomerTest.SetUp();
    }
}
