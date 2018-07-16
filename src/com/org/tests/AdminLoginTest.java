package com.org.tests;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.org.page_objects.AdminDashboard;
import com.org.page_objects.AdminUserManagement;
import com.org.page_objects.LoginPage;







public class AdminLoginTest extends BaseSetUp {
	
	BaseSetUp bs = new BaseSetUp();
	//WebDriver driver;
	@BeforeClass
	public void setUp() {
		driver = getDriver();	
	}
	
	@AfterMethod
	public void tearDown(ITestResult result)
	{
	 
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
    
	@Test(priority=1,enabled=false)
	public void Test_With_Incorrect_Username()
	{
	//	WebDriver driver = bs.getDriver();
	    LoginPage login=new LoginPage(driver);
	    login.set_username("N.Vatsaraj1@optrasystems.com");
	    login.set_password("admin");
	    login.click_button();
	    Assert.assertEquals(driver.findElement(By.xpath("//*[@id='min-error1']")).getText(),"Invalid email or password");
	    try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    System.out.println("Test_With_Incorrect_Username() is Automated");
	}
	@Test(priority=2,enabled=false)
	public void Test_With_Incorrect_Password()
	{
		//WebDriver driver = bs.getDriver();
	    LoginPage login=new LoginPage(driver);
	    login.set_username("N.Vatsaraj@optrasystems.com");
	    login.set_password("adm");
	    login.click_button();
	    Assert.assertEquals(driver.findElement(By.xpath("//*[@id='min-error1']")).getText(),"Invalid email or password");
	    try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    System.out.println("Test_With_Incorrect_Password() is Automated");
	}
	@Test(priority=3,enabled=false)
	public void Test_With_Invalid_Credentials()
	{
		// WebDriver driver = bs.getDriver();
	    LoginPage login=new LoginPage(driver);
	    login.set_username("adm");
	    login.set_password("adm");
	    login.click_button();
	    Assert.assertEquals(driver.findElement(By.xpath("//*[@id='min-error1']")).getText(),"Invalid email or password");
	    try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    System.out.println("Test_With_Invalid_Credentials() is Automated");
	}
	@Test(priority=4,enabled=false)
	public void Test_With_Empty_Credentials()
	{
	//	WebDriver driver = bs.getDriver();
		LoginPage login=new LoginPage(driver);
	    login.set_username("");
	    login.set_password("");
	    login.click_button();
	    Assert.assertEquals(driver.findElement(By.xpath("//*[@id='min-error1']")).getText(),"Invalid email or password");
	    try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    System.out.println("Test_With_Empty_Credentials() is Automated");
	  
	
	}
	
	 @Test(priority=5)
		public void Test_With_Valid_Credentials()
		{
		  //  WebDriver driver = bs.getDriver();
		    LoginPage login=new LoginPage(driver);
		    login.set_username("N.Vatsaraj@optrahealth.com");
		    login.set_password("Optra@123");
		    login.click_button();
		    String actualTitle = driver.getTitle();
		    //System.out.println("title:"+actualTitle);
		    String expectedTitle = "Yunmnm";
		    Assert.assertEquals(expectedTitle,actualTitle);
		    System.out.println("Test_With_Valid_Credentials() is Automated");
		}
	 

	 @Test (priority = 6,enabled=false)
	    public void clickActiveUSersIcon() {
		// WebDriver driver = bs.getDriver();
	    	 try {
	 			Thread.sleep(2000);
	 		} catch (InterruptedException e) {
	 			// TODO Auto-generated catch block
	 			e.printStackTrace();
	 		}	
	  	  System.out.println("Click on Active Users icon");
	  	AdminDashboard admin_dashboard = new AdminDashboard(driver);
	  	admin_dashboard.activeUsersClick();
	  	 try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
	  	admin_dashboard.dashboardMenuClick();
	  	  
	    }
	    
	    @Test(priority = 7,enabled=false)
	    public void clickPendingActivationIcon() {
	    	// WebDriver driver = bs.getDriver();
	    	AdminDashboard admin_dashboard = new AdminDashboard(driver);
	    	admin_dashboard.pendingActivationClick();
	    	 try {
	 			Thread.sleep(2000);
	 		} catch (InterruptedException e) {
	 			// TODO Auto-generated catch block
	 			e.printStackTrace();
	 		}	
	    	 admin_dashboard.dashboardMenuClick();
	    	
	    }
	    
	    @Test(priority = 8,enabled=false)
	    public void clickPendingVerificationIcon() {
	    	// WebDriver driver = bs.getDriver();
	    	AdminDashboard admin_dashboard = new AdminDashboard(driver);
	    	admin_dashboard.pendingVerificationClick();
	    	 try {
	 			Thread.sleep(2000);
	 		} catch (InterruptedException e) {
	 			// TODO Auto-generated catch block
	 			e.printStackTrace();
	 		}	
	    	 admin_dashboard.dashboardMenuClick();
	    	
	    }
	    
	    @Test(priority = 9,enabled=false)
	    public void clickDeactivatedUsersIcon() {
	    	// WebDriver driver = bs.getDriver();
	    	AdminDashboard admin_dashboard = new AdminDashboard(driver);
	    	admin_dashboard.deactivatedUsersClick();
	    	 try {
	 			Thread.sleep(2000);
	 		} catch (InterruptedException e) {
	 			// TODO Auto-generated catch block
	 			e.printStackTrace();
	 		}	
	    	 admin_dashboard.dashboardMenuClick();
	    	
	    }
	    
	    @Test(priority=10,enabled=false)
	    public void dropDownListUserManagement() {
	    	// WebDriver driver = bs.getDriver();
	    	 AdminUserManagement admin_user_management = new AdminUserManagement(driver);
	       admin_user_management.userManagentTabClick();
	       try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
	       admin_user_management.dropDowntemclick();
	    }
	    
	    
	    @Test(priority=11,enabled=false)
	    public void addUser() {
	    	AdminUserManagement admin_User_Mangement = new AdminUserManagement(driver);
	    	admin_User_Mangement.addUserButtonClick();
	    //	admin_User_Mangement.enterUserDetails();
	    //	admin_User_Mangement.addUserDetailsButtonclick();
	    	
	    	
	    
	    }
	    
	    @Test(priority=12)
        	public void adminlogOut()
		{
		    WebDriver driver = bs.getDriver();
		    LoginPage login=new LoginPage(driver);
		    login.LogoutDropDownClick();
		    System.out.println("adminlogOut() is Automated");
		}
	 
	 
	 
}
