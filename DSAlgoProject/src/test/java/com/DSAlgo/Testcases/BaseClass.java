package com.DSAlgo.Testcases;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.DSAlgo.utilities.Helper;
import com.DSAlgo.utilities.ReadConfig;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass 
{
	ReadConfig readconfig = new ReadConfig();
	public String baseURL = readconfig.GetApplicationURL();
	public String UserName = readconfig.GetUserName();
	public String Password = readconfig.GetPassword();
	public static WebDriver driver;
	
	
	
	
	
	@Parameters("browsername")
	@BeforeTest
		 public  void Startbrowser(String browser) throws Exception
	     {
	    	if(browser.equals("chrome"))
	    	{
	    		WebDriverManager.chromedriver().setup();
	    		  driver = new ChromeDriver();
	    		    
	    	}
	    	else if(browser.equals("edgedriver"))
	    	{
	    		WebDriverManager.edgedriver().setup(); 
	    		driver = new EdgeDriver();
	    	}
	    	else if(browser.equals("firefox"))
	    	{
	    		WebDriverManager.firefoxdriver().setup();  
	    		driver = new FirefoxDriver();
	    	}
	    	else 
	    	{
	    		System.out.println("we dont support this browser");
	    		
	    	}

	    	driver.get(baseURL);
	        driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
   	
	     }


	     
	@AfterTest
	public void teardown()
	{
		driver.quit();
	}
	
	/*@AfterMethod
	public void tearDownMethod(ITestResult result)
	{
		if(result.getStatus()==ITestResult.FAILURE);
		
		{
			Helper.captureScreenShot(driver);
			
		}
	}*/
	
	
}
