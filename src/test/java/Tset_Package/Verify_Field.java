package Tset_Package;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.shams.excel.reader.Xlsx_Reeader_EAL;

import Test_Case.Registration_Main_Page_dataprovider;
import Utilitis.BaseClass;

public class Verify_Field extends BaseClass {
	
	
	
  @Test(dataProvider = "yourstore")
  public void f(String firstname,String lastname,String email,String telenog,String password,String cofirmpass ) throws InterruptedException {
	  test = reports.createTest("Validate the dataprovider").assignAuthor("Maria").assignDevice("windows and chrome").assignCategory("smoke");
	  Registration_Main_Page_dataprovider ob4 = new Registration_Main_Page_dataprovider(driver); 
	 
	  ob4.fname(firstname);
	  Thread.sleep(3000);
	  ob4.lname(lastname);
	  Thread.sleep(3000);
	  ob4.email_add(email);
	  Thread.sleep(2000);
	  ob4.telephonenumber(telenog);
	  ob4.pass(password);
	  Thread.sleep(2000);
	  ob4.confirmepass(cofirmpass);
	  ob4.privecypolicy();
	  ob4.enter();
	  driver.navigate().back();
	  Thread.sleep(3000);
	  ob4.clear();
	  test.pass("Validate the dataprovider successfully");
	  
  }
	  
	  
	  
	  
  @DataProvider(name= "yourstore")
  public Object[][] yourstore_login() {
	  
	 String excel_file_path =  "C:\\GITHUB\\maria'github\\PrecticDemoProject\\TestData\\testdata.xlsx";
	 Xlsx_Reeader_EAL reeader = new Xlsx_Reeader_EAL(excel_file_path);
	  Object[][] data = reeader.getSheetData("yourstore_login");
	  return data;
     
  }
	  
	  
	  
	  
	  
	  
	  
	  
  
}
