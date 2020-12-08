package Pages;

import Base.BaseUtil;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ChallengingDomPage extends BaseUtil  {

    private BaseUtil base;

    public ChallengingDomPage (BaseUtil base) {

        this.base = base;
    }

    @When("^I click on link Challenging Dom$")
    public void iClickOnLinkChallengingDom() {
            WebElement EntryAd = base.driver.findElement(By.linkText("Challenging DOM"));
            EntryAd.click();
    }

    @Then("^I click on Challenging Dom Bar$")
    public void iClickOnChallengingDomBar() {
        base.driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[1]")).click();
    }

    @And("^I can see correct value in row two with columnName Sit$")
    public void iCanSeeCorrectValueInRowTwoWithColumnNameSit() {
        WebElement challenge1 = base.driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[2]/table/tbody/tr[3]/td[4]"));
        String value1 = challenge1.getText();
        if(value1.contains("Definiebas2")) {
            System.out.println("I can see Correct Value in row two columnName Sit as: " + value1);
        }else {
            System.out.println("Result should be Definiebas2 not:  " + value1);
        }

    }

    @And("^I can see correct value in row five with columnName Amet$")
    public void iCanSeeCorrectValueInRowFiveWithColumnNameAmet() {

        WebElement challenge2 = base.driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[2]/table/tbody/tr[5]/td[5]"));
        String value2 = challenge2.getText();
        if(value2.contains("Definiebas2")) {
            System.out.println("Passed as I can see Correct Value in row two columnName Sit as: " + value2);
        }else {

            //Requires further clarification as the i feel the acceptance criterial is wrong and I can add further validation:
            System.out.println("Failed as result should be Consequuntur6 not:  " + value2);
        }

    }

    @And("^I can see correct value in row six with columnName Amet$")
    public void iCanSeeCorrectValueInRowSixWithColumnNameAmet() {
        WebElement challenge3 = base.driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[2]/table/tbody/tr[6]/td[5]"));
        String value3 = challenge3.getText();
        if(value3.contains("Consequuntur7")) {
            System.out.println("Passed as I can see Correct Value in row two columnName Sit as: " + value3);
        }else {
            //Requires further clarification as the i feel the acceptance criterial is wrong
            System.out.println("Failed as result should be Consequuntur6 not:  " + value3);
        }

    }
}
