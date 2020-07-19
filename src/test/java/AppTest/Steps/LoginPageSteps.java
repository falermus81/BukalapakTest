package AppTest.Steps;

import AppTest.PageBucket.PageBucket;
import AppTest.Pages.RegisterPage;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.springframework.jmx.export.assembler.AbstractMBeanInfoAssembler;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class LoginPageSteps {
    @When("User in Login Page screen {word} on {word}")
    public void userInLoginPageScreenPerformsOnElement(String perform, String element) {
        Assert.assertTrue(PageBucket.loginPage.androidDriver.findElement(By.id(element)).isDisplayed());

        switch (perform.toLowerCase()) {
            case "clicks":
                PageBucket.loginPage.androidDriver.findElement(By.id(element)).click();
                if (element.toLowerCase().equals(PageBucket.loginPage.idRegisterLink.toLowerCase())) {
                    PageBucket.registerPage = new RegisterPage(PageBucket.loginPage.androidDriver);
                }
                break;
            case "clears":
                PageBucket.loginPage.androidDriver.findElement(By.id(element)).clear();
                break;
            default:
                break;
        }
    }
}
