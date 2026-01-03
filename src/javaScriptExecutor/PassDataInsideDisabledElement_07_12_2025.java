package javaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PassDataInsideDisabledElement_07_12_2025 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://10.16.95.224:5500/disable.html");
		
		////LOCATE ELEMENT
		WebElement ele = driver.findElement(By.id("email"));
		
		/////DOWNCASTING
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		Thread.sleep(2000);
		
		////PASS VALUE INTO FIELD
		jse.executeScript("arguments[0].value='Namrata'", ele);
		
	}

}
