package test.java;

import org.testng.Assert;
import org.testng.annotations.Test;

import main.java.base.BaseTest;
import main.java.pages.LoginPage;


public class LoginTest extends BaseTest{
	
	private String username="Admin";
	private String password="admin123";	
	
	@Test
	public void testValidLogin() 
	{
		//Login functionality Test
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUserName(username);
		loginPage.enterPassword(password);
		loginPage.clickLogin();
		
	   Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	//   Assert.assertEquals(driver.getCurrentUrl(), "OrangeHRM");
		
	}

}
