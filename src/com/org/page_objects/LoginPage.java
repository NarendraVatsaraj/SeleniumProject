package com.org.page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {
	//test
	

    @FindBy(id="username")
    WebElement username;
    @FindBy(id="password")
    WebElement password;
    @FindBy(id="loginBtn")
    WebElement button;
    
    @FindBy(xpath ="//*[@id=\"wrapper\"]/div[1]/nav/nav/div/a")
    WebElement logoutDropDown;
    
    @FindBy(linkText = "Logout")
    WebElement logoutOption;
    
    
    @FindBy(xpath = "//*[@id=\"register\"]")
	WebElement createAccountButton;
    
    public LoginPage(WebDriver driver)
    {
     //initialize elements
       PageFactory.initElements(driver, this);

    }
    public void set_username(String usern)
    {
     username.clear();
     username.sendKeys(usern);
    }
    public void set_password(String userp)
    {
     password.clear();
     password.sendKeys(userp);
    }
    public void click_button()
    {
     button.click();
    }
    
    public void LogoutDropDownClick() {
    	logoutDropDown.click();
    	try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	logoutOption.click();
    }
    
    public void createAccountButtonClick() {
    	try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
		 createAccountButton.click();
	 }

}
