package com.DSAlgo.Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.openqa.selenium.By;

import com.DSAlgo.pageobjects.HomePage;

public class HomePageTest extends BaseClass
{

	public WebDriver driver;
	HomePage Hp;
	
	   
	@Test   (priority = 2) 
		public void Login() throws Exception
		{
		HomePage HP = PageFactory.initElements(driver, HomePage.class);
			//HomePage HP = new HomePage(driver);
			System.out.println("home page click sign in");
			HP.ClickSignin();
			System.out.println("home page click sign in");
			
			//driver.manage().wait(5000);
			//logger.info("welcome");

		}
}