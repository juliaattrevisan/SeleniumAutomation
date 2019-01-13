package test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
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
		objSignIn.clickSignInButton();
		assertEquals("Invalid email or password.", objSignIn.getInvalidMessageText());
		
	}
	
	
	@Test
	public void HeaderCheck(){
		
		objSignIn.openUltimateQAPage();
		ExpectedConditions.visibilityOf(objSignIn.findElement(objSignIn.headerNavBarSelector));
		ExpectedConditions.visibilityOf(objSignIn.findElement(objSignIn.headerLogoSelector));
		ExpectedConditions.visibilityOf(objSignIn.findElement(objSignIn.allCoursesSelector));
		ExpectedConditions.visibilityOf(objSignIn.findElement(objSignIn.signInLinkSelector));
	}
	
	@Test
	public void FooterCheck(){
		//
		objSignIn.openUltimateQAPage();
		ExpectedConditions.visibilityOf(objSignIn.findElement(objSignIn.footerNavBarSelector));
		ExpectedConditions.visibilityOf(objSignIn.findElement(objSignIn.footerHomeLinkSelector));
		ExpectedConditions.visibilityOf(objSignIn.findElement(objSignIn.footerSupportLinkSelector));
		ExpectedConditions.visibilityOf(objSignIn.findElement(objSignIn.footerPolicyLinkSelector));
		assertEquals("© Copyright Ultimate QA 2019", objSignIn.getCopyRightText());
	}
	
	@Test
	public void PageContentCheck(){
		
		objSignIn.openUltimateQAPage();
		assertEquals("Welcome Back!", objSignIn.getWelcomeText());
		ExpectedConditions.visibilityOf(objSignIn.findElement(objSignIn.signInLinkedinSelector));
		assertEquals("OR SIGN IN WITH", objSignIn.getOrSignInText());
		ExpectedConditions.visibilityOf(objSignIn.findElement(objSignIn.usernameSelector));
		ExpectedConditions.visibilityOf(objSignIn.findElement(objSignIn.passwordSelector));
		ExpectedConditions.visibilityOf(objSignIn.findElement(objSignIn.checkBoxSelector));
		assertEquals("Remember me", objSignIn.getCheckBoxText());
		ExpectedConditions.visibilityOf(objSignIn.findElement(objSignIn.forgotPasswordSelector));
		ExpectedConditions.visibilityOf(objSignIn.findElement(objSignIn.signInButtonSelector));
		ExpectedConditions.visibilityOf(objSignIn.findElement(objSignIn.createNewAccountSelector));
		
	}
	
	@Test
	public void RedirectToUltimatePageCheck() {
		objSignIn.openUltimateQAPage();
		objSignIn.clickQALogo();
		
	}

}
