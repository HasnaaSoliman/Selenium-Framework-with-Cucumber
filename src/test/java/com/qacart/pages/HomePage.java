package com.qacart.pages;

import com.qacart.base.Base;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Base {
    public HomePage(){

        PageFactory.initElements(driver,this);
    }

    @FindBy(css = ".logo_text")
    WebElement homepageLogo;
    @FindBy(linkText = "CONTACTS")
    WebElement menuContact;

    public void IsLogoDisplayed() throws InterruptedException {
        Thread.sleep(3000);
        driver.switchTo().frame("mainpanel");
        Assert.assertTrue(homepageLogo.isDisplayed());
    }
}
