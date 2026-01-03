package basicScript;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ResizeAndDragBrowser {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		Thread.sleep(500);
		
		Dimension d = new Dimension(500,500);
		driver.manage().window().setSize(d);
		Thread.sleep(500);
		
		Point p = new Point(500,200);
		driver.manage().window().setPosition(p);
		
	}
}
