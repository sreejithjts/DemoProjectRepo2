package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import Utilities.Excel_Utility;
import pages.LoginPage;
import pages.ManageNewsPage;

public class ManageNewsTest extends BaseClass {
@Test
public void manageNews() throws IOException {
String username = Excel_Utility.getStringData(1,0,"LoginPage");
String password = Excel_Utility.getStringData(1,1,"LoginPage");
LoginPage loginpage = new LoginPage(driver);
loginpage.enterUsername(username);
loginpage.enterPassword(password);
loginpage.clickLogin();
//Assert.assertTrue(loginPage.isDashboardDisplyed());
ManageNewsPage manageNewsPage= new ManageNewsPage(driver);
manageNewsPage.clickManageNewsLink();
Assert.assertTrue(manageNewsPage.isManageNewsPageVisible());
manageNewsPage.clickNewButton();
String newsContent=Excel_Utility.getStringData(0,0,"news");
manageNewsPage.enterNewsText(newsContent);
manageNewsPage.clickSaveButton();
Assert.assertTrue(manageNewsPage.isSuccessAlertDisplayed());
}
}