package Pages;

import Base.BaseUtil;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LogoutPage extends BaseUtil {

    private BaseUtil base;

    public LogoutPage(BaseUtil base) {
        this.base = base;

    }

    @When("^I click on the logout button$")
    public void iClickOnTheLogoutButton() {
        WebElement LogoutButton = base.driver.findElement(By.xpath("//*[@id=\"content\"]/a/i"));
        LogoutButton.click();

    }

    @Then("^I am redirected to the login Page$")
    public void iAmRedirectedToTheLoginPage() {

        WebElement element = base.driver.findElement(By.id("flash"));
        String text = element.getText();

        System.out.println("Verify text for Logout Page: " + text);

        if(text.contains ("You logged out of the secure area!")) {

            System.out.println("Expected text is obtained: Passed");

        } else{

            System.out.println("Expected text is not obtained: Failed");

        }
    }
}
