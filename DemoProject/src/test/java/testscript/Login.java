package testscript;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login extends BaseClass {
	
@Test
public void LoginTest() {
String username = "admin";
String password = "admin";
WebElement Username = driver.findElement(By.xpath("//input[@placeholder='Username']"));
Username.sendKeys(username);
WebElement Password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
Password.sendKeys(password);
WebElement SignIn = driver.findElement(By.xpath("//button[@type='submit']"));
SignIn.click();
WebElement Dashboard = driver.findElement(By.xpath("//p[text()='Dashboard']"));
Boolean expvalue =Dashboard.isDisplayed();
Assert.assertTrue(expvalue);
}
@Test
public void IncorrectUsername() {
	String username = "Test";
	String password = "admin";
	WebElement Username = driver.findElement(By.xpath("//input[@placeholder='Username']"));
	Username.sendKeys(username);
	WebElement Password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
	Password.sendKeys(password);
	WebElement SignIn = driver.findElement(By.xpath("//button[@type='submit']"));
	SignIn.click();
	WebElement Alert = driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']"));
	Boolean alertvalue= Alert.isDisplayed();
	Assert.assertTrue(alertvalue);
}
@Test
public void IncorrectPassword() {
	String username = "admin";
	String password = "Test";
	WebElement Username = driver.findElement(By.xpath("//input[@placeholder='Username']"));
	Username.sendKeys(username);
	WebElement Password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
	Password.sendKeys(password);
	WebElement SignIn = driver.findElement(By.xpath("//button[@type='submit']"));
	SignIn.click();
	WebElement Alert = driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']"));
	Boolean alertvalue= Alert.isDisplayed();
	Assert.assertTrue(alertvalue);

}
@Test
public void IncorrectUsernameandPassword() {
	String username = "Hello";
	String password = "Test";
	WebElement Username = driver.findElement(By.xpath("//input[@placeholder='Username']"));
	Username.sendKeys(username);
	WebElement Password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
	Password.sendKeys(password);
	WebElement SignIn = driver.findElement(By.xpath("//button[@type='submit']"));
	SignIn.click();
	WebElement Alert = driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']"));
	Boolean alertvalue= Alert.isDisplayed();
	Assert.assertTrue(alertvalue);
}
}
