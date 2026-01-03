package popup;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ControlOneTab_19_12_2025 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/browser/newTab?sublist=1");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[text()='view more'])[2]")).click();
		
		Set<String> wins = driver.getWindowHandles();
		
		for(String win : wins) {
			driver.switchTo().window(win);
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Add to Cart']")).click();
	}

}
