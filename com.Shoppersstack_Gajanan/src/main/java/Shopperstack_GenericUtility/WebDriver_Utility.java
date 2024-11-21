package Shopperstack_GenericUtility;

import java.io.File;

import java.io.IOException;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;



import org.openqa.selenium.TakesScreenshot;

public class WebDriver_Utility {
	Java_Utility java_Utility = new Java_Utility();
	private @Nullable Object ele;

	
	public void selectByValue(WebElement element ,String value) {
		Select sel = new Select(element);
		sel.selectByValue(value);
	}
	public void webPageScreenShot(WebDriver driver) throws IOException {
		 TakesScreenshot ts = (TakesScreenshot) driver;
		 File temp = ts.getScreenshotAs(OutputType.FILE);
		 
		 File dest = new File(FrameworkConstants.ScreenShotPath+java_Utility.dateAndTime()+".png");
		FileHandler.copy(temp,dest);
		
	}
	
	public void WebElementScreenshotAs(WebElement element) throws IOException{
		
	
	File temp = element.getScreenshotAs(OutputType.FILE);

File dest = new File(FrameworkConstants.ScreenShotPath+java_Utility.dateAndTime()+".png");
FileHandler.copy(temp,dest);
}
	public void selectByindex(WebElement element,int index) {
		Select sel = new Select (element);
		sel.selectByIndex(index);
	}
	public void SelectByvisibleText(WebElement element,String visibletext) {
		Select sel = new Select(element);
		sel.deselectByVisibleText(visibletext);
	}
	public void deselectByindex(WebElement element,int index) {
		
		Select sel = new Select(element);
		sel.deselectByIndex(index);
	}
	public void deselectByvalue(WebElement element, String index) {
		Select sel = new Select(element);
		sel.deselectByValue(index);
	}
	public void deSelectByvisibleText(WebElement element, String visibletext) {
		Select sel = new Select(element);
		sel.deselectByVisibleText(visibletext);
	}
	public void deselectAll (WebElement element, String deselectall) {
		Select sel = new Select(element);
		sel.deselectAll();
	}
	public void ScrollToelement(WebDriver driver,WebElement ele) {
		Actions a = new Actions(driver);
		a.scrollToElement(ele);
	}
	public void JavaScript(WebDriver driver,WebElement ele) {
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);",ele);
	}
				
	
	}

