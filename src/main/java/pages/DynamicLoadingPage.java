package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {

    private WebDriver driver;

    public DynamicLoadingPage(WebDriver driver){
        this.driver = driver;
    }

    public DynamicLoadingExample1Page clickExample1(){
        clicklLink("Example 1: Element on page that is hidden");
        return new DynamicLoadingExample1Page(driver);
    }

    public DynamicLoadingExample2Page clickExample2(){
        clicklLink("Example 2: Element rendered after the fact");
        return new DynamicLoadingExample2Page(driver);
    }

    private void clicklLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }

}
