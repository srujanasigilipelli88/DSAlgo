package extentReports;

import java.awt.Desktop;
//Listener class for generating Extent Report
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.*;

public class ExtentReportsListener extends TestListenerAdapter{

	
	public ExtentSparkReporter htmlReporter;
static	public ExtentReports extent;
	public ExtentTest logger;
	static String repName;
	
	public void onStart(ITestContext testcontext) {
		extent =new ExtentReports();
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		repName = "Test-Report-"+timeStamp+".html";
		File file = new File("C:\\Users\\chakr\\git\\DSAlgo\\DSAlgoProject\\test-output"+repName);
		//htmlReporter =new ExtentSparkReporter("Spark.html");
		htmlReporter =new ExtentSparkReporter("C:\\Users\\chakr\\git\\DSAlgo\\DSAlgoProject\\test-output"+repName);
		
		try {
			htmlReporter.loadXMLConfig("C:\\Users\\chakr\\git\\DSAlgo\\DSAlgoProject\\Extent-reports.xml");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		extent.attachReporter(htmlReporter);
		extent.attachReporter(htmlReporter);
		extent.setSystemInfo("Host name","localhost");
		extent.setSystemInfo("Environemnt","QA");
		extent.setSystemInfo("user","pavan");
		
		htmlReporter.config().setDocumentTitle("DSAlgo Test Project"); // Tile of report
		htmlReporter.config().setReportName("Functional Test Automation Report"); // name of the report
		//htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP); //location of the chart
		htmlReporter.config().setTheme(Theme.DARK);
		
		
	}
	
	public void onTestSuccess(ITestResult tr) 
	{
		logger = extent.createTest(tr.getName()) ;
		logger.log(Status.PASS, MarkupHelper.createLabel(tr.getName(), ExtentColor.GREEN));
		
	}
	
	public void onTestFailure(ITestResult tr) 
	{
		logger = extent.createTest(tr.getName()) ;
		logger.log(Status.PASS, MarkupHelper.createLabel(tr.getName(), ExtentColor.RED));
	
		String screenShotPath = System.getProperty("user.dir")+"\\Screenshot\\"+tr.getName()+".png";
		
		File f = new File(screenShotPath);
		
		if(f.exists()) {
			//logger.fail("Screenshot is below:"+ logger.addScreenCaptureFromPath(screenShotPath));
			try
			{
				logger.fail("ScreenShot Is Below:"+ logger.addScreenCaptureFromPath(screenShotPath));
				
			}
			catch(Exception e) {
				e.getStackTrace();
			}}
			
	}
	public void onTestSkipped(ITestResult tr) 
	{
		logger = extent.createTest(tr.getName()) ;
		logger.log(Status.PASS, MarkupHelper.createLabel(tr.getName(), ExtentColor.ORANGE));
		
	}
	
	public void  onFinish(ITestContext testcontext) {
		extent.flush();
		try {
			Desktop.getDesktop().browse(new File (repName).toURI());
		} catch (IOException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}

