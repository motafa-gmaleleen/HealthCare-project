package tests;


import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Homepage;
import pages.LoginPage;
import pages.UseRegistrationUser;

public class UserRegistrationTest extends TestBase {

	
	Homepage homeobject ;
	UseRegistrationUser registerobject;
	LoginPage loginobject;
	
	String Oldpassword="123456789";
	String Email="test1mmm@gmail.com";
     String FName="Mostafa";
     String lName="Gamal";
	@Test(priority = 1)
	public void navigatetohome() {
		
		homeobject =new  Homepage(driver);
		homeobject.openRegisterationPage();
		
	}
	
	
	@Test(priority = 2)
		public void userRegistrationSuccessfully() {
				
			registerobject =new UseRegistrationUser(driver);
			registerobject.userRegistration(FName, lName, Email,Oldpassword);
			Assert.assertTrue(registerobject.Successmessage.getText().contains("Your registration completed"));
				
		}
	
	
	@Test(dependsOnMethods = {"userRegistrationSuccessfully"})
	public void RegisterationUserCanLOgout() {
		
		registerobject.clicklogout();
			
	}
	
	@Test(dependsOnMethods = { "RegisterationUserCanLOgout"})
	public void RegisterationUserCanlogin() {
		
		homeobject.openLoginpage();
		loginobject=new LoginPage(driver);
		loginobject.userCanlogin(Oldpassword, Email);
			
	}
	

	 
	
}
