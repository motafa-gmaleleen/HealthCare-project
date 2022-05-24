package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UseRegistrationUser extends PageBase {

	public UseRegistrationUser(WebDriver driver) {
		super(driver);

	}

	@FindBy(id = "gender-male")
	WebElement genderRadioBtn;

	@FindBy(id = "FirstName")
	WebElement firstnameBox;

	@FindBy(id = "LastName")
	WebElement lastnameBox;

	@FindBy(id = "Email")
	WebElement emailTextbox;

	@FindBy(id = "Password")
	WebElement passwordTextBox;

	@FindBy(id = "ConfirmPassword")
	WebElement confirmPasswordTextBox;

	@FindBy(id = "register-button")
	WebElement registerbuttonTextBox;

	@FindBy(css = "div.result")
	public WebElement Successmessage;

	@FindBy(linkText = "Log out")
	public WebElement logoutlink;

	@FindBy(linkText = "My account")
	WebElement myAcountlinkpage;

	public void userRegistration(String firstName, String lastName, String email, String password) {

		/*
		 * //genderRadioBtn.click(); firstnameBox.sendKeys(firstName);
		 * lastnameBox.sendKeys(lastName); emailTextbox.sendKeys(email);
		 * passwordTextBox.sendKeys(password);
		 * confirmPasswordTextBox.sendKeys(password); //registerbuttonTextBox.click();
		 */

		clickButton(genderRadioBtn);
		setTextElementtext(firstnameBox, firstName);
		setTextElementtext(lastnameBox, lastName);
		setTextElementtext(emailTextbox, email);
		setTextElementtext(passwordTextBox, password);
		setTextElementtext(confirmPasswordTextBox, password);
		clickButton(registerbuttonTextBox);
	}

	public void clicklogout() {
		clickButton(logoutlink);

	}

	public void openMyacountPage() {
		clickButton(myAcountlinkpage);

	}

}
