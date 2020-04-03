package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.HomePage;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class BaseTests {

    private WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver(); //elindituk a bongeszot
        driver.get("https://the-internet.herokuapp.com/");
//        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
//        //megszamolja a linkeket az oldalon es kiirja hogy hanyat talalt(listat terit vissza)
//        List<WebElement> links = driver.findElements(By.tagName("a"));
//        System.out.println(links.size());
//
//        //megkeresi az Inputs linket az oldalon és megnyitja
//        WebElement inputLinks = driver.findElement(By.linkText("Inputs"));
//        inputLinks.click();
//
//        System.out.println(driver.getTitle()); //kiirjuk az oldal cimet

        homePage = new HomePage(driver);

        // driver.quit(); //bezarjuk az oldalt
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

//    public static void main(String args[]){
//        BaseTests test = new BaseTests();
//        test.setUp();
//
//    }

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
