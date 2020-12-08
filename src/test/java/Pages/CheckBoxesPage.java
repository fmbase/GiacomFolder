package Pages;

import Base.BaseUtil;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckBoxesPage extends BaseUtil {

    private BaseUtil base;

    public CheckBoxesPage (BaseUtil base) {
        this.base = base;

    }

    @When("^I click on link Checkboxes$")
    public void iClickOnLinkCheckboxes() {

        WebElement CheckBoxes = base.driver.findElement(By.linkText("Checkboxes"));
        CheckBoxes.click();

    }

    @Then("^I verify that checkbox two is checked$")
    public void iVerifyThatCheckboxTwoIsChecked() {
        WebElement togglecheckboxes = base.driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[2]"));
        if(togglecheckboxes.isSelected()) {
            System.out.println("Checkbox is Toggled on");
        }else{
            System.out.println("Checkbox is Toggled off");
        }

    }
    @And("^I un-check checkbox two$")
    public void iUnCheckCheckboxTwo() {
        WebElement togglecheckboxes = base.driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[2]"));
        togglecheckboxes.click();
    }

    @And("^I check checkbox one$")
    public void iCheckCheckboxOne() {
        WebElement togglecheckboxes = base.driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]"));
        togglecheckboxes.click();
    }

    @And("^verify that checkbox state is not persistent$")
    public void verifyThatCheckboxStateIsNotPersistent() {
    }
}
