package com.DSAlgo.Testcases;

import org.openqa.selenium.WebDriver;

import com.DSAlgo.pageobjects.TreesPage;

public class TreeTest extends BaseClass
{
	

	public WebDriver driver;
	
	  public void Click_TreeTest()
	  {
		  TreesPage tp = new TreesPage();
		  tp.ClickoverviewBtn();
		  tp.TryhereTest();
		  
		  tp.ClickterminologiesBtn();
		  tp.TryhereTest();

		  tp.ClicktypesOfTreeBtn();
		  tp.TryhereTest();

		  tp.ClickTreeTraversalsBtn();
		  tp.TryhereTest();

		  tp.ClickTraversalBtn();
		  tp.TryhereTest();

		  tp.ClickBinaryTreesBtn();
		  tp.TryhereTest();
		  
		  tp.ClickBinaryTreeTraversals();
		  tp.TryhereTest();
		  
		  tp.ClickImplementationOfBinaryTrees();
		  tp.TryhereTest();
		  
		  tp.ClickApplicationsOfBinaryTrees();
		  tp.TryhereTest();
		  
		  tp.ClickBinarySearchTrees();
		  tp.TryhereTest();
		  
		  tp.ClickImplementationOfBST();
		  tp.TryhereTest();
		  

		  
	  }
	
	
	
}
