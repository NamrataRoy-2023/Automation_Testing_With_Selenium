package testNG.TestNG_02_01_2026;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass_02_01_2026 {
	WebDriver d;
	@BeforeMethod
	public void setup() {
		d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.facebook.com");
		
	}
	
	@AfterMethod
	public void tearDown() throws InterruptedException {
		Thread.sleep(2000);
		d.quit();
	}
}
