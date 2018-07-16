package com.org.tests;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.org.page_objects.LoginPage;

import com.org.page_objects.*;

public class RegisterNewAccountTest {
	
	BaseSetUp bs = new BaseSetUp();
	//WebDriver driver = bs.getDriver();

	@AfterMethod
	public void tearDown(ITestResult result)
	{
		WebDriver driver = bs.getDriver();
	// Here will compare if test is failing then only it will enter into if condition
	if(ITestResult.FAILURE==result.getStatus())
	{
	try 
	{
	// Create refernce of TakesScreenshot
	TakesScreenshot ts=(TakesScreenshot)driver;
	 
	// Call method to capture screenshot
	File source=ts.getScreenshotAs(OutputType.FILE);
	 
	// Copy files to specific location here it will save all screenshot in our project home directory and
	// result.getName() will return name of test case so that screenshot name will be same
	FileUtils.copyFile(source, new File("./Screenshots/"+result.getName()+".png"));
	 
	System.out.println("Screenshot taken");
	} 
	catch (Exception e)
	{
	 
	System.out.println("Exception while taking screenshot "+e.getMessage());
	} 
	 
	} 
	 
	}
	
	
	@Test(priority=13)
    public void launchRegisterAccountPage() {
	  
	  WebDriver driver = bs.getDriver();
	  LoginPage login=new LoginPage(driver);
	  login.createAccountButtonClick();
	  System.out.println("launchRegisterAccountPage() is Automated");
 }
  
    @Test(priority=14)
    public void registerAccountDetails(){
	  
	  WebDriver driver = bs.getDriver();
	  RegisterAccountPage registerAccountPage = new RegisterAccountPage(driver);
	  
	  registerAccountPage.set_username("abx xyz");
	  registerAccountPage.set_email("abc@xyz.com");
	  registerAccountPage.set_password("Optra@123");
	  registerAccountPage.set_Confirmpassword("Optra@123");
	  registerAccountPage.set_affiliation("Optra");
	  registerAccountPage.set_address("Pune");
	  registerAccountPage.selectCountryDropDown();
	  registerAccountPage.selectStateDropDown();
	  registerAccountPage.set_zipcode("123456");
	  registerAccountPage.set_telephobeNumber("1234567890");
	  registerAccountPage.signUpButtonclick();
	  registerAccountPage.okButtonclick();
  }
   @Test(priority=15,enabled=false)
   public void activateRegisteredUser() {
	  WebDriver driver = bs.getDriver();
	  LoginPage login=new LoginPage(driver);
	  login.set_username("N.Vatsaraj@optrahealth.com");
	  login.set_password("Optra@123");
	  login.click_button();
	  AdminDashboard admindashboard = new AdminDashboard(driver);
	  admindashboard.activateUserActionMenuClick();
	    try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	  admindashboard.selectRoleDropDown();
	  admindashboard.activateUser();
	    try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	  admindashboard.popOKButtonclick();
	    try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   
	  login.LogoutDropDownClick();
	    
  }
   
   @Test(priority=16,enabled=false)
   public void loginWithNewlyRegistredUser() {
	      WebDriver driver = bs.getDriver();
		  LoginPage login=new LoginPage(driver);
		  login.set_username("abc@xyz.com");
		  login.set_password("Optra@123");
		  login.click_button();
		  try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		   
		  login.LogoutDropDownClick();
   }
   
   @Test(priority=17)
   public void deleteNewlyRegisteredUser() {
	   
	      WebDriver driver = bs.getDriver();
		  LoginPage login=new LoginPage(driver);
		  login.set_username("N.Vatsaraj@optrahealth.com");
		  login.set_password("Optra@123");
		  login.click_button();
		  AdminUserManagement adminUserManagement = new AdminUserManagement(driver);
		  adminUserManagement.userManagentTabClick();
		  
	   
   }
}
