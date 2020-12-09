package Pages;

import Base.BaseUtil;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage extends BaseUtil {

    private BaseUtil base;

    public LoginPage(BaseUtil base) {
        this.base = base;

    }

    @cucumber.api.java.en.Given("^I navigate to the login page$")
    public void iNavigateToTheLoginPage() {
        base.driver.navigate().to("http://51.11.162.64:443/");
    }

    @And("^I enter valid username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
    public void iEnterValidUsernameAsAndPasswordAs(String Username1, String Password1) {

        WebElement UserName = base.driver.findElement(By.id("username"));
        UserName.sendKeys("admin");

        WebElement Password = base.driver.findElement(By.id("password"));
        Password.sendKeys("bluebird");

    }

    @When("^I click on the login button$")
    public void iClickOnTheLoginButton() {
        WebElement LoginButton = base.driver.findElement(By.xpath("//*[@id=\"login\"]/button/i"));
        LoginButton.click();

    }

    @Then("^I should see the landing page$")
    public void iShouldSeeTheLandingPage() {

        WebElement element = base.driver.findElement(By.id("flash"));
        String text = element.getText();
        System.out.println("Verify text for Landing Page: " + text);

        if(text.contains ("You logged into a secure area")) {

            System.out.println("Expected text is obtained: Passed");

        } else{

            System.out.println("Expected text is not obtained: Failed");

        }
    }

}
