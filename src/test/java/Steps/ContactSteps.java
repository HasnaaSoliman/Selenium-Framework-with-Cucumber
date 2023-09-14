package Steps;


import com.qacart.base.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;

public class ContactSteps extends Base {

    @And("clicks on contacts")
    public void clicks_on_contacts(){
        driver.switchTo().frame("mainpanel");
        driver.findElement(By.linkText("CONTACTS")).click();

    }

    @Then("Email text field should be visible")
    public void emailTextFieldShouldBeVisible() {
        Assert.assertTrue(driver.findElement(By.name("cs_email")).isDisplayed());
    }

    @And("click on add new contacts")
    public void clickOnAddNewContacts() {
        driver.findElement(By.xpath("//*[@id=\"vContactsForm\"]/table/tbody/tr[1]/td/table/tbody/tr/td[2]/input[3]")).click();
    }

    @And("Fill the FirstName and LastName")
    public void fillTheFirstNameAndLastName() {
        driver.findElement(By.name("first_name")).sendKeys("Hasnaa");
        driver.findElement(By.name("surname")).sendKeys("omar");
        driver.findElement(By.cssSelector("[value=\"Save\"]")).click();
    }

    @Then("New contact should be added")
    public void newContactShouldBeAdded() {
        Assert.assertTrue(driver.findElement(By.cssSelector("[value=\"Next\"]")).isDisplayed());
    }

}
