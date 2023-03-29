package com.shopperStack.PomRepo;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericUtils.FileUtility;

public class Login {
	FileUtility fil=new FileUtility();
	public Login(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(xpath = "//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputMarginDense MuiOutlinedInput-inputMarginDense' and @id='Email']")
	private WebElement Email;
	
	@FindBy(xpath = "//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputAdornedEnd MuiOutlinedInput-inputAdornedEnd MuiInputBase-inputMarginDense MuiOutlinedInput-inputMarginDense' and @id='Password']")
	private WebElement PwdBtn;

	@FindBy(xpath = "//span[@class='MuiButton-label' and text()='Login']")
	private WebElement LoginBtn;
	
	public WebElement getEmail() {
		return Email;
	}
	
	public WebElement getPwdBtn() {
		return PwdBtn;
	}
	public WebElement getLoginBtn() {
		return LoginBtn;
	}
	
public void enterTheEmail() throws IOException {
	FileUtility fil=new FileUtility();
	String userEmail=fil.readEmailFromPropertyFile("email");
	Email.sendKeys(userEmail);
	
	
}

public void enterThePwd() throws IOException {
	FileUtility fil=new FileUtility();
	String pwd=fil.readPwdFromPropertyFile("password");
	PwdBtn.sendKeys(pwd);
}

public void clickOnLoginBtn() {
	LoginBtn.click();
}
}
