package com.setcard.step_defs;

import com.setcard.pages.LoginPage;
import com.setcard.utilities.BrowserUtils;
import com.setcard.utilities.Driver;
import com.setcard.utilities.EnvUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class LoginStepDefs {

    LoginPage loginPage = new LoginPage();


    @When("User enter the valid credentials")
    public void userEnterTheValidCredentials() {
        loginPage.loginValid();


    }

    @Then("User should be able to log in")
    public void userShouldBeAbleToLogIn() {
        String actualURL = Driver.get().getCurrentUrl();
        System.out.println(actualURL);
        Assert.assertTrue(actualURL.contains("dashboard"));
    }


    @Given("User on the main URL")
    public void userOnTheMainURL() {

        String url = EnvUtil.getFromEnv("url");
        Driver.get().get(url);

    }

    @When("User enter {string} and {string} and should be able to see {string} message")
    public void userEnterAndAndShouldBeAbleToSeeMessage(String arg0, String arg1, String arg2) {

        if ((arg0.equals("")) && (arg1.equals(arg1))) {
            loginPage.emailInputBox.sendKeys(arg0);
            loginPage.passwordInputBox.sendKeys(arg1);
            loginPage.submitButton.click();
            BrowserUtils.waitFor(1);
            String actualUserNameError = Driver.get().findElement(By.id("auth-form_userName_help")).getText();
            Assert.assertTrue(actualUserNameError.equals(arg2));

        } else if ((!arg0.equals("")) && (arg1.equals(""))) {
            loginPage.emailInputBox.sendKeys(arg0);
            loginPage.passwordInputBox.sendKeys(arg1);
            loginPage.submitButton.click();
            BrowserUtils.waitFor(1);
            String actualUserNameError = Driver.get().findElement(By.id("auth-form_password_help")).getText();
            Assert.assertTrue(actualUserNameError.equals(arg2));

        }else if((arg0.equals("")) && (arg1.equals(""))){
            loginPage.emailInputBox.sendKeys(arg0);
            loginPage.passwordInputBox.sendKeys(arg1);
            loginPage.submitButton.click();
            BrowserUtils.waitFor(1);
            String actualUserNameError = Driver.get().findElement(By.id("auth-form_password_help")).getText();
            String actualUserNameError2 = Driver.get().findElement(By.id("auth-form_password_help")).getText();
            Assert.assertTrue(actualUserNameError.equals(arg2));
            Assert.assertTrue(actualUserNameError2.equals(arg2));
        } else {
            loginPage.emailInputBox.sendKeys(arg0);
            loginPage.passwordInputBox.sendKeys(arg1);
            loginPage.submitButton.click();
            BrowserUtils.waitFor(1);
            String actualUserNameError = Driver.get().findElement(By.id("swal2-html-container")).getText();
            Assert.assertTrue(actualUserNameError.equals(arg2));

        }
    }

}