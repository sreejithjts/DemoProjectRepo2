package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import Utilities.Excel_Utility;
import pages.LoginPage;

public class LoginTest extends BaseClass{
	
@Test(groups= {"Regression"})
public void verifyUserIsAbleToLoginWithValidCredentials() throws IOException
{
	//String username = "admin";
	//String password = "admin";
	String username = Excel_Utility.getStringData(1,0,"LoginPage");
	String password = Excel_Utility.getStringData(1,1,"LoginPage");
	LoginPage loginpage = new LoginPage(driver);
	loginpage.enterUsername(username);
	loginpage.enterPassword(password);
	loginpage.clickLogin();
	Boolean ishomepagedisplayed=loginpage.isDashboardDisplayed();
	Assert.assertTrue(ishomepagedisplayed);
}
@Test(retryAnalyzer=retry.Retry.class)
public void verifyUserIsNotAbleToLoginWithInvalidUsernameAndValidPassword()
{
	String username = "Test";
	String password = "admin";
	LoginPage loginpage = new LoginPage(driver);
	loginpage.enterUsername(username);
	loginpage.enterPassword(password);
	loginpage.clickLogin();
	Boolean isalertdisplayed=loginpage.isAlertDisplayed();
	Assert.assertTrue(isalertdisplayed);
}
}
