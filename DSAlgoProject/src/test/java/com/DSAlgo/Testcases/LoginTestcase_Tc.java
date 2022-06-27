package com.DSAlgo.Testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.DSAlgo.pageobjects.LoginPage;
import com.DSAlgo.utilities.ExcelDataProvider;

public class LoginTestcase_Tc extends BaseClass
{

      public WebDriver driver;
      
      public static String filePath ="C:/Users/chakr/git/DSAlgo/DSAlgoProject/TestData/DataDSAlgo.xlsx";
  	
      @DataProvider
      public Object[][] Logincredentials() throws Exception
      {
      	Object[][] GetLoginData=ExcelDataProvider.readExcelData(filePath,"Sheet1");
      	return (GetLoginData);	
      }

	
@Test (priority=3,dataProvider="Logincredentials")
    public void SigninPage(String uname,String pwd ) throws InterruptedException
    {
    	 LoginPage lp = new LoginPage(BaseClass.driver);
    	 System.out.println("login object");
    	 lp.TypeUsername(uname);
    	 lp.TypePassword(pwd);
    	 lp.ClickloginButton();
    	 //driver.manage().wait(5000);
    }


}

