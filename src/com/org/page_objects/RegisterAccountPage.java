package com.org.page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterAccountPage {
	
	
	@FindBy(xpath="//*[@id=\"usernameId\"]")
	WebElement username;
	
	@FindBy(xpath="//*[@id=\"email\"]")
	WebElement email;
	
	@FindBy(xpath="//*[@id=\"password1\"]")
	WebElement password;
	
	@FindBy(xpath="//*[@id=\"password2\"]")
	WebElement confirmpassword;
	
	@FindBy(xpath="//*[@id=\"affiliation\"]")
	WebElement affiliation;
	
	@FindBy(xpath="//*[@id=\"address\"]")
	WebElement address;
	
	@FindBy(xpath="//*[@id=\"addUserCountry\"]")
	WebElement selectcountry;
	
	@FindBy(xpath="//*[@id=\"addUserStates\"]")
	WebElement selectstate;
    
	@FindBy(xpath="//*[@id=\"zipcode\"]")
	WebElement zipcode;
    
	@FindBy(xpath="//*[@id=\"contact_info\"]")
	WebElement telephonenumber;
	
	@FindBy(xpath="//*[@id=\"addUserButton\"]")
	WebElement signupbuton;
	
	@FindBy(xpath="/html/body/div[5]/div[7]/button[2]")
	WebElement okbutton;
	 
	 public void set_username(String usern)
	    {
	     username.clear();
	     username.sendKeys(usern);
	    }
	 
	 public void set_email(String emailaddr) {
		 email.clear();
		 email.sendKeys(emailaddr);
	 }
	    public void set_password(String passwd)
	    {
	     password.clear();
	     password.sendKeys(passwd);
	    }
	
	    public void set_Confirmpassword(String conpasswd)
	    {
	     confirmpassword.clear();
	     confirmpassword.sendKeys(conpasswd);
	    }
	    
	    public void set_affiliation(String affn) {
	    	affiliation.clear();
	    	affiliation.sendKeys(affn);
	  	}
	    
	    public void set_address(String addrs) {
	    	address.clear();
	    	address.sendKeys(addrs);
	    }
	    
	    public void selectCountryDropDown() {
	    	Select select = new Select (selectcountry);
	    	select.selectByVisibleText("India");
	    	
	    }
	    
	    public void selectStateDropDown() {
	    	Select select = new Select (selectstate);
	    	select.selectByVisibleText("Maharashtra");
	    	
	    }
	    
	    public void set_zipcode(String zpcode) {
	    	zipcode.clear();
	    	zipcode.sendKeys(zpcode);
	    }
	    
	    public void set_telephobeNumber(String tel) {
	    	telephonenumber.clear();
	    	telephonenumber.sendKeys(tel);
	    }
	    
	    public void signUpButtonclick() {
	    	signupbuton.click();
	    	try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
	    
	    public void okButtonclick() {
	    	okbutton.click();
	    }
	    
	    public RegisterAccountPage(WebDriver driver)
	    {
	     //initialize elements
	       PageFactory.initElements(driver, this);

	    }
}
