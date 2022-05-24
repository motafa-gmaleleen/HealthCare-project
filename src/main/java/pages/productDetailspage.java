package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class productDetailspage extends PageBase {

	public productDetailspage(WebDriver driver) {
		super(driver);

	}

	@FindBy(css = "strong.current-item")
	public WebElement productNamebreadCrumb;
}
