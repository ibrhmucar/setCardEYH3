package com.setcard.pages;

import com.setcard.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Subeler extends BasePage{

    @FindBy (xpath = "//a[@href='/corporatebranch']")
    public WebElement subeler;

    @FindBy (xpath = "//input[@id='CorporateFirmSelectForm_CorporateFirmID']")
    public WebElement enterInformation;

    @FindBy (xpath = "//div[@class='ant-alert-content']")
    public WebElement warningMessage;

    @FindBy (xpath = "(//span[@class='ant-typography ant-typography-secondary'])[3]")
    public WebElement subeVergiNumber;


    public void button(String value){
        Driver.get().findElement(By.xpath("//span[contains(text(),'"+value+"')] ")).click();

    }

    public void taxNumberDropDown(String value){
        Driver.get().findElement(By.xpath("//span[normalize-space()='Vergi No: "+value+"']")).click();

    }


}
