package com.DSAlgo.utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {

	
	
	
		
    public static WebDriver Startbrowser(WebDriver driver,String browserName,String url)
     {
    	 
    	if(browserName.equals("chrome"))
    	{
    		
    		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sruja\\eclipse-workspace\\DSAlgoProject\\Drivers\\chromedriver.exe");
    		driver = new ChromeDriver();
    	}
    	else if(browserName.equals("edgedriver"))
    	{
    		
    		System.setProperty("webdriver.edge.driver", "./Drivers/MicrosoftEdgeSetup.exe");
    		driver = new EdgeDriver();
    	}
    	else if(browserName.equals("firefox"))
    	{
    		
    		System.setProperty("webdriver.gecko.driver", "./Drivers\\geckodriver.exe");
    		driver = new FirefoxDriver();
    	}
    	else 
    	{
    		System.out.println("we dont support this browser");
    	}
     
     driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
     driver.manage().window().maximize();
     driver.get(url);
     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
      return driver;
     
     }

	public static void quitbrowser(WebDriver driver) 
	{
		driver.quit();
	}
}
