package com.Shoppersstack_Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment_Page {

	public Payment_Page(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
		
	}
	
	@FindBy(xpath ="(//input[@type='radio'])[2]")
	private WebElement Cod;
	
	@FindBy(xpath="//button[text()='Proceed']")
	private WebElement proceedBtn;

	public WebElement getCod() {
		return Cod;
	}
	
	public void getCod(WebElement cod) {
		Cod = cod;
	}

	public WebElement getProceedBtn() {
		return proceedBtn;
	}
	
	public void getProceedBtn(WebElement proceedBtn) {
		this.proceedBtn=proceedBtn;
	}
	
	

}
