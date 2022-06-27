package com.DSAlgo.Testcases;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.DSAlgo.pageobjects.HomePage;
import com.DSAlgo.pageobjects.Queue;


public class QueueTest extends BaseClass 
{
 public WebDriver driver;
 
 
   
 
 @Test
	public void ClickQueueTest() throws InterruptedException
	{
	 
		Queue q = new Queue(BaseClass.driver);
		
		JavascriptExecutor js = (JavascriptExecutor) q.driver;
		 js.executeScript("arguments[0].scrollIntoView();",q.Button);		
		q.ClickQueueGetStarted();
		Thread.sleep(3000);
		
		
		q.ImplementationButtonTest();
		q.TryhereTest();

		q.ImplementationArrayTest();
        q.TryhereTest();
        
		q.ImplementationColletionTest();
        q.TryhereTest();


		q.QueueOperationsTest();
        q.TryhereTest();
        
	}
 
 
  
      
}
