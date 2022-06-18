package com.DSAlgo.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.DSAlgo.Testcases.BaseClass;

public class HomePage 
{
 
	public WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);;
		
	}
	 
	@FindBy(xpath="//*[@id=\\\"navbarCollapse\\\"]/div[2]/ul/a[3]")
	@CacheLookup
	public WebElement SigninButton;
	
	public void ClickSignin() throws InterruptedException
	{
		Thread.sleep(3000);
        
	}
	
	
	
	
	
}
