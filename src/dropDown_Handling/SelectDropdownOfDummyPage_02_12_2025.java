package dropDown_Handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdownOfDummyPage_02_12_2025 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://10.37.90.224:5500/dropDown.html");
		
		/////SELECT DROPDOWN
		WebElement options = driver.findElement(By.id("options"));
		Select s = new Select(options);
		
		
		s.selectByIndex(3);
		Thread.sleep(3000);
		s.selectByIndex(1);
		Thread.sleep(3000);
		s.selectByVisibleText("Select");
		
	}
}
