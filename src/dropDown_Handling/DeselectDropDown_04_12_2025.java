package dropDown_Handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectDropDown_04_12_2025 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://10.37.90.224:5500/dropDown.html");
		
		WebElement options = driver.findElement(By.id("MultiOption"));
		Select s = new Select(options);
		
		
		if(s.isMultiple()) {
			s.selectByIndex(8);
			Thread.sleep(1000);
			
			s.selectByIndex(6);
			Thread.sleep(1000);
			
			s.selectByIndex(7);
			Thread.sleep(1000);
			
			s.selectByIndex(4);
			Thread.sleep(1000);
			
			s.deselectByIndex(8);
			Thread.sleep(1000);
			
			s.deselectByIndex(7);
			Thread.sleep(1000);
			
			s.deselectAll();
		}
	}

}
