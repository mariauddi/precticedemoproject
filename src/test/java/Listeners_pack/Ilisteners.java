package Listeners_pack;

import org.testng.ITestListener;
import org.testng.ITestResult;


import Utilitis.BaseClass;

public class Ilisteners extends BaseClass implements ITestListener{

	@Override
	public void onTestSuccess(ITestResult result) {
		this.driver = ((BaseClass)result.getInstance()).driver;
		try {
			screenshort("Success");
			log.info("test passed and screenshot taken");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void onTestFailure(ITestResult result) {
		this.driver = ((BaseClass)result.getInstance()).driver;
		try {
			screenshort("Failed");
			log.info("test Failed and screenshot taken");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		this.driver = ((BaseClass)result.getInstance()).driver;
		try {
			screenshort("Skiped");
			log.info("test Skiped and screenshot taken");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	
	
	

}
