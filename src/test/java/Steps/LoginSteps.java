package Steps;

import com.qacart.base.Base;
import com.qacart.pages.HomePage;
import com.qacart.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;


public class LoginSteps extends Base {
    LoginPage loginPage;
    HomePage homePage;

    @Given("User open the website and navigate to login page")

    public void user_open_the_website_and_navigate_to_login_page() {
        LaunchBrowser();

    }
    @When("User fill email as {string} and password as {string} and click on login")
    public void user_fill_email_and_password_and_click_on_login(String username,String password) throws InterruptedException {
        loginPage=new LoginPage();
        homePage=loginPage.performLogin(username,password);

       // driver.findElement(By.name("username")).sendKeys(username);
        // driver.findElement(By.name("password")).sendKeys(password);
       // driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div/input")).click();
    }

    @Then("User should navigate to home page")
    public void user_should_navigate_to_home_page() throws InterruptedException {
      homePage.IsLogoDisplayed();

    }
    @Then("error message should appear")
    public void error_message_should_appear(){
        Assert.assertTrue(driver.findElement(By.name("username")).isDisplayed());

    }


}
