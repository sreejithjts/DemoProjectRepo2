package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AdminUsersPage {

	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin'and@class='small-box-footer']") WebElement adminUsersLink;
	//@FindBy(xpath="//a[@href='javascript:void(0)'and @class='btn btn-rounded btn-danger']") WebElement adminUsersLink;
	//@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin' and @class='nav-link']") WebElement adminUsersLink;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']") WebElement newButtonLink;
	@FindBy(xpath="//input[@id='username']") WebElement usernameEnterField;
	@FindBy(xpath="//input[@id='password']") WebElement passwordEnterField;
	@FindBy(xpath="//select[@id='user_type']") WebElement userTypeField;
	@FindBy(xpath="//button[@type='submit'and @name='Create']") WebElement saveButtonLink;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") WebElement successAlert;
	
	public WebDriver driver;
	public AdminUsersPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void clickAdminUsers()
	{
		adminUsersLink.click();
	}
	public void clicknewButton()
	{
		newButtonLink.click();
	}
	public void enterUsername(String usernameText)
	{
		usernameEnterField.sendKeys(usernameText);
	}
	public void enterPassword(String passwordText)
	{
		passwordEnterField.sendKeys(passwordText);
	}
	public void clickUserTypeField()
	{
		Select select = new Select(userTypeField);
		select.selectByVisibleText("Staff");
	}
	
	public void clickSaveButton()
	{
		saveButtonLink.click();
	}
	
	public boolean isSuccessAlertDisplayed()
	{
		return successAlert.isDisplayed();
	}
}
