package com.Shoppersstack_Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart_Page {

	public Cart_Page(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	
	}
	@FindBy(xpath =  "//span[text()='Buy Now']")
	private WebElement buyNowBtn;
	
	public WebElement getByNowBtn() {
		return buyNowBtn;
		
	}

}
