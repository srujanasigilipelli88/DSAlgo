package com.DSAlgo.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.DSAlgo.Testcases.BaseClass;

public class HomePage extends BaseClass
{
 
	//public WebDriver driver;
	
	public HomePage()
	{
		//this.driver = driver;
		PageFactory.initElements(driver,this);;
		
	}
	 
	@FindBy(linkText="Sign in")
	 WebElement SigninButton;
	
	public void ClickSignin() 
	{
		SigninButton.click();
        
	}
	
	
	
	
	
}
