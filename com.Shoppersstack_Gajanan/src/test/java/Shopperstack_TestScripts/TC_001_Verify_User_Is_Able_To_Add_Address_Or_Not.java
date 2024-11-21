package Shopperstack_TestScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

//import org.openqa.selenium.WebDriver;
import com.Shoppersstack_Pom.Addressform_page;
import com.Shoppersstack_Pom.MyAddress_Page;
import com.Shoppersstack_Pom.MyProfile_Page;

import Shopperstack_GenericUtility.Base_Test;

public class TC_001_Verify_User_Is_Able_To_Add_Address_Or_Not extends Base_Test {
	@Test

	public void addAddresss() throws IOException, EncryptedDocumentException, InterruptedException {
		Thread.sleep(2000);
		homepage.getaccountSettingsBtn().click();
		homepage.getMyProfileBtn().click();

		MyProfile_Page myProfile_Page = new MyProfile_Page(driver);
		myProfile_Page.getMyAddresseBtn().click();

		Thread.sleep(2000);
		MyAddress_Page myAddress_Page = new MyAddress_Page(driver);
		myAddress_Page.getAddAddressBtn().click();

		Addressform_page addressFormpage = new Addressform_page(driver);

		addressFormpage.getOfficeRB().click();
		addressFormpage.getNameTextfield().sendKeys(fileUtility.readExcelFile("Sheet1", 1, 0));
		Thread.sleep(2000);
		addressFormpage.getHouseTextfield().sendKeys(fileUtility.readExcelFile("Sheet1", 1, 1));

		addressFormpage.getStreetTextfield().sendKeys(fileUtility.readExcelFile("Sheet1", 1, 2));
		addressFormpage.getLandmarkTextfield().sendKeys(fileUtility.readExcelFile("Sheet1", 1, 3));
		webDriver_Utility.selectByValue(addressFormpage.getCountryDropdown(), fileUtility.readPropertyFile("country"));

		webDriver_Utility.selectByValue(addressFormpage.getStateDropdown(), fileUtility.readPropertyFile("state"));
		webDriver_Utility.selectByValue(addressFormpage.getCityDropdown(), fileUtility.readPropertyFile("city"));
		addressFormpage.getPincodeTextfield().sendKeys(fileUtility.readExcelFile("Sheet1", 1, 4));

		addressFormpage.getPhonenumberTextfield().sendKeys(fileUtility.readExcelFile("Sheet1", 1, 5));
		addressFormpage.getAddressbtn().click();
	}
}
