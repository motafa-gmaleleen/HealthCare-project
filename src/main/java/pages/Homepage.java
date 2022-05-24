package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends PageBase {
	WebDriver driver;

	public Homepage(WebDriver driver) {
		super(driver);
		// this.driver=driver;

	}

	@FindBy(linkText = "Register")
	WebElement registerlink;

	@FindBy(linkText = "Log in")
	WebElement loginLink;

	public void openRegisterationPage() {
		// registerlink.click();
		clickButton(registerlink);

	}

	
	public void openLoginpage() {
		clickButton(loginLink);
	}

}
