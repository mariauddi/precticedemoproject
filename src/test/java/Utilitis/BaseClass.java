package Utilitis;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;

public class BaseClass extends Common{
  
	 
	 @BeforeTest
	    public void beforetest() {
	    	configureReport();
	                }
	    
	    @AfterTest
	    public void sftertest() {
	    	reports.flush();
	    	
	    }
	
	
  @Parameters({"browser", "website"})
  @BeforeClass
	  public void IBrowsers(String NameOfBrowser, String url ) {
			
			if (NameOfBrowser.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();	
			driver = new ChromeDriver();
			driver.get(url);
			log.info("Browser Initialized and went to URL" + url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			log.info("window meximized");}
			
			else if (NameOfBrowser.equalsIgnoreCase("Edge")) {
			WebDriverManager.chromedriver().setup();
			driver= new EdgeDriver();
			driver.get(url);
			log.info("Browser Initialized and went to URL" + url);
			driver.manage().window().maximize();}}  
	  
	  
  
  @AfterClass
  public void afterclass() {
		System.out.println("After Class---- Closing Driver");
		driver.close();
		log.info("browser closed");}
  
  

  public void screenshort(String folder) throws IOException  {
	 
	   	File ss = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    File destinationFilePath = new File( ud + "\\Pictures\\"+folder+"\\"+System.currentTimeMillis()+".jpg");
	    FileHandler.copy(ss, destinationFilePath);
	   	log.info("screenshort captured");}
	   	
 
  public String CaptureScreenshotForER(String folderName) throws IOException  {
    	 
	   	File ss = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    File destinationFilePath = new File( ud + "\\Pictures\\"+folderName+"\\"+System.currentTimeMillis()+".jpg");
	    FileHandler.copy(ss, destinationFilePath);
	   	log.info("screenshort captured for extent report");
	   	String absolutePathLocation = destinationFilePath.getAbsolutePath();
		return absolutePathLocation;
  }
  
  
  
  
  
  
  
  
  
}
