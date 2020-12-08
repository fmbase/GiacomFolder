package Pages;

import Base.BaseUtil;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class JavaScriptAlertsPage extends BaseUtil {

    private BaseUtil base;

    public JavaScriptAlertsPage (BaseUtil base) {
        this.base = base;
    }


    @And("^I click on link JavaScripts Alerts$")
    public void iClickOnLinkJavaScriptsAlerts() {
        WebElement EntryAd = base.driver.findElement(By.linkText("JavaScript Alerts"));
        EntryAd.click();
    }

    @When("^I click Button Js Alert$")
    public void iClickButtonJsAlert() {
        WebElement JsAlert = base.driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button"));
        JsAlert.click();

    }

    @Then("^User can close the popup alert$")
    public void userCanCloseThePopupAlert() {
        base.driver.switchTo().alert().accept();
    }

    @And("^User can see: You successfuly clicked an alert on the Javascript Alert Page$")
    public void userCanSeeYouSuccessfulyClickedAnAlertOnTheJavascriptAlertPage() {
        WebElement VerifyWording1 = base.driver.findElement(By.id("result"));
        String text = VerifyWording1.getText();
        System.out.println("Verify text for Js Alert Page: " + text);

        if(text.contains ("You successfuly clicked an alert")) {

            System.out.println("Expected text is obtained: Passed");

        } else{

            System.out.println("Expected text is not obtained: Failed");

        }
    }

    @And("^I click on button JS confirm$")
    public void iClickOnButtonJSConfirm() {
        WebElement Jsconfirms = base.driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button"));
        Jsconfirms.click();
    }

    @And("^User can see the alert$")
    public void userCanSeeTheAlert() {
        String Alertmessage1 = base.driver.switchTo().alert().getText();
        System.out.println(Alertmessage1);
    }

    @And("^User can close the alert popup$")
    public void userCanCloseTheAlertPopup() {
        base.driver.switchTo().alert().dismiss();
    }

    @And("^User can see You clicked Cancel on the Javascript Alert Page$")
    public void userCanSeeYouClickedCancelOnTheJavascriptAlertPage() {
        WebElement VerifyWording2 = base.driver.findElement(By.id("result"));
        String text = VerifyWording2.getText();
        System.out.println("Verify text for Js Alert Page: " + text);

        if(text.contains ("You clicked: Cancel")) {

            System.out.println("Expected text is obtained: Passed");

        } else{

            System.out.println("Expected text is not obtained: Failed");

        }
    }

    @And("^I click on button JS Prompt$")
    public void iClickOnButtonJSPrompt() {
        WebElement JsPrompt = base.driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button"));
        JsPrompt.click();
    }

    @Then("^User can enter text check(\\d+) into pop up window$")
    public void userCanEnterTextCheckIntoPopUpWindow(int arg0) {
        base.driver.switchTo().alert().sendKeys("check1");
    }

    @And("^I can see You entered check(\\d+) on the Javascript alert page$")
    public void iCanSeeYouEnteredCheckOnTheJavascriptAlertPage(int arg0) {
        base.driver.switchTo().alert().accept();
        WebElement VerifyWording3 = base.driver.findElement(By.id("result"));
        String text = VerifyWording3.getText();
        System.out.println("Verify text for Js Alert Page: " + text);

        if(text.contains ("You entered: check1")) {

            System.out.println("Expected text is obtained: Passed");

        } else{

            System.out.println("Expected text is not obtained: Failed");

        }
    }
}
