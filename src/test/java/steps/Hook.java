package steps;

import Base.BaseUtil;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hook extends BaseUtil {

    private BaseUtil base;
    public Hook(BaseUtil base) {
        this.base = base;

    }

    @Before
    public void OpenBrowser() {
           System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "/src/Browser/chromedriver.exe");
           base.driver = new ChromeDriver();
    }

    @After
    public void CloseBrowser(Scenario scenario) {
    base.driver.close();

    }
}
