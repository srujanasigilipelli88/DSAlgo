package com.DSAlgo.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.DSAlgo.Testcases.BaseClass;
import com.github.dockerjava.api.model.Driver;

public class Queue  extends BaseClass
{

	public WebDriver driver;
	
	public  Queue(WebDriver driver) 
	{
	    this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//a[@href='queue']")
	public WebElement Button;
	
	@FindBy(xpath="//a[normalize-space()='Implementation of Queue in Python']")
	public WebElement Implementation_btn;
	
	@FindBy(xpath="//a[normalize-space()='Implementation using collections.deque']")
	WebElement Implementation_collection_btn;
	
	@FindBy(xpath="//a[normalize-space()='Implementation using array']")
	WebElement Implementation_array_btn;
	
	@FindBy(xpath="//a[normalize-space()='Queue Operations']")
	WebElement Queue_operations;
	
	By tryHereBtn = By.xpath("//a[normalize-space()='Try here>>>']");
	By textInput = By.xpath("//div[@class='CodeMirror-scroll']");
	By runBtn = By.xpath("//button[normalize-space()='Run']");
	
	
	public void ClickQueueGetStarted()
	{
		Button.click();
		
	}
	

	public void ImplementationButtonTest()
	{
		Implementation_btn.click();
	}
	

	public void ImplementationColletionTest()
	{
		Implementation_collection_btn.click();
	}
	

	public void ImplementationArrayTest()
	{
		Implementation_array_btn.click();
	}
	

	public void QueueOperationsTest()
	{
		Queue_operations.click();
	}
	
	public void TryhereTest()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(tryHereBtn);
		js.executeScript("arguments[0].scrollIntoView();", element);
		element.click();
		
		
		WebElement textArea = driver.findElement(textInput);
		textArea.sendKeys("print(\"hello\")");
		driver.findElement(runBtn).click();
		driver.navigate().back();
		
		js.executeScript("window.scrollTo(0, 0)");
		
	}
}
