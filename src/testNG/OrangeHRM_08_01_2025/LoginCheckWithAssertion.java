package testNG.OrangeHRM_08_01_2025;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginCheckWithAssertion extends OrangeHRMSetup {
	@Test
	public void login() {
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button")).click();
		
		
		String pgTitle = driver.findElement(By.xpath("//h6")).getText();
		String Expected = "Dashboard";
		
		Assert.assertEquals(pgTitle, Expected);
		
		driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
	}
}
