package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ByIdOrName;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SignInPage {
	
	//declaring page elements
	private WebDriver driver;
	
	//wrapper
	private WebElement usernameInput;
	public ByIdOrName usernameSelector = new ByIdOrName("user_email");
	private WebElement passwordInput;
	public ByIdOrName passwordSelector = new ByIdOrName("user_password");
	private WebElement signInButton;
	public ByIdOrName signInButtonSelector = new ByIdOrName("btn-signin");
	private WebElement notificationError;
	private ByClassName notificationErrorSelector = new ByClassName("notifications-error__list-item");
	private WebElement welcomeBack;
	private ByClassName welcomeBackSelector = new ByClassName("section-title");
	private WebElement signInLinkedinLink;
	public ByLinkText signInLinkedinSelector = new ByLinkText("Sign in with LinkedIn");
	private WebElement orSignInText;
	public ByClassName orSignInTextSelector = new ByClassName("form__separator");
	private WebElement checkBox;
	public ByClassName checkBoxSelector = new ByClassName("checkbox");
	private WebElement forgotPassword;
	public ByLinkText forgotPasswordSelector = new ByLinkText("Forgot Password?");
	private WebElement createNewAccount;
	public ByLinkText createNewAccountSelector = new ByLinkText("Create a new account");
	
	//header
	public ByClassName headerNavBarSelector = new ByClassName("header-nav__container");
	private WebElement headerLogo;
	public ByClassName headerLogoSelector = new ByClassName("header-logo");
	private WebElement allCourses;
	public ByLinkText allCoursesSelector = new ByLinkText("All Courses");
	private WebElement signInLink;
	public ByLinkText signInLinkSelector = new ByLinkText("Sign In");
	
	//footer
	public ByClassName footerNavBarSelector = new ByClassName("footer-nav");
	private WebElement footerHomeLink;
	public ByLinkText footerHomeLinkSelector = new ByLinkText("Home");
	private WebElement footerSupporLink;
	public ByLinkText footerSupportLinkSelector = new ByLinkText("Support");
	private WebElement footerPolicyLink;
	public ByLinkText footerPolicyLinkSelector = new ByLinkText("Privacy Policy");
	private WebElement footerCopyright;
	public ByClassName footerCopyrightSelector = new ByClassName("footer-copyright");
	
	
	public SignInPage() {
		
		//setting a path to chrome driver
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	
	//funtion to find an element
	public WebElement findElement(By element) {
		
		return driver.findElement(element);
			
	}
	
	public void openUltimateQAPage() {
		
		//opening website and maximizing the browser and then waiting for 5 seconds to get page loaded
		driver.get("https://courses.ultimateqa.com/users/sign_in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}
	
	//function to type username
	public void typeUsername(String text) {
		usernameInput = driver.findElement(usernameSelector);
		usernameInput.sendKeys(text);
			
	}	
	
	//function to type password
	public void typePassword(String text) {
		passwordInput = driver.findElement(passwordSelector);
		passwordInput.sendKeys(text);
		
	}

	//function to click Sing In button
	public void clickSignInButton() {
		signInButton = driver.findElement(signInButtonSelector);
		signInButton.click();
		
	}
	
	//function - to get invalid messages
	public String getInvalidMessageText() {
		notificationError = driver.findElement(notificationErrorSelector);
		return notificationError.getText();
		
	}
	
	
	//function to get welcome text
	public String getWelcomeText() {
		welcomeBack = driver.findElement(welcomeBackSelector);
		return welcomeBack.getText();
		
	}
	
	//function to "or sign in with" text
	public String getOrSignInText() {
		orSignInText = driver.findElement(orSignInTextSelector);
		return orSignInText.getText();
		
	}
	
	//function to get copy right text
	public String getCheckBoxText() {
		checkBox = driver.findElement(checkBoxSelector);
		return checkBox.getText();
		
	}
	
	//function to tick check box
	public void tickCheckBox() {
		checkBox = driver.findElement(checkBoxSelector);
		checkBox.click();
		
	}
	
	//function to get copy right text
	public String getCopyRightText() {
		footerCopyright = driver.findElement(footerCopyrightSelector);
		return footerCopyright.getText();
		
	}
	

	
}
