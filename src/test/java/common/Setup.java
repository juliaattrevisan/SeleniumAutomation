package common;

import org.openqa.selenium.WebDriver;

public class Setup {

	WebDriver driver;

	String baseURL = "https://www.google.com.au";

	public void openGooglePage(WebDriver driver) {
		System.setProperty("webdriver.chrome.driver", "C:\\TestSelenium\\test01\\src\\test\\resources\\chromedriver.exe");
		driver.get("https://www.reddit.com");
		// driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
}
