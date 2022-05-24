package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase {

	public LoginPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(id = "Email")
	WebElement emailTextBox;

	@FindBy(id = "Password")
	WebElement passwordTextBox;

	@FindBy(css = "button.button-1.login-button")
	WebElement loginbutton;

	public void userCanlogin(String Email, String password) {
		setTextElementtext(emailTextBox, Email);
		setTextElementtext(passwordTextBox, password);
		clickButton(loginbutton);
	}
}
