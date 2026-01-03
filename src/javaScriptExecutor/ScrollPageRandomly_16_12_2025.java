package javaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollPageRandomly_16_12_2025 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.selenium.dev/documentation/webdriver/actions_api/wheel/");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		Thread.sleep(1000);
		jse.executeScript("scrollBy(0,1000);");
		
		Thread.sleep(1000);
		jse.executeScript("scrollBy(0,-1000);");
	}

}
