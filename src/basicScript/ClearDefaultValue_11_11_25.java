package basicScript;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClearDefaultValue_11_11_25 {
	public static void main(String[]args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://10.61.218.224:5500/dummypage.html");
		WebElement usn = driver.findElement(By.id("i1"));
		Thread.sleep(2000);
		usn.clear();
		Thread.sleep(2000);
		usn.sendKeys("Namrata1234");
	}
}
