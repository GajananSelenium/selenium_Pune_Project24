package Shopperstack_GenericUtility;

import java.io.File;
import java.io.IOException;
//import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners_Utility  implements ITestListener{
	Java_Utility java_Utility = new Java_Utility();
	
	@Override
   public void onTestFailure(ITestResult result) {
		
		TakesScreenshot ts = (TakesScreenshot)Base_Test.sDriver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(FrameworkConstants.ScreenShotPath+java_Utility.dateAndTime()+".png");
		try {
			FileHandler.copy(temp,dest);
		}catch(IOException e) {
			e.printStackTrace();
			
		}
	}
}
