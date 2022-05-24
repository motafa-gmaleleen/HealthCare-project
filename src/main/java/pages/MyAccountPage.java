package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends PageBase {

	public MyAccountPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(linkText ="My account")
	WebElement myAcountPage;

	@FindBy(linkText = "Change password")
	WebElement changePasswordpage;

	@FindBy(id = "OldPassword")
	WebElement OldPasswordText;

	@FindBy(id = "NewPassword")
	WebElement NewPasswordText;

	@FindBy(id ="ConfirmNewPassword")
	WebElement ConfirmNewPasswordText;

	@FindBy(css="button.button-1.change-password-button")
	WebElement changePasswordButton;

	@FindBy(css ="span.close")
	public WebElement closeresult;

	public void openChangePasswordPage() {
		clickButton(myAcountPage);
	}

	public void changePassword(String oldpass, String newPass) {
		clickButton(changePasswordpage);
		setTextElementtext(OldPasswordText, oldpass);
		setTextElementtext(NewPasswordText, newPass);
		setTextElementtext(ConfirmNewPasswordText, newPass);
		clickButton(changePasswordButton);
		clickButton(closeresult);

	}

}
