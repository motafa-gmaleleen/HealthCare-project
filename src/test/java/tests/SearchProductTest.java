package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.SearchPage;
import pages.productDetailspage;

public class SearchProductTest extends TestBase {

	String productName = "Apple MacBook Pro 13-inch";
	SearchPage searchObject;
	productDetailspage productDetailsobject;

	@Test
	public void UserCanSearchForProducts() {
		searchObject = new SearchPage(driver);
		searchObject.productSearch(productName);
		searchObject.openproducDetalisPage();
		productDetailsobject = new productDetailspage(driver);
		Assert.assertTrue(productDetailsobject.productNamebreadCrumb.getText().contains(productName));

	}

}
