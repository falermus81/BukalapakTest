package AppTest.Pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.util.List;

public class RegisterPage extends BasePage {
    public String idInputName = "textInputEditTextName";
    public String idInputEmail = "textInputEditTextEmail";
    public String idInputPassword = "textInputEditTextPassword";
    public String idConfirmPassword = "textInputEditTextConfirmPassword";
    public String idRegisterButton = "appCompatButtonRegister";
    public String idLoginLink = "appCompatTextViewLoginLink";

    public List<AndroidElement> androidElements;

    public RegisterPage(AndroidDriver<AndroidElement> androidDriver) {
        super(androidDriver);
    }
}
