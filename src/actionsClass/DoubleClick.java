package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement ele = driver.findElement(By.name("login"));
		
		Actions act = new Actions(driver);
		act.doubleClick(ele).perform();
	}

}



//////////////////////////////////////////////////////////06.12.2025//////////////////////////////////////////////////
