
package basicScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathByAttribute_PlayYoutubeVideo_14_11_25 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.youtube.com/");
		
		driver.findElement(By.xpath("//input[@class=\"ytSearchboxComponentInput yt-searchbox-input title\"]")).sendKeys("Latest Hindi Song");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@class=\"ytSearchboxComponentSearchButton ytSearchboxComponentSearchButtonDark\"]")).click();
		Thread.sleep(3000);
		
		WebElement first=driver.findElement(By.xpath("//h3[@class=\'title-and-badge style-scope ytd-video-renderer\'][1]"));
		first.click();
		
	}

}

