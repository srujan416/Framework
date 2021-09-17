/**
 * 
 */
package com.automation.testcases;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.automation.pages.BaseClass;
import com.automation.pages.LoginPage;
import com.automation.utility.BrowserFactory;
import com.automation.utility.ExcelDataProvider;
import com.automation.utility.Helper;

/**
 * @author Dell
 *
 */
public class LoginTestCRM extends BaseClass{
	
		

	@Test
	public void loginApp()
	{
		
	logger = report.createTest("Login to CRM");
		
	LoginPage loginpage=PageFactory.initElements(driver, LoginPage.class);			
	
	logger.info("Starting Application");
	
	loginpage.loginToCRM(excel.getStringData("login", 0, 0), excel.getStringData("login", 0, 1));
	
	logger.pass("login succesfully");
	
	Helper.captureScreenshot(driver);
	
	}
	
}
