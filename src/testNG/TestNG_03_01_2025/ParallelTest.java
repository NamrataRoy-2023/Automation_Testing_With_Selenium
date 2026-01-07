package testNG.TestNG_03_01_2025;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ParallelTest extends CrossBrowserSetup{
	@Test
	public void testcase() {
		driver.findElement(By.id("email")).sendKeys("Namrata");
		driver.findElement(By.id("pass")).sendKeys("Namrata@123");
		driver.findElement(By.name("login")).click();
	}
}
