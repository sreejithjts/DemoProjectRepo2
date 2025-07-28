package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import Utilities.Excel_Utility;
import Utilities.FakerUtility;
import pages.AdminUsersPage;
import pages.LoginPage;

public class AdminUsersTest extends BaseClass {

	@Test
	public void adminUsersEntry() throws IOException {
		String username = Excel_Utility.getStringData(1,0,"LoginPage");
		String password = Excel_Utility.getStringData(1,1,"LoginPage");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUsername(username);
		loginPage.enterPassword(password);
		loginPage.clickLogin();
		AdminUsersPage adminUsersPage = new AdminUsersPage(driver);
		adminUsersPage.clickAdminUsers();
		adminUsersPage.clicknewButton();
		//String usernamedata =Excel_Utility.getStringData(1,0,"Credentials");
		//String passworddata = Excel_Utility.getStringData(1,1,"Credentials");
		FakerUtility fakerutility = new FakerUtility();
		String usernamedata=fakerutility.creatARandomFirstName();
		String passworddata=fakerutility.creatARandomLastName();
		adminUsersPage.enterUsername(usernamedata);
		adminUsersPage.enterPassword(passworddata);
		adminUsersPage.clickUserTypeField();
		adminUsersPage.clickSaveButton();
		Boolean isSuccessAlertDisplayed=adminUsersPage.isSuccessAlertDisplayed();
		Assert.assertTrue(isSuccessAlertDisplayed);
			
	}

}
