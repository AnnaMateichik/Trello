package tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class LoginTests extends BaseTest{

    @Test
    public void loginPositive() {
        /*
        1. click login\
        2. fill email and continue
        3. fill password and continue
        4. get some validation
         */

        app.getLoginHelper().clickLoginBtn();
        app.getLoginHelper().fillEmailInput("nighthunter12.10@gmail.com");
        app.getLoginHelper().pause(5000);
        app.getLoginHelper().fillPasswordInput("Horok2304!!!");
        Assert.assertTrue(app.getLoginHelper().isTextWorkspaceDisplays());
    }

    @Test
    public void loginNegativePassword() {
        app.getLoginHelper().clickLoginBtn();
        app.getLoginHelper().fillEmailInput("nighthunter12.10@gmail.com");
        app.getLoginHelper().pause(5000);
        app.getLoginHelper().fillPasswordInput("horok2304!!!");
        Assert.assertFalse(app.getLoginHelper().isElementWorkspaceExist());
    }

    @Test
    public void loginNegativePasswordErrorMessage() {
        app.getLoginHelper().clickLoginBtn();
        app.getLoginHelper().fillEmailInput("nighthunter12.10@gmail.com");
        app.getLoginHelper().pause(5000);
        app.getLoginHelper().fillPasswordInput("horok2304!!!");
        Assert.assertTrue(app.getLoginHelper().isWrongPasswordTextDisplays());
    }

}