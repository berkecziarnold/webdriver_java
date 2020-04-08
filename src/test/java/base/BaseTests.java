package base;

import com.google.common.io.Files;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITest;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import utils.EventReporter;
import utils.WindowManager;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class BaseTests {

    private WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new EventFiringWebDriver(new ChromeDriver());
        ((EventFiringWebDriver) driver).register(new EventReporter());
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        goHome();
    }

    @BeforeMethod
    public void goHome(){
        driver.get("https://the-internet.herokuapp.com/");
        homePage = new HomePage(driver);
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

    @AfterMethod
    public void recordFailure(ITestResult result){
        if(ITestResult.FAILURE == result.getStatus())
        {
            var camera = (TakesScreenshot)driver;
            File screenshot = camera.getScreenshotAs(OutputType.FILE);

            try {
                Files.move(screenshot, new File("resources/screenshots/" + result.getName() + ".png"));
            }catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public WindowManager getWindowManager(){
        return new WindowManager(driver);
    }



    public void example1(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver(); //elindituk a bongeszot
        driver.get("https://the-internet.herokuapp.com/");

        WebElement shiftingContent = driver.findElement(By.linkText("Shifting Content"));
        shiftingContent.click();
        WebElement ex1 = driver.findElement(By.linkText("Example 1: Menu Element"));
        ex1.click();
        List<WebElement> menuItems = driver.findElements(By.tagName("li"));
        System.out.println(menuItems.size());

        driver.quit();
    }

}
