package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Testbase;

public class Loginfunctionality extends Testbase {
	
	@FindBy(id="email")
	WebElement user;
	
	@FindBy(id="password")
	WebElement pass;
	
	@FindBy(xpath="//button[text()='Sign In']")
	WebElement signinbtn;
	
	
	public Loginfunctionality(WebDriver driver)
	{
		
		PageFactory.initElements(driver,this);
	}
	
	public Homepage validatelogin() 
	{
		user.sendKeys(props.getProperty("username"));
		pass.sendKeys(props.getProperty("password"));
		signinbtn.click();
		
		return new Homepage ();
		
	}
}

