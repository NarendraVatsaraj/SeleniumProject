package com.org.page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AdminDashboard {
	
	@FindBy(xpath="//a[@id='activateusers']/i")
	WebElement activateuserbutton;
	
	@FindBy(id="users")
	WebElement roleDropDown;
	
	@FindBy(xpath="//*[@id=\"form_user_create_btn\"]")
	WebElement activatebutton;
	
	@FindBy(xpath="/html/body/div[4]/div[7]/button[2]")
	WebElement popupokbutton;
	
	@FindBy(xpath="//*[@id=\"menu1\"]/span")
	WebElement dashboardTab;
	    
	@FindBy(xpath="//*[@id=\"page-wrapper\"]/div[1]/div[1]/div[1]/div/div/h3")
	 WebElement activeUsers;
	    
	@FindBy(xpath="//*[@id=\"page-wrapper\"]/div[1]/div[1]/div[2]/div/div/h3")
	 WebElement pendingActivation;
	    
	    @FindBy(xpath="//*[@id=\"page-wrapper\"]/div[1]/div[1]/div[3]/div/div/h3")
	    WebElement pendingVerification;
	    
	    @FindBy(xpath="//*[@id=\"page-wrapper\"]/div[1]/div[1]/div[4]/div/div/h3")
	    WebElement deactivatedUsers;
	public void activateUserActionMenuClick() {
		activateuserbutton.click();
	}
	
	public void selectRoleDropDown() {
		Select select = new Select(roleDropDown);
		select.selectByVisibleText("Project Manager");
		
	}
	
	public void activateUser() {
		activatebutton.click();
	}
	
	public void popOKButtonclick() {
		popupokbutton.click();
	}
	
	
	 public void dashboardMenuClick()
	    {
	    	dashboardTab.click();
	    }
	    
	    public void activeUsersClick()
	    {
	    	activeUsers.click();
	    }
	    
	    public void pendingActivationClick() {
	    	pendingActivation.click();
	    }
	    public void deactivatedUsersClick() {
	    	deactivatedUsers.click();
	    }
	    
	    public void pendingVerificationClick() {
	    	pendingVerification.click();
	    }
	
	
	 public AdminDashboard(WebDriver driver)
	    {
	     //initialize elements
	       PageFactory.initElements(driver, this);

	    }

}
