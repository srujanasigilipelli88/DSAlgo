
package com.DSAlgo.utilities;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.io.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Helper 
{

	public static void captureScreenShot(WebDriver driver)
	{
		File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(src,new File("C://Users//chakr//git//DSAlgo//DSAlgoProject//ScreenShot//" +getCurrentdateFormat() +"Login.png"));
		} catch (IOException e) {
			System.out.println("Unable to capture screenshot" +e.getMessage());
		}
		
	}
	
	public static String getCurrentdateFormat()
	{
		DateFormat format = new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
		Date currentDate = new Date();
		return format.format(currentDate);
	}
	
	public void handlealerts()
	{
		
	}
	
	public void handleWindows()
	{
		
	}
	
	
	
	
	
	
}
