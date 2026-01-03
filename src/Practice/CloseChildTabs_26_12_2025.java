///OPEN BROWSER
///OPEN MULTIPLE TAB
///CLOSE CHILD TABS

package Practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CloseChildTabs_26_12_2025 {
	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		
		///CLICK ON DOWNLOADS
		driver.findElement(By.xpath("//span[text()='Downloads']")).click();
		String downloadTabAddress = driver.getWindowHandle();
		
		///FETCHING THE TARGET LINKS/ELEMENTS
		WebElement dotNet = driver.findElement(By.xpath("//div[@class='card-body px-0 text-center']//a[@href = 'https://seleniumhq.github.io/selenium/docs/api/dotnet/index.html']"));
		WebElement ruby = driver.findElement(By.xpath("//div[@class='card-body px-0 text-center']//a[@href = 'https://seleniumhq.github.io/selenium/docs/api/rb/index.html']"));
		WebElement python = driver.findElement(By.xpath("//div[@class='card-body px-0 text-center']//a[@href = 'https://seleniumhq.github.io/selenium/docs/api/py/index.html']"));
		WebElement javaScript = driver.findElement(By.xpath("//div[@class='card-body px-0 text-center']//a[@href = 'https://seleniumhq.github.io/selenium/docs/api/javascript/index.html']"));
		
		////ROBOT CLASS OBJECT
		Robot r = new Robot();
		
		///ACTIONS CLASS OBJECT
		Actions a = new Actions(driver);
		
		///PERFORM ACTION ON DOTNET
		a.contextClick(dotNet).perform();
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_DOWN);	
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		///PERFORM ACTION ON RUBY
		a.contextClick(ruby).perform();
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_DOWN);	
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		//////PERFORM ACTION ON PYTHON
		a.contextClick(python).perform();
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_DOWN);	
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		//////PERFORM ACTION ON JAVASCRIPT
		a.contextClick(javaScript).perform();
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_DOWN);	
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		////ADDRESS OF ALL THE TABS
		Set<String> tabs = driver.getWindowHandles();
		
		///GET TITLE OF EACH TAB AND CLOSE CHILD TABS
		for(String tab:tabs) {
			if(!tab.equals(downloadTabAddress)) {
				driver.switchTo().window(tab);
				String title = driver.getTitle();
				System.out.println(title);
				driver.close();
				Thread.sleep(500);
				
			}
		}
		
		Thread.sleep(4000);
		///CLOSE ENTIRE WINDOW
		driver.quit();
	}

}
