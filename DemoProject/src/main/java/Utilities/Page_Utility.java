package Utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Page_Utility {
public WebDriver driver;
JavascriptExecutor js;
//dropdown by visibletext
	public void selectByVisibleText(WebElement element, String visibleText) {
		Select select = new Select(element);
		select.selectByVisibleText(visibleText);
	}
//dropdown by value
	public void selectByValue(WebElement element,String value)
	{
		Select select = new Select(element);
		select.selectByValue(value);
	}
//dropdown by index
	public void selectByIndex(WebElement element,int index)
	{
		Select select = new Select(element);
		select.selectByIndex(index);
	}
//draganddrop
	public void dragandDrop(WebElement source,WebElement target)
	{
		Actions action=new Actions(driver);
		action.dragAndDrop(source, target).build().perform();
	}
//rightclick
	public void  rightclick(WebElement target)
	{
		Actions action = new Actions(driver);
		action.contextClick(target).build().perform();
	}
//mousehover
	public void mouseHover(WebElement target)
	{
		Actions action = new Actions(driver);
		action.moveToElement(target).build().perform();
	}
//mouseclick
	public void mouseclick(WebElement target)
	{
		Actions action = new Actions(driver);
		action.click(target).build().perform();
	}
//doubleclick
	public void doubleclick(WebElement target)
	{
		Actions action = new Actions(driver);
		action.doubleClick(target).build().perform();
	}
//radio button click
	public void clickRadioButton1(WebElement radioButton)
	{
		if(radioButton.isDisplayed())
		{
			radioButton.click();
		}
	}
//radiobutton click
	public void clickRadioButton2(WebElement radioButton)
	{
		if(radioButton.isEnabled())
		{
			radioButton.click();
		}
	}
//radiobutton click'
	public void clickRadioButton3(WebElement radioButton)
	{
		if(radioButton.isSelected())
		{
			radioButton.click();
		}
	}
//scroll to element
	public void scrollToElement(WebElement element) {
		js.executeScript("arguments[0].scrollIntoView(true);",element);
	}
//click using JavaScript
	public void clickUsingJS(WebElement element) {
		js.executeScript("arguments[0].click();",element);
	}
//set value to an input field using JavaScript
	public void setValueUsingJS(WebElement element,String value) {
		js.executeScript("arguments[0].value="+value+";",element);
	}
//Get value of an element using JavaScript
	public String getValueUsingJS(WebElement element) {
		return (String) js.executeScript("return arguments[0].value",element);
	}
//Scroll down by pixels
	public void scrollDownByPixels(int pixels) {
		js.executeScript("window.scrollBy(0,"+pixels+");");
	}
//Scroll up by pixels
	public void scrollUpByPixels(int pixels) {
		js.executeScript("window.scrollBy(0,-"+pixels+");");
	}
}
