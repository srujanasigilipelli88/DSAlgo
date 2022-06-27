package com.DSAlgo.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TreesPage 
{
	WebDriver driver;
	public TreesPage()
	{
	PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath="//a[normalize-space()='Overview of Trees']")
	WebElement overviewBtn;
	
	@FindBy(xpath="//a[normalize-space()='Terminologies']")
	WebElement terminologiesBtn;

	@FindBy(xpath="//a[normalize-space()='Types of Trees']")
	WebElement typesOfTreeBtn;
	
	@FindBy(xpath="//a[normalize-space()='Tree Traversals']")
	WebElement TreeTraversalsBtn;
	
	@FindBy(xpath="//a[normalize-space()='Traversals-Illustration']")
	WebElement TraversalBtn;

	@FindBy(xpath="//a[normalize-space()='Binary Trees']")
	WebElement BinaryTreesBtn;
	
	@FindBy(xpath="//a[normalize-space()='Binary Tree Traversals']")
	WebElement BinaryTreeTraversals;
	
	@FindBy(xpath="//a[normalize-space()='Implementation of Binary Trees']")
	WebElement ImplementationOfBinaryTrees;
	
	@FindBy(xpath="//a[normalize-space()='Applications of Binary trees']")
	WebElement ApplicationsOfBinaryTrees;
	
	@FindBy(xpath="//a[normalize-space()='Binary Search Trees']")
	WebElement BinarySearchTrees;
	
	@FindBy(xpath="//a[normalize-space()='Implementation Of BST']")
	WebElement ImplementationOfBST;
	
	
	public void ClickoverviewBtn()
	{
		overviewBtn.click();
	}

	public void ClickterminologiesBtn()
	{
		terminologiesBtn.click();
	}
	public void ClicktypesOfTreeBtn()
	{
		typesOfTreeBtn.click();
	}
	public void ClickTreeTraversalsBtn()
	{
		TreeTraversalsBtn.click();
	}
	public void ClickTraversalBtn()
	{
		TraversalBtn.click();
	}
	public void ClickBinaryTreesBtn()
	{
		BinaryTreesBtn.click();
	}
	public void ClickBinaryTreeTraversals()
	{
		BinaryTreeTraversals.click();
	}

	public void ClickImplementationOfBinaryTrees()
	{
		ImplementationOfBinaryTrees.click();
	}

	public void ClickApplicationsOfBinaryTrees()
	{
		ApplicationsOfBinaryTrees.click();
	}
	public void ClickBinarySearchTrees()
	{
		BinarySearchTrees.click();
	}
	public void ClickImplementationOfBST()
	{
		ImplementationOfBST.click();
	}
   
	By tryHereBtn = By.xpath("//a[normalize-space()='Try here>>>']");
	By textInput = By.xpath("//div[@class='CodeMirror-scroll']");
	By runBtn = By.xpath("//button[normalize-space()='Run']");
	
	 
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


