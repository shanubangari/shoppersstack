package com.shopperStackTest;

import java.io.IOException;

import org.testng.annotations.Test;

import com.shopperStack.PomRepo.Home;
import com.shopperStack.PomRepo.Login;
import com.shopperStack.PomRepo.Welcome;

import GenericUtils.BaseClass;
import GenericUtils.FileUtility;

public class Tc01_AddToCartTheProduct extends BaseClass{
	FileUtility fil=new FileUtility();

	@Test
	public void tc01_AddToCartTheProductTest() throws IOException, InterruptedException {

		//Step1: Click on login link on Welcome page.

		Welcome wlcm=new Welcome(driver);
		Thread.sleep(8000);
		wlcm.clickOnLoginButton();

		// Step2: Enter the email id into Email text field.
		Thread.sleep(5000);
		Login log=new Login(driver);
		log.enterTheEmail();

		// Step3: Enter the password into Password text field.
		Thread.sleep(3000);
		log.enterThePwd();
		
		//Step4:  Click on the LOGIN button.
		Thread.sleep(3000);
		log.clickOnLoginBtn();
		
		//Step5: Click on the WOMEN link
		Home hom=new Home(driver);
		hom.clickWomenLink();
		
		//Step6: Click on Account Settings.
		hom.clickAccountSettings();
	}

}
