package forgotpassword;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.ForgotPasswordPage;
import pages.EmailSentPage;

import static org.testng.Assert.*;


public class ForgotPasswordTest extends BaseTests {

    @Test
    public void testSuccessfulPassword(){
        ForgotPasswordPage forgotPasswordPage = homePage.clickFormForgotPassword();
        forgotPasswordPage.setEmail("arnoldberkeczi@gmail.com");
        EmailSentPage emailSentPage = forgotPasswordPage.clickRetrievePassword();
        assertTrue(emailSentPage.getAlertText()
                        .contains("Your e-mail's been sent!"),
                "Alert text is incorrect");
    }

}
