package Utilitis;

import java.time.Duration;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;



public class Common  {
	
    
	  public WebDriver driver;
	  public Logger log = (Logger) LogManager.getLogger(Common.class);
	  public String ud= System.getProperty("user.dir");
	  public ITestResult result;
	  
	  public ExtentReports reports = new ExtentReports();//extent
	  public ExtentSparkReporter htmlreporter = new ExtentSparkReporter("Results/MariaExtenReport_" +System.currentTimeMillis()+".html"); //spark
	 // public ExtentSparkReporter htmlreporter = new ExtentSparkReporter("Results/jenkins_extentReport.html"); //spark
	  public ExtentTest test;
	  
	  
		
		public void switchtoOpenWindow(String Parent) {
			Set<String> wins= driver.getWindowHandles();
			for (String sesid :wins) {
				   if(sesid!=Parent) {
				   driver.switchTo().window(sesid);
				   log.info("Window Switched - Driver is present in the new");
				   }}}
				
			
		
		public void waitforcelementclickable(WebDriver driver,WebElement elementvariable) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions.elementToBeClickable(elementvariable));
			log.info("Waiting for element to be clickable");
			
		}

		
		public void waitforpageTitle(String pagetitle, WebDriver driver) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions.titleContains(pagetitle));
			log.info("Waiting for page Tittle to be visible");
			
		}
	
		

		public void configureReport() {
			
			reports.attachReporter(htmlreporter);
			//add system information/environment information to report
			reports.setSystemInfo("Machine","TestPC1");
			reports.setSystemInfo("os", "windows11");
			reports.setSystemInfo("browsere","chrome");
			reports.setSystemInfo("username","maria");
			
			//Configuration to change
			htmlreporter.config().setDocumentTitle("uddin's report");
			htmlreporter.config().setReportName("google test report");
			htmlreporter.config().setTheme(Theme.DARK);
		}
		
	
	
	
	

}
