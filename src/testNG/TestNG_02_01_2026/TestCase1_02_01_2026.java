package testNG.TestNG_02_01_2026;



import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestCase1_02_01_2026 extends BaseClass_02_01_2026{
	@Test
	public void facebookLogin() {
		d.findElement(By.id("email")).sendKeys("Admin");
		d.findElement(By.id("pass")).sendKeys("Admin@123");
		d.findElement(By.xpath("//button[text()='Log in']")).click();
	}
}
