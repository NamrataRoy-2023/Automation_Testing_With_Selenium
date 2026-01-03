package robotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Open_Maximize_Minimize_17_12_2025 {
	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		Robot r = new Robot();
		
		///////////MAXIMIZE
		r.keyPress(KeyEvent.VK_WINDOWS);
		r.keyPress(KeyEvent.VK_UP);
		Thread.sleep(2000);
		r.keyRelease(KeyEvent.VK_WINDOWS);
		r.keyRelease(KeyEvent.VK_UP);
		
		Thread.sleep(2000);
		
		///////////MINIMIZE
		r.keyPress(KeyEvent.VK_WINDOWS);
		r.keyPress(KeyEvent.VK_M);
		Thread.sleep(2000);
		r.keyRelease(KeyEvent.VK_WINDOWS);
		r.keyRelease(KeyEvent.VK_M);
		
		///////////OPEN RECENT
		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		r.keyRelease(KeyEvent.VK_ALT);
		r.keyRelease(KeyEvent.VK_TAB);
		
		Thread.sleep(2000);
		
		
		///////////CLOSE RECENT TAB OR IF ONLY ONE TAB IS OPENED THEN IT WILL CLOSE ENTIRE BROWSER
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_F4);
		Thread.sleep(2000);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_F4);
		
		Thread.sleep(2000);
	}

}
