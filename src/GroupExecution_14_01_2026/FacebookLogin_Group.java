package GroupExecution_14_01_2026;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class FacebookLogin_Group {
	@Test(groups ="group 2")
	public void login() {
		RemoteWebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("NamrataRoy");
		
		driver.findElement(By.name("pass")).sendKeys("Namrata@1234");
		
		driver.findElement(By.name("login")).click();
	}

}
