import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class BaseTest {
    public WebDriver driver;
    @BeforeClass
    public void OpenBrowser() throws InterruptedException {
     System.setProperty("webdriver.chrome.driver","/Users/yadhubalan/IdeaProjects/Selenium_Study/src/main/resources/chromedriver");
     driver = new ChromeDriver();
     driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
     driver.manage().window().maximize();
     Thread.sleep(2000);


    }



    @AfterClass
    public void CloseBrowser(){
        driver.close();
    }
}
