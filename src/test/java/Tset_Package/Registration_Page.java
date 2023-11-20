package Tset_Package;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Test_Case.Registation_Main_page2;
import Test_Case.Register_Main_page;
import Test_Case.Registration_Main_Page3;
import Utilitis.BaseClass;


public class Registration_Page extends BaseClass {
	
	
  @Test
  public void Validate_Webpage() throws InterruptedException {
	  test = reports.createTest("launch browser and Validate_Webpage").assignAuthor("Maria").assignDevice("windows and chrome").assignCategory("smoke");
	  Register_Main_page rmp = new Register_Main_page(driver);
	  Thread.sleep(3000);
	  
	  String url = driver.getCurrentUrl();
	  System.out.println(url);
	  SoftAssert sk = new SoftAssert();
	  sk.assertEquals(url,"https://tutorialsninja.com/demo/index.php?route=account/register","verify the url");
	  sk.assertAll();  
	  test.pass("user lunched website successfully"); 
  }
	  
	
  @Test
  public void Verify_error_message() throws InterruptedException { 
	  test = reports.createTest("Verify_error_message").assignAuthor("Maria").assignDevice("windows and chrome").assignCategory("smoke");
	  Register_Main_page ob = new Register_Main_page(driver);
	  Thread.sleep(3000);
	  ob.firstname();
	  ob.lastname();
	  Thread.sleep(3000);
	  ob.emailaddress();
	  ob.phonenumber();
	  Thread.sleep(3000);
	  ob.passw();
	  ob.confirmpassword();
	  ob.polisy();
	  ob.enter();
	  test.info("capture page title");
	  log.info("capture page title");
	  test.pass("Verify_error_message successfully");
  }
  
  @Test
  public void Verify_indication_of_mandatory_fields () throws InterruptedException { 
	  test = reports.createTest("Verify_indication_of_mandatory_fields").assignAuthor("Maria").assignDevice("windows and chrome").assignCategory("smoke");
	  Registation_Main_page2 ob1 = new Registation_Main_page2(driver);
	  ob1.laveloffirstname();
	  Thread.sleep(3000);
	  ob1.laveloflastname();
	  Thread.sleep(3000);
	  ob1.lavelofemail();
	  ob1.lavelofphone();
	  Thread.sleep(3000);
	  ob1.lavelofpassword();
	  ob1.lavelofconfirmpassword();
	  test.pass("Verify_indication_of_mandatory_fields successfully");}
  
  
  
  
  @Test
  public void redirect_to_the_login_page() throws InterruptedException {
	  test = reports.createTest("redirect_to_the_login_page").assignAuthor("Maria").assignDevice("windows and chrome").assignCategory("smoke");
	  Registration_Main_Page3 ob2 = new Registration_Main_Page3(driver);
	  Thread.sleep(3000);
	  ob2.fname();
	  Thread.sleep(3000);
	  ob2.lname();
	  ob2.email();
	  Thread.sleep(3000);
	  ob2.telephonenumber();
	  ob2.pass();
	  ob2.confirmepass();
	  Thread.sleep(3000);
	  ob2.privecypolicy();
	  ob2.enter();
	  test.pass(" redirect_to_the_login_page successfully");	  
	  
	  
  }
  
  
  
  
  
  
  
  
  
  
  
  
 
}
