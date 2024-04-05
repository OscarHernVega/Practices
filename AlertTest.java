package selenium;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AlertTest extends BaseTest {
    private final By JS_ALERT = By.xpath(String.format(PRECISE_TEXT_XPATH, "JavaScript Alerts"));
    private final By CLICK_FOR_JS_ALERT_BUTTON = By.xpath("//button[@onclick='jsAlert()']");

    @Test
    public void alertTest() {
        Assert.assertTrue(driver.findElement(By.xpath(JS_ALERT)).isDisplayed(), message("alert is not displayed"));
        driver.findElement(JS_ALERT).click();
        Assert.assertTrue(!driver.findElements(By.xpath(CLICK_FOR_JS_ALERT_BUTTON)).isEmpty(), message("button alert is not displayed"));
        driver.findElement(CLICK_FOR_JS_ALERT_BUTTON).click();
        

        // todo: accept alert
        // todo: assert success message
    }

}

