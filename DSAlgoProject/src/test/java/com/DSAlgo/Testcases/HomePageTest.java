package com.DSAlgo.Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.openqa.selenium.By;

import com.DSAlgo.pageobjects.HomePage;
import com.DSAlgo.utilities.Helper;

public class HomePageTest extends BaseClass
{

	public WebDriver driver;
	
	   
	@Test   (priority = 2) 
		public void SignInTest()
		{
         HomePage HP = new HomePage();
         HP.ClickSignin();
		}
}