package com.shopperStack.PomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Welcome {
	
	public Welcome(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(xpath = "//button[@class='navbar_Loginbutton__O9-64'  and text()='Login']")
	private WebElement loginLink;

	public WebElement getLoginLink() {
		return loginLink;
	}
	
	public void clickOnLoginButton() {
		loginLink.click();
	}
	
}
