package com.DSAlgo.Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.DSAlgo.pageobjects.GetStartedPage;
import com.DSAlgo.utilities.BrowserFactory;

public class GetStartedPageTest extends BaseClass
{
	//WebDriver driver ;
	
	@Test   (priority = 1)      
	public void  getstarted() throws InterruptedException
	{
		
	  GetStartedPage gspage =new GetStartedPage(driver);
	 
	  gspage.ClickGetStartedButton( driver);
	  logger.info("welcome");
	  Thread.sleep(3000);
	  logger.info("nextpage");
	
	//driver.navigate().to(null);
	if(driver.getTitle().equalsIgnoreCase("NumpyNinja"))
	{
		Assert.assertTrue(true);
		logger.info("test passed");
	}
	else 
	{
		Assert.assertTrue(false);
		logger.info("test failed");
	}
	}
	
	
  }

