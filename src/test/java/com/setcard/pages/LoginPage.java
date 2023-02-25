package com.setcard.pages;

import com.setcard.utilities.BrowserUtils;
import io.github.cdimascio.dotenv.Dotenv;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(id = "auth-form_userName")
    public WebElement emailInputBox;
    @FindBy(id = "auth-form_password")
    public WebElement passwordInputBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submitButton;

    @FindBy(xpath = "swal2-html-container")
    public WebElement errorMessage;


    public void loginValid() {
        Dotenv dotenv = Dotenv.configure()
                .filename("datas.env")
                .ignoreIfMissing()
                .ignoreIfMalformed()
                .load();
        emailInputBox.sendKeys(dotenv.get("user"));
        passwordInputBox.sendKeys(dotenv.get("password"));
        BrowserUtils.waitFor(1);
        submitButton.click();
        BrowserUtils.waitFor(2);


    }


}
