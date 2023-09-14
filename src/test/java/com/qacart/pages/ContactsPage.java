package com.qacart.pages;

import com.qacart.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactsPage extends Base {
    @FindBy(name = "cs_email")
    WebElement EmailTextField;
    @FindBy(xpath = "//*[@id=\"vContactsForm\"]/table/tbody/tr[1]/td/table/tbody/tr/td[2]/input[3]")
    WebElement AddNewContact;
    @FindBy(name = "first_name")
    WebElement FirstName;
    @FindBy(name = "surname")
    WebElement LastName;
    @FindBy(css = "[value=\"Save\"]")
    WebElement Save;
    @FindBy(css = "[value=\"Next\"]")
    WebElement Next;
}
