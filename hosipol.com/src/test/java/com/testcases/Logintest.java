package com.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Testbase;
import com.pageobjects.Loginfunctionality;

public class Logintest extends Testbase{
	
	//WebDriver driver;
	Loginfunctionality lg;
	
	
	public Logintest()
	{
		super();
	}
	@BeforeMethod
	public void initialize()
	{
		Setup();
		lg= new Loginfunctionality(driver);
		
	}
	@Test(priority = 1)
	public void verifylogin()
	{
		lg.validatelogin();
	
	}
	@Test(priority = 2)
	public void verifyurl() {
		
		lg.validatelogin();
		String url = driver.getCurrentUrl();
		Assert.assertEquals("http://admin.hospiol.com/admin/admin/dashboard", url);
	}
 

}
