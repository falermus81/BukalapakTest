package WebTest.Steps;

import WebTest.Pages.HomePage;
import WebTest.Pages.PageBucket;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePageSteps {
    private String searchString;

    @Given("User opened {string}")
    public void userOpenedWebSite(String webAddress) {
        ChromeDriver chromeDriver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "/Users/falerymustika/WebDriver/chromedriver");

        chromeDriver.get(webAddress);
        Assert.assertEquals("Situs Belanja Online dan Jual Beli Mudah Terpercaya | Bukalapak", chromeDriver.getTitle());

        PageBucket.homePage = new HomePage(chromeDriver);
    }

    @When("User in Home Page screen {word} on {word}")
    public void userInHomePageScreenPerformOnElementNoValue(String perform, String element) {
        Assert.assertTrue(PageBucket.homePage.chromeDriver.findElement(By.id(element)).isEnabled());

        switch (perform.toLowerCase()) {
            case "clicks":
                PageBucket.homePage.chromeDriver.findElement(By.id(element)).click();
                break;
            case "clears":
                PageBucket.homePage.chromeDriver.findElement(By.id(element)).click();
                PageBucket.homePage.chromeDriver.findElement(By.id(element)).clear();
                PageBucket.homePage.chromeDriver.navigate().back();
                break;
            default:
                break;
        }
    }

    @When("User in Home Page screen {word} on {word} with {string}")
    public void userInHomePageScreenPerformOnElementWithValue(String perform, String element, String value) {
        Assert.assertTrue(PageBucket.homePage.chromeDriver.findElement(By.id(element)).isEnabled());

        switch (perform.toLowerCase()) {
            case "clicks":
                PageBucket.homePage.chromeDriver.findElement(By.id(element)).click();
                break;
            case "clears":
                PageBucket.homePage.chromeDriver.findElement(By.id(element)).click();
                PageBucket.homePage.chromeDriver.findElement(By.id(element)).clear();
                PageBucket.homePage.chromeDriver.navigate().back();
                break;
            case "sendskeys":
                //PageBucket.homePage.chromeDriver.findElement(By.id(element)).click();
                PageBucket.homePage.chromeDriver.findElement(By.id(element)).sendKeys(value);
                this.searchString = value;
                //PageBucket.homePage.chromeDriver.navigate().back();
                break;
            default:
                break;
        }
    }

    @And("User in Home Page screen clicks on Search button")
    public void userInHomePageScreenClicksOnSearchButton() {
        WebElement webElement = PageBucket.homePage.chromeDriver.findElement(By.className("v-omnisearch__submit"));
        Assert.assertTrue(webElement.isEnabled());
        webElement.click();
    }

    @Then("Title {string} in Home Page screen will be displayed")
    public void titleInHomePageScreenWillBeDisplayed(String title) {
        Assert.assertEquals("jual produk " + this.searchString.toLowerCase() + " murah dan terlengkap juli 2020 | bukalapak", PageBucket.homePage.chromeDriver.getTitle().toLowerCase());
    }
}
