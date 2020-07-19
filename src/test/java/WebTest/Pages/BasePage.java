package WebTest.Pages;

import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {
    public ChromeDriver chromeDriver;

    public BasePage(ChromeDriver chromeDriver) {
        this.chromeDriver = chromeDriver;
    }
}
