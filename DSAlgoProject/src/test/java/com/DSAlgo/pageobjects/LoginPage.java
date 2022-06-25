package com.DSAlgo.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.DSAlgo.Testcases.BaseClass;

public class LoginPage  extends BaseClass
{

	public WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(name="username")
	@CacheLookup
	WebElement UserName;
	
	@FindBy(xpath="//input[@type='password']")
	@CacheLookup
	WebElement Password;
	
	@FindBy(xpath="//*[@id=\"navbarCollapse\"]/div[2]/ul/a[3]")
	@CacheLookup
	WebElement XPath;
	
	
	public void TypeUsername(String uname)
	{
		UserName.sendKeys(uname);
		
	}
	
	public void TypePassword(String pwd)
	{
		Password.sendKeys(pwd);
	}
	
	
	public  void ClickloginButton()
	{
		XPath.click();
		//HomePage.Hp = new HomePage();
		
		
		//return HP;
	}
}

