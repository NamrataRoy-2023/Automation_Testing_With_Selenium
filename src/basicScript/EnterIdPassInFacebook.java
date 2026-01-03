package basicScript;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class EnterIdPassInFacebook {
	public static void main(String[]args) throws InterruptedException {
		RemoteWebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("NamrataRoy");
		Thread.sleep(500);
		
		driver.findElement(By.name("pass")).sendKeys("Namrata@1234");
		Thread.sleep(500);
		
		driver.findElement(By.name("login")).click();
	}

}

////////////////////////////////////////10.11.2025//////////////////////////////////////////