package Shopperstack_TestScripts;

import java.io.IOException;

import org.testng.annotations.Test;

import com.Shoppersstack_Pom.Cart_Page;
import com.Shoppersstack_Pom.Delivery_AddressPage;
import com.Shoppersstack_Pom.Payment_Page;

import Shopperstack_GenericUtility.Base_Test;

public class Tc_003_Verify_User_Is_Able_To_Add_Product_To_Cart_Or_Not extends Base_Test {
	
	@Test
	
	public void orderProduct() throws InterruptedException,IOException{
		Thread.sleep(3000);
		webDriver_Utility.JavaScript(driver, homepage.getFeaturedProduct());
		Thread.sleep(3000);
		homepage.getaddTocartBtn().click();
		homepage.getcartBtn().click();
		Thread.sleep(3000);
		
		Cart_Page cart_Page= new Cart_Page(driver);
		cart_Page.getByNowBtn().click();
		
		Delivery_AddressPage addressPage = new Delivery_AddressPage(driver);
		addressPage.getAddressRB().click();
		Thread.sleep(1000);
		webDriver_Utility.JavaScript(driver,addressPage.getProceedBtn());
		addressPage.getProceedBtn().click();
		
		Payment_Page payment_Page = new Payment_Page(driver);
		webDriver_Utility.ScrollToelement(driver,payment_Page.getCod());
		Thread.sleep(2000);
		payment_Page.getCod().click();
		payment_Page.getProceedBtn().click();
		Thread.sleep(3000);
		webDriver_Utility.webPageScreenShot(driver);
		Thread.sleep(7000);

	
	}

}
