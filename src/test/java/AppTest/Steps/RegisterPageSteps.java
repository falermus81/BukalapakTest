package AppTest.Steps;

import AppTest.PageBucket.PageBucket;
import AppTest.Pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;

public class RegisterPageSteps {
    @And("User in Register Page screen {word} on {word} with {string}")
    public void userInRegisterPageScreenPerformsOnElementWithValue(String perform, String element, String value) {
        Assert.assertTrue(PageBucket.registerPage.androidDriver.findElement(By.id(element)).isDisplayed());

        switch (perform.toLowerCase()) {
            case "sendskeys":
                PageBucket.registerPage.androidDriver.findElement(By.id(element)).click();
                PageBucket.registerPage.androidDriver.findElement(By.id(element)).sendKeys(value);
                PageBucket.registerPage.androidDriver.navigate().back();
                break;
            case "clicks":
                PageBucket.registerPage.androidDriver.findElement(By.id(element)).click();
                break;
            case "clears":
                PageBucket.registerPage.androidDriver.findElement(By.id(element)).click();
                PageBucket.registerPage.androidDriver.findElement(By.id(element)).clear();
                PageBucket.registerPage.androidDriver.navigate().back();
                break;
            default:
                break;
        }
    }

    @And("User in Register Page screen {word} on {word}")
    public void userInRegisterPageScreenPerformOnElementNoValue(String perform, String element) {
        Assert.assertTrue(PageBucket.registerPage.androidDriver.findElement(By.id(element)).isDisplayed());

        switch (perform.toLowerCase()) {
            case "clicks":
                PageBucket.registerPage.androidDriver.findElement(By.id(element)).click();
                if (element.toLowerCase().equals(PageBucket.registerPage.idRegisterButton.toLowerCase())) {
                    //PageBucket.registerPage = new RegisterPage(PageBucket.loginPage.androidDriver);
                }
                break;
            case "clears":
                PageBucket.registerPage.androidDriver.findElement(By.id(element)).clear();
                break;
            default:
                break;
        }
    }

    @Then("Text {string} in Register Page screen will be displayed")
    public void textInRegisterPageScreenWillBeDisplayed(String message) {
        Assert.assertTrue(PageBucket.registerPage.androidDriver.findElement(By.xpath("//*[contains(@text, \"" + message + "\")]")).isDisplayed());
    }
}
