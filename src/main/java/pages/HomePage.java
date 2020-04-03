package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public LoginPage clickFormAuthentication(){
        clicklLink("Form Authentication");
        return new LoginPage(driver);
    }

    public DropdownPage clickDropdown(){
        clicklLink("Dropdown");
        return new DropdownPage(driver);
    }

    private void clicklLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }

}
