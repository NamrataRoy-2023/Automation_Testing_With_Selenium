package basicScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class textFunction_15_11_25 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.selenium.dev/");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[text()='Downloads']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[@href='https://www.nuget.org/packages/Selenium.WebDriver']")).click();
		Thread.sleep(1000);
		
	}
}
