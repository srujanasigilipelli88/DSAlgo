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
	public HomePage hp;
	
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
	
	@FindBy(xpath="//input[@value='Login']")
	
	WebElement XPath;
	
	
	public void TypeUsername(String uname)
	{
		UserName.sendKeys(uname);
		
	}
	
	public void TypePassword(String pwd)
	{
		Password.sendKeys(pwd);
	}
	
	
	public  HomePage ClickloginButton()
	{
		XPath.click();
		//HomePage.Hp = new HomePage();
		
		hp = new HomePage();
		return hp;
	}
}

