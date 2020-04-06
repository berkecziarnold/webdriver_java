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

    public ForgotPasswordPage clickFormForgotPassword(){
        clicklLink("Forgot Password");
        return new ForgotPasswordPage(driver);
    }

    public DropdownPage clickDropdown(){
        clicklLink("Dropdown");
        return new DropdownPage(driver);
    }

    public HoversPage clickHovers(){
        clicklLink("Hovers");
        return new HoversPage(driver);
    }

    public KeyPressesPage clickKeyPresses(){
        clicklLink("Key Presses");
        return new KeyPressesPage(driver);
    }

    public HorizontalSliderPage clickHorizontalSlider(){
        clicklLink("Horizontal Slider");
        return new HorizontalSliderPage(driver);
    }

    public AlertsPage clickJavaScriptAlerts(){
        clicklLink("JavaScript Alerts");
        return new AlertsPage(driver);
    }

    public FileUploadPage clickFileUpload(){
        clicklLink("File Upload");
        return new FileUploadPage(driver);
    }

    public ContextMenuPage clickContextMenu(){
        clicklLink("Context Menu");
        return new ContextMenuPage(driver);
    }

    public WysiwygEditorPage clickWysiwygEditor(){
        clicklLink("WYSIWYG Editor");
        return new WysiwygEditorPage(driver);
    }

    public FramesPage clickFramesPage(){
        clicklLink("Frames");
        return new FramesPage(driver);
    }

    public DynamicLoadingPage clickDynamicLoading(){
        clicklLink("Dynamic Loading");
        return new DynamicLoadingPage(driver);
    }

    private void clicklLink(String linkText){

        driver.findElement(By.linkText(linkText)).click();
    }

}
