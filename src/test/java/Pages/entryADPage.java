package Pages;

import Base.BaseUtil;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.eo.Se;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

import java.util.Iterator;
import java.util.Set;


public class entryADPage extends BaseUtil {

    private BaseUtil base;

    public entryADPage (BaseUtil base) {

        this.base = base;
    }

        @When("^I click on link Entry Ad$")
    public void iClickOnLinkEntryAd() {
            WebElement EntryAd = base.driver.findElement(By.linkText("Entry Ad"));
            EntryAd.click();

        }

    @Then("^I close the Popup Modal window$")
    public void iCloseThePopupModalWindow() {
        Set<String> windowId = base.driver.getWindowHandles();    // get  window id of current window
        Iterator<String> itererator = windowId.iterator();
        String mainWinID = itererator.next();
        String  newAdwinID = itererator.next();

        base.driver.switchTo().window(newAdwinID);
        WebElement email_id= base.driver.findElement(By.xpath("//*[@id=\"modal\"]/div[2]/div[3]/p"));
        email_id.click();
       // base.driver.close();

        base.driver.switchTo().window(mainWinID);
        System.out.println(base.driver.getTitle());

    }

    @And("^I select Option(\\d+) from dropdown menu$")
    public void iSelectOptionFromDropdownMenu(int arg0) {
        Select dropdown = new Select (base.driver.findElement(By.id("dropdown")));
        dropdown.selectByIndex(1);

    }
}
