package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitPractice_10_12_2025 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebDriverWait exWait = new WebDriverWait(driver, Duration.ofSeconds(10));
		Boolean value = exWait.until(ExpectedConditions.titleContains("Facebook"));
		if(value) {
			WebElement ele = driver.findElement(By.id("email"));
			ele.sendKeys("Namrata");
		}
		else {
			System.out.println("No element");
		}
	}

}
