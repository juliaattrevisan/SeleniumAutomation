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
	private ByIdOrName usernameSelector = new ByIdOrName("user_email");
	private WebElement passwordInput;
	private ByIdOrName passwordSelector = new ByIdOrName("user_password");
	private WebElement saveButton;
	private ByIdOrName saveButtonSelector = new ByIdOrName("btn-signin");
	private WebElement notificationError;
	private ByClassName notificationErrorSelector = new ByClassName("notifications-error__list-item");
	
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

	//function to click Save button
	public void clickSave() {
		saveButton = driver.findElement(saveButtonSelector);
		saveButton.click();
		
	}
	
	//function to get invalid messages
	public String getInvalidMessageText() {
		notificationError = driver.findElement(notificationErrorSelector);
		return notificationError.getText();
		
	}
	
	//function to check if an element is presented in the page
	public void isWebElementPresented(By element) {
	   //headerNavBar = driver.findElement(headerNavBarSelector);
		//ExpectedConditions.visibilityOf(driver.findElement(headerNavBarSelector));
		ExpectedConditions.visibilityOf(driver.findElement(element));
			
	}
	
	//function to get invalid messages
	public String getCopyRightText() {
		footerCopyright = driver.findElement(footerCopyrightSelector);
		return footerCopyright.getText();
		
	}
	
	
	
}
