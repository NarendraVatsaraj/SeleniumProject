package com.org.page_objects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AdminUserManagement {

	
	@FindBy(id="menu4")
    WebElement userManagementTab;
	
	@FindBy(id="usermode")
	WebElement u_dropDown;
	
	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[2]/div/div/div/div[1]/div/button")
	WebElement addUser;
	
	@FindBy(id="user_name")
	WebElement name;
	
	@FindBy(id="email")
	WebElement email;
	
	@FindBy(id ="addAddress")
	WebElement address;
	
	@FindBy(id ="addAffiliation")
	WebElement affilation;
	
		
	@FindBy(id = "addZipcode")
	WebElement zipcode;
	
	@FindBy(id = "addUserSelect")
	WebElement selectRoleDropDown;
	
	@FindBy(id ="addUserCountry")
	WebElement selectCountryDropDown;
	
	@FindBy(id = "addUserStates")
	WebElement selectUserStateDropDown;
	
	@FindBy(id = "info" )
	WebElement telephoneNumber;
	
	@FindBy(id="addUserButton")
	WebElement addUserDetailsButton;
	
	public  AdminUserManagement(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void userManagentTabClick() {
		userManagementTab.click();
	}
	public void dropDowntemclick() {
		Select select = new Select(u_dropDown);
		   	   
		 List<WebElement> options = select.getOptions();
	     // for each OPTION tag
	     for(WebElement option : options) {
	         // select the OPTION
	         option.click();
	         try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	         // just to show it is working I print out the visible text of each OPTION
	         System.out.printf("%s\n", option.getText());
		   
		   
	     }
		   
		   
	     }
	
	public void addUserButtonClick() {
		addUser.click();
	}
	
	public void enterUserDetails() {
		name.sendKeys("abc user");
		email.sendKeys("abc@xyz.com");
		address.sendKeys("wakad");
		affilation.sendKeys("Optra");
		zipcode.sendKeys("111111");
		Select select = new Select(selectRoleDropDown);
		select.selectByVisibleText("Project Manager");
		Select selectCountry = new Select(selectCountryDropDown);
		selectCountry.selectByVisibleText("India");
		Select selectState = new Select(selectUserStateDropDown);
		selectState.selectByVisibleText("Maharashtra");
		telephoneNumber.sendKeys("2132132123");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void addUserDetailsButtonclick() {
		addUserDetailsButton.click();
	}
}
