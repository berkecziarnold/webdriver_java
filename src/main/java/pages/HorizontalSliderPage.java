package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HorizontalSliderPage {

    private WebDriver driver;
    private By rangeText = By.id("range");
    private By setSliderNumber = By.xpath("//*[@id=\"content\"]/div/div/input");


    public HorizontalSliderPage(WebDriver driver){
        this.driver = driver;
    }

    public void enterRange(String value){
        for(int i =0; i<=7; i++){
            driver.findElement(setSliderNumber).sendKeys(Keys.RIGHT);
        }
    }

    public String getRange(){
        return driver.findElement(rangeText).getText();
    }


}
