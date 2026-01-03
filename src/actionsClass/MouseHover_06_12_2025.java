package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover_06_12_2025 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/mouseHover?sublist=0");
		WebElement ele = driver.findElement(By.xpath("//img[contains(@src, '/assets/message-hint-nbRmWGWf.png')]"));
		
		Actions act = new Actions(driver);
		act.moveToElement(ele).build().perform();
	}
}
