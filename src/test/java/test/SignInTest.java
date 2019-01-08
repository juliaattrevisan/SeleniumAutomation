package test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;


import pages.SignInPage;

public class SignInTest {
	
	WebDriver driver;
	SignInPage objSignIn = new SignInPage();
	
	
	
	@Test
	public void InvalidPassword(){
		
		objSignIn.openUltimateQAPage();
		objSignIn.typeUsername("automation@gmail.com");
		objSignIn.typePassword("wrongpsw");
		objSignIn.clickSave();
		assertEquals("Invalid email or password.", objSignIn.getInvalidMessageText());
		
	}
	
	
	@Test
	public void HeaderCheck(){
		
		objSignIn.openUltimateQAPage();
		objSignIn.isWebElementPresented(objSignIn.headerNavBarSelector);
		objSignIn.isWebElementPresented(objSignIn.headerLogoSelector);
		objSignIn.isWebElementPresented(objSignIn.allCoursesSelector);
		objSignIn.isWebElementPresented(objSignIn.signInLinkSelector);
	}
	
	@Test
	public void FooterCheck(){
		
		objSignIn.openUltimateQAPage();
		objSignIn.isWebElementPresented(objSignIn.footerNavBarSelector);
		objSignIn.isWebElementPresented(objSignIn.footerHomeLinkSelector);
		objSignIn.isWebElementPresented(objSignIn.footerSupportLinkSelector);
		objSignIn.isWebElementPresented(objSignIn.footerPolicyLinkSelector);
		assertEquals("© Copyright Ultimate QA 2019", objSignIn.getCopyRightText());
	}
	
	@Test
	public void PageContentCheck(){
		
		objSignIn.openUltimateQAPage();
		
	}

}
