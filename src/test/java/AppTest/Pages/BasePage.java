package AppTest.Pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class BasePage {
    public AndroidDriver<AndroidElement> androidDriver;

    public BasePage(AndroidDriver<AndroidElement> androidDriver) {
        this.androidDriver = androidDriver;
    }
}
