package GroupExecution_14_01_2026;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TextFunction_Group {
	@Test (groups = "Group 1")
	public void textFunction() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		
		driver.findElement(By.xpath("//span[text()='Downloads']")).click();
		
		driver.findElement(By.xpath("//a[@href='https://www.nuget.org/packages/Selenium.WebDriver']")).click();
	}
}
