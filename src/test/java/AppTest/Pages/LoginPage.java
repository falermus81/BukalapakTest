package AppTest.Pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class LoginPage extends BasePage {

    public String idLoginButton = "appCompatButtonLogin";
    public String idRegisterLink = "textViewLinkRegister";
    public String idInputEmail = "textInputEditTextEmail";
    public String idInputPassword = "textInputEditTextPassword";

    public LoginPage(AndroidDriver<AndroidElement> androidDriver) {
        super(androidDriver);
    }
}
