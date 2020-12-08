package Pages;

import Base.BaseUtil;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Iterator;
import java.util.Set;

public class MultipleWindowsPage extends BaseUtil {

    private BaseUtil base;

    public MultipleWindowsPage (BaseUtil base) {
        this.base = base;

    }

    @When("^I click on the Multiple Windows link$")
    public void iClickOnTheMultipleWindowsLink() {
        WebElement MultipleWindow = base.driver.findElement(By.linkText("Multiple Windows"));
        MultipleWindow.click();

    }

    @And("^I click on the Click Here link$")
    public void iClickOnTheClickHereLink() {
        WebElement ClickHere = base.driver.findElement(By.linkText("Click Here"));
        ClickHere.click();
    }

    @Then("^a new window is open with text New Window and closed$")
    public void aNewWindowIsOpenWithTextNewWindowAndClosed() {
        String mainwindow = base.driver.getWindowHandle();
        Set <String> s1 =  base.driver.getWindowHandles();
        Iterator<String> i1 = s1.iterator();
        while (i1.hasNext()) {
            String ChildWindow = i1.next();
            if (!mainwindow.equalsIgnoreCase(ChildWindow)) {
                base.driver.switchTo().window(ChildWindow);
                WebElement text = base.driver.findElement(By.xpath("/html/body/div/h3"));
                System.out.println("Heading of child window is: " + text.getText());
                base.driver.close();
            }
        }
        base.driver.switchTo().window(mainwindow);

    }

    @And("^I am redirected to Opening a New Window page$")
    public void iAmRedirectedToOpeningANewWindowPage() {

       WebElement DefaultWindowcheck = base.driver.findElement(By.xpath("//*[@id=\"content\"]/div/h3"));
          System.out.println(DefaultWindowcheck);
    }


}
