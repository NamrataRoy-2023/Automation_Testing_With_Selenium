package basicScript;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

////////////////////////11.11.2025///////////////////////

public class LinkText {
	public static void main(String[]args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		/////LINK TEXT/////
		driver.findElement(By.linkText("Register now!")).click();
	    /////PARTIAL LINK TEXT/////
		driver.findElement(By.partialLinkText("Register")).click();
	}

}

