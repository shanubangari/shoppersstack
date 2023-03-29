package com.shopperStack.PomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {

	public Home(WebDriver  driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@id='women'  and @name='women']")
	private WebElement WomenLink;
	
	@FindBy(xpath = "//div[@class='MuiBox-root css-5nwj3y']")
	private WebElement AccountSettings;
	

	public WebElement getWomenLink() {
		return WomenLink;
	}
	
	public WebElement getAccountSettings() {
		return AccountSettings;
	}
	public void clickWomenLink() throws InterruptedException {
		Thread.sleep(3000);
		WomenLink.click();
	}
	
	public void clickAccountSettings() throws InterruptedException {
		Thread.sleep(3000);
		AccountSettings.click();
	}
}
