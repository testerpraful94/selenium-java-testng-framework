package com.qa.tests;

import com.qa.base.BaseTest;
import com.qa.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {

    @Test(priority = 1)
    public void testValidLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");
        Assert.assertTrue(driver.getCurrentUrl().contains("inventory.html"), "Navigation failed for valid user!");
    }

    @Test(priority = 2)
    public void testLockedOutLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("locked_out_user", "secret_sauce");
        String actualError = loginPage.getErrorMessageText();
        Assert.assertTrue(actualError.contains("Sorry, this user has been locked out."), "Error message mismatch!");
    }
}
