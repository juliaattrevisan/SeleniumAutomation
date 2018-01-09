package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import common.Setup;

public class NewTest {
	
	
	
	
	@Test
	public void setup(){
		System.setProperty("webdriver.chrome.driver", "C:\\TestSelenium\\test01\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Setup objSetup = new Setup();
		WebDriverWait wait = new WebDriverWait(driver, 120);
		
		objSetup.openGooglePage(driver);
	}

}
