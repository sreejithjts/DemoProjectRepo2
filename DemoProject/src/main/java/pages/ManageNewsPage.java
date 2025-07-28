package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageNewsPage {
	
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news' and @class='active nav-link']")WebElement manageNewsLink;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/news/add']") WebElement newButton;
	@FindBy(xpath="//textarea[@id='news']")WebElement newsTextArea;
	@FindBy(xpath="//button[@type=\"submit\"]") WebElement saveButton;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")WebElement successAlert;
	public WebDriver driver;
	public ManageNewsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}

	public void clickManageNewsLink()
	{
		manageNewsLink.click();
	}
	public void clickNewButton()
	{
		newButton.click();
	}
	public void enterNewsText(String newsText)
	{
		newsTextArea.sendKeys(newsText);
	}
	public void clickSaveButton()
	{
		saveButton.click();
	}
	public boolean isSuccessAlertDisplayed()
	{
		return successAlert.isDisplayed();
	}
	public boolean isManageNewsPageVisible()
	{
		return newButton.isDisplayed();
	}
	}
