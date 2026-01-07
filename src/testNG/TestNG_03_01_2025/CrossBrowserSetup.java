package testNG.TestNG_03_01_2025;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class CrossBrowserSetup {
	WebDriver driver;
	
	@Parameters("Browser")
	
	@BeforeMethod
	public void setUp(String browser) {
		switch(browser) {
			case "chrome" :
				driver = new ChromeDriver();
				break;
				
			case "firefox" :
				driver = new FirefoxDriver();
				break;
				
			case "edge" :
				driver = new EdgeDriver();
				break;
				
			default :
				System.out.println("Invalid Input");
				break;
		}
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@AfterMethod
	public void tearDown() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}

}
