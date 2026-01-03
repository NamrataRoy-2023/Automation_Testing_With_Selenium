package basicScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class CssSelector {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.cssSelector("input[id=\"email\"]")).sendKeys("NamrataRoy");
		Thread.sleep(200);
		
		driver.findElement(By.cssSelector("input[id=\"pass\"]")).sendKeys("NamrataRoy@123456789");
		Thread.sleep(200);
		
		driver.findElement(By.cssSelector("button[id=\"u_0_5_VG\"]")).click();
	}
}
