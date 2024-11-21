package com.Shoppersstack_Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Delivery_AddressPage {

	public Delivery_AddressPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
@FindBy (xpath="//input[@type='radio']")
private WebElement AddressRB;

@FindBy(xpath="//button[text()='Proceed']")
private WebElement proceedBtn;

public WebElement getAddressRB() {
	return AddressRB;
	
}
public WebElement getProceedBtn() {
	return proceedBtn;
	
	
}
}