package com.DSAlgo.pageobjects;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.By;
import com.DSAlgo.Testcases.BaseClass;

public class GetStartedPage extends BaseClass
{
 
	 public  WebDriver  driver;
	// By GetStarted = By.xpath("/html/body/div[1]/div/div/a/button");
	 
	 public GetStartedPage(WebDriver driver)
	 {
		// this.driver = driver; 
			PageFactory.initElements(driver,this);
			
	 }
	
	
	@FindBy(xpath="/html/body/div[1]/div/div/a/button")
	@CacheLookup
	public  WebElement  GetStarted;
	
	 
	 public  WebDriver ClickGetStartedButton(WebDriver driver) 
	 {
		 System.out.println("work");
		 //Thread.sleep(2000);
		 GetStarted.click();
		 System.out.println("no");
		return driver;
	 }
	
	
}
