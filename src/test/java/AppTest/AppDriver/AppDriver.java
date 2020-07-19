package AppTest.AppDriver;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.remote.MobileCapabilityType;

import java.net.URL;

public class AppDriver {

    public static AndroidDriver<AndroidElement> connectDriver() {
        AndroidDriver<AndroidElement> androidDriver = null;

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.0");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator");
        desiredCapabilities.setCapability(MobileCapabilityType.APP, "/Users/falerymustika/Projects/BukalapakTest/App/testingApp.apk");

        URL url;
        try {
            url = new URL("http://0.0.0.0:4723/wd/hub");
            androidDriver = new AndroidDriver<AndroidElement>(url, desiredCapabilities);
        }
        catch (Exception exception) {
            System.out.println("Error: " + exception.getMessage());
        }

        return androidDriver;
    }

    public static void disconnectDriver(AndroidDriver<AndroidElement> androidDriver) {
        androidDriver.quit();
    }
}
