package Utilitis;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JavaScript_U  {
	
	
	public static void clickable(WebDriver driver,WebElement element) {
	JavascriptExecutor jsexecutor = (JavascriptExecutor) driver;
	jsexecutor.executeScript("arguments[0].click()",  element );}
	
	
	
	
     // Scroll up the element
	
	    public static void scrollintoview(WebElement element,WebDriver driver) {
		JavascriptExecutor jsexecutor = (JavascriptExecutor) driver;
		jsexecutor.executeScript("arguments[0].scrollIntoView(true);",  element );}
		
	
	
	
		
	// scroll down the element 
	
	public static void scrollpagedown(WebDriver driver)  {
		JavascriptExecutor jsexecutor = (JavascriptExecutor) driver;
		jsexecutor.executeScript("window.scrollTo(0,document.body.scrollHeight)");}
		
		
		
		
		
		public static void changingcolor(String color,WebElement element,WebDriver driver)  {
			JavascriptExecutor jsexecutor = (JavascriptExecutor) driver;
			jsexecutor.executeScript("arguments[0].style.backgroundColor='" +color+ "'" , element);
				
		 
			try {
				Thread.sleep(200);}
			catch(InterruptedException e) {
				e.printStackTrace();
			}}
			
		
		public static void flash_red(WebElement element,WebDriver driver) {
			String bgcolor = element.getCssValue("backgroundColor");
			System.out.println(bgcolor);
		   for(int i=0;i<50;i++) {
			changingcolor("#FF0000", element, driver);}}
		
		
		public static void flash_black(WebElement element,WebDriver driver) {
			String bgcolor = element.getCssValue("backgroundColor");
			System.out.println(bgcolor);
		   for(int i=0;i<50;i++) {
			changingcolor("#000000", element, driver);
			changingcolor(bgcolor, element, driver);}}
		
		
		public static void flash_green(WebElement element,WebDriver driver) {
			String bgcolor = element.getCssValue("backgroundColor");
			System.out.println(bgcolor);
		   for(int i=0;i<50;i++) {
			changingcolor("#00FF00", element, driver);
			changingcolor(bgcolor, element, driver);}}
		
		
		public static void flash_blue(WebElement element,WebDriver driver) {
			String bgcolor = element.getCssValue("backgroundColor");
			System.out.println(bgcolor);
		   for(int i=0;i<50;i++) {
			changingcolor("#0000FF", element, driver);
			changingcolor(bgcolor, element, driver);}}
		
		
		public static void flash_white(WebElement element,WebDriver driver) {
			String bgcolor = element.getCssValue("backgroundColor");
			System.out.println(bgcolor);
		   for(int i=0;i<50;i++) {
			changingcolor("#FFFFFF", element, driver);
			changingcolor(bgcolor, element, driver);}}
		
	
		
		
		
		public static void drawborder_red(WebElement element,WebDriver driver)  {
			JavascriptExecutor jsexecutor = (JavascriptExecutor) driver;
			jsexecutor.executeScript("arguments[0].style.border='9px solid red'", element);}
			
		
		public static void drawborder_green(WebElement element,WebDriver driver)  {
			JavascriptExecutor jsexecutor = (JavascriptExecutor) driver;
			jsexecutor.executeScript("arguments[0].style.border='9px solid green'", element);}
		
		public static void drawborder_blue(WebElement element,WebDriver driver)  {
			JavascriptExecutor jsexecutor = (JavascriptExecutor) driver;
			jsexecutor.executeScript("arguments[0].style.border='9px solid blue'", element);}
		
		
		
		public static void drawborder_black(WebElement element,WebDriver driver)  {
			JavascriptExecutor jsexecutor = (JavascriptExecutor) driver;
			jsexecutor.executeScript("arguments[0].style.border='9px solid black'", element);}
		
		
		public static void drawborder_white(WebElement element,WebDriver driver)  {
			JavascriptExecutor jsexecutor = (JavascriptExecutor) driver;
			jsexecutor.executeScript("arguments[0].style.border='9px solid white'", element);}
		
		
		
		
		
		public static void generatalert(WebDriver driver,String message)  {
			JavascriptExecutor jsexecutor = (JavascriptExecutor) driver;
			jsexecutor.executeScript("alert('"+message +"')");  } 
			
		
		
		
		public static void select_by_date(WebDriver driver,WebElement element,String datevalue) {
			JavascriptExecutor jsexecutor = (JavascriptExecutor) driver;
			jsexecutor.executeScript("arguments[0].setAttribute('value','"+ datevalue +"')",  element );}
			
		
		
		
}
