package AppTest.Steps;

import AppTest.AppDriver.AppDriver;
import AppTest.PageBucket.PageBucket;
import AppTest.Pages.LoginPage;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.By;

public class LoadingSteps {
    @Given("User opened the app")
    public void userOpenedTheApp() {
        AndroidDriver<AndroidElement> androidDriver = AppDriver.connectDriver();
        PageBucket.loginPage = new LoginPage(androidDriver);
        Assert.assertTrue(PageBucket.loginPage.androidDriver.findElement(By.id(PageBucket.loginPage.idLoginButton)).isDisplayed());
        Assert.assertTrue(PageBucket.loginPage.androidDriver.findElement(By.id(PageBucket.loginPage.idRegisterLink)).isDisplayed());
        Assert.assertTrue(PageBucket.loginPage.androidDriver.findElement(By.id(PageBucket.loginPage.idInputEmail)).isDisplayed());
        Assert.assertTrue(PageBucket.loginPage.androidDriver.findElement(By.id(PageBucket.loginPage.idInputPassword)).isDisplayed());
    }
}
