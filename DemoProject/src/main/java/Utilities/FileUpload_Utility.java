package Utilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;

public class FileUpload_Utility {
	
	public void fileUploadUsingSendKeys(WebElement element,String path) {
		element.sendKeys(path);
	}
	public void robotClass() throws AWTException
	{
		StringSelection s= new StringSelection("C:\\Users\\Sreejith\\Downloads\\DML-Assignment.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s,null);
		Robot r = new Robot();
		r.delay(3500);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}


	}

