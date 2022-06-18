package com.DSAlgo.Testcases;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.DSAlgo.utilities.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass 
{
	ReadConfig readconfig = new ReadConfig();
	public String baseURL = readconfig.GetApplicationURL();
	public String UserName = readconfig.GetUserName();
	public String Password = readconfig.GetPassword();
	
	public static WebDriver driver;
	 public static Logger logger;
	
	@Parameters("browsername")
	@BeforeClass
	
	
		 public  void Startbrowser(String browser) throws Exception
	     {
	    	if(browser.equals("chrome"))
	    	{
	    		WebDriverManager.chromedriver().setup();
	    		//System.setProperty("webdriver.chrome.driver", readconfig.Getchromepath() );
	    		  driver = new ChromeDriver();
	    		 //driver.get(baseURL);
	    		    
	    	}
	    	else if(browser.equals("edgedriver"))
	    	{
	    		WebDriverManager.edgedriver().setup(); 
	    	//System.setProperty("webdriver.edge.driver", readconfig.GetFirefoxpath());
	    		driver = new EdgeDriver();
	    	}
	    	else if(browser.equals("firefox"))
	    	{
	    		WebDriverManager.firefoxdriver().setup();  
	    	// System.setProperty("webdriver.gecko.driver", readconfig.GetEdgeDriver());
	    		driver = new FirefoxDriver();
	    	}
	    	else 
	    	{
	    		System.out.println("we dont support this browser");
	    		
	    	}

	    	driver.get(baseURL);
	    	
	    	
	    	logger = logger.getLogger("");
	    	PropertyConfigurator.configure("Log4j.Properties");

	    	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	        driver.manage().window().maximize();
	        //driver.get(url);
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	         //return driver;
	     }
}

	     
	/*@AfterClass
	public void teardown()
	{
		driver.quit();
	}
}*/
