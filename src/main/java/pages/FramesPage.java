package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FramesPage {

    private WebDriver driver;

    public FramesPage(WebDriver driver){
        this.driver = driver;
    }

    public NestedFramesPage clickFrames(){
        clicklLink("Nested Frames");
        return new NestedFramesPage(driver);
    }

    private void clicklLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }

}
