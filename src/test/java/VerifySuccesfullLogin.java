import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class VerifySuccesfullLogin extends BaseTest{
    @Test
    public void verifySuccesfulLogin(){
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.setUserName("Admin");
        loginPage.setPassword("admin123");
        loginPage.clickLoginButton();
        //HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        Assert.assertEquals(driver.getTitle(), "OrangeHRM");

    }
}
