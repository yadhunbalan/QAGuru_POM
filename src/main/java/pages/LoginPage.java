package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")
    private WebElement userTextBox;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")
    private WebElement passwordTextBox;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
    private WebElement loginButton;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[4]/p")
    private WebElement forgotPasswordQuestion;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]")
    private WebElement invalidCredentials;

    public void setUserName(String userName){
        userTextBox.sendKeys(userName);
    }
    public void setPassword(String password){
        passwordTextBox.sendKeys(password);
    }
    public HomePage clickLoginButton(){
        loginButton.click();
        return PageFactory.initElements(driver, HomePage.class);
    }
    public WebElement userTextBox(){
        return userTextBox;
    }
    public WebElement invalidCredentials(){
        return invalidCredentials;
    }
}
