package tests;


import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Homepage;
import pages.LoginPage;
import pages.MyAccountPage;
import pages.UseRegistrationUser;

public class MyAccountTest extends TestBase{
	
	
	Homepage homeobject ;
	UseRegistrationUser registerobject;
	MyAccountPage myAccountobject;
	LoginPage loginobject;
	
	String Oldpassword="123456789";
	String Newpassword="1234567";
	String Email="testmyy@gmail.com";
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
	@Test(priority = 3)
	public void userRegistrationCanChangePassword() {
			
		
		myAccountobject=new MyAccountPage(driver);
		registerobject.openMyacountPage();
		myAccountobject.openChangePasswordPage();
		myAccountobject.changePassword( Oldpassword,Newpassword);
	//	Assert.assertTrue(myAccountobject.resultChangePassword.getText().contains("Password was change"));
			
	}

	@Test(priority = 4)
	public void RegisterationUserCanLOgout() {
		registerobject =new UseRegistrationUser(driver);
		registerobject.clicklogout();
			
	}
	
	@Test(priority = 5)
	public void RegisterationUserCanlogin() {
		
		homeobject.openLoginpage();
		loginobject=new LoginPage(driver);
		loginobject.userCanlogin(Newpassword, Email);
			
	}
	
	

	
	
	

}
