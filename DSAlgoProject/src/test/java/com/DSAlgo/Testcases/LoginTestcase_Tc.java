package com.DSAlgo.Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.DSAlgo.pageobjects.HomePage;
import com.DSAlgo.pageobjects.LoginPage;

public class LoginTestcase_Tc extends BaseClass
{

      public WebDriver driver;
      



	
@Test   (priority = 3)  
    public void SigninPage() throws InterruptedException
    {
    	 LoginPage lp = new LoginPage(BaseClass.driver);
    	 System.out.println("login object");
    	 lp.TypeUsername(UserName);
    	 lp.TypePassword(Password);
    	 lp.ClickloginButton();
    	 //logger.info("log in test case");
    	 driver.manage().wait(5000);
    }
}
