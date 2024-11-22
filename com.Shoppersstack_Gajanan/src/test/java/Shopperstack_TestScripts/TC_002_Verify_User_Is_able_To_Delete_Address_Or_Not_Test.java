package Shopperstack_TestScripts;

import java.io.IOException;

import org.testng.annotations.Test;

import com.Shoppersstack_Pom.MyAddress_Page;
import com.Shoppersstack_Pom.MyProfile_Page;

import Shopperstack_GenericUtility.Base_Test;

public class TC_002_Verify_User_Is_able_To_Delete_Address_Or_Not_Test  extends Base_Test{
@Test

public void deleteAddress() throws InterruptedException,IOException{
	
	homepage.getaccountSettingsBtn().click();
	homepage.getMyProfileBtn().click();
	
	MyProfile_Page myProfile_Page = new MyProfile_Page(driver);
	myProfile_Page.getMyAddresseBtn().click();
	
	Thread.sleep(2000);
	MyAddress_Page myAddress_Page = new MyAddress_Page(driver);
	myAddress_Page.getDeleteBtn().click();
	Thread.sleep(2000);
	myAddress_Page.getYesBtn().click();
	Thread.sleep(2000);
	driver.switchTo().alert().accept();
	Thread.sleep(2000);
	webDriver_Utility.webPageScreenShot(driver);
	
	
	}

}
