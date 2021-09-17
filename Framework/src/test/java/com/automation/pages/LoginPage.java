/**
 * 
 */
package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author Dell
 *
 */
public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver ldriver) {
		this.driver=ldriver;
		
	}

	@FindBy(name="email") WebElement uname;
	@FindBy(name="password") WebElement pwd;
	@FindBy(xpath="/html/body/div[1]/div/div/form/div/div[3]") WebElement button;
	
	

public void loginToCRM(String username, String pass)
{
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	uname.sendKeys(username);
	pwd.sendKeys(pass);
	
	button.click();
	
}

}
