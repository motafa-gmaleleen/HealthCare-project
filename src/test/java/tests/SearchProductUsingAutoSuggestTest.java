package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.SearchPage;
import pages.productDetailspage;

public class SearchProductUsingAutoSuggestTest extends TestBase{

	
	String productName = "Apple MacBook Pro 13-inch"; 
	SearchPage searchObject ; 
	productDetailspage detailsObject ; 
	
	@Test
	public void UserCanSearchWithAutoSuggest() 
	{
		try {
			searchObject = new SearchPage(driver); 
			searchObject.ProductSearchUsingAutoSuggest("MacB");
			detailsObject = new productDetailspage(driver); 
			Assert.assertEquals(detailsObject.productNamebreadCrumb.getText(), productName);
		} catch (Exception e) {
			System.out.println("Error occurred  " + e.getMessage());
		}
	}
}
