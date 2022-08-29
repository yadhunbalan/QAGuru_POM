import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

import java.time.Duration;

public class VerifyIncorrectUserName extends BaseTest{
    @Test
    public void verifyIncorrectuserName(){
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.setUserName("test");
        loginPage.setPassword("admin123");
        loginPage.clickLoginButton();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(loginPage.invalidCredentials()));
        Assert.assertEquals(loginPage.invalidCredentials().getText(), "Invalid credentials");
        //Thread.sleep(2000);


    }
}
