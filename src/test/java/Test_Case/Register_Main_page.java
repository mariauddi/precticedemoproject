package Test_Case;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilitis.Common;





public class Register_Main_page extends Common  {
	WebDriver driver;
	
	
	@FindBy(xpath = "//*[@id='input-firstname']")WebElement first_name;
	@FindBy(xpath = "//*[@id='input-lastname']")WebElement last_name;
	@FindBy(xpath = "//*[@id='input-email']")WebElement email;
	@FindBy(xpath = "//*[@id='input-telephone']")WebElement telephon;
	@FindBy(xpath = "//*[@id='input-password']")WebElement password;
	@FindBy(xpath = "//*[@id='input-confirm']")WebElement cinfirm_pass;
	@FindBy(xpath = "//*[@name='agree']")WebElement privacy_policy;
	@FindBy(xpath = "//*[@type='submit']")WebElement continu;
	
	public void firstname(){
		
		waitforcelementclickable(driver,first_name);
		first_name.sendKeys("mim");
	}
		
	public void lastname() {
		last_name.sendKeys("kim");
	}
	
	public void emailaddress() {
		email.sendKeys("kim@gmailcom");
	}
	
	public void phonenumber() {
		telephon.sendKeys("123-123");
	}
	public void passw() {
		password.sendKeys("14");
	}
	public void confirmpassword() {
		cinfirm_pass.sendKeys("146453");
	}
	public void polisy() {
		privacy_policy.click();
	}
	public void enter() {
		continu.click();
	}
	
	
	public Register_Main_page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	
	
	

}
