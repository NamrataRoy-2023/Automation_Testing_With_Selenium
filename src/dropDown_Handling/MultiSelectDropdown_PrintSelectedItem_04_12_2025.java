package dropDown_Handling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropdown_PrintSelectedItem_04_12_2025 {
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
			
			List<WebElement> selected = s.getAllSelectedOptions();
			
			for(WebElement opts : selected) {
				System.out.println(opts.getText());
			}
		}
		else {
			System.out.println("Not a Multi Select Dropdown.");
		}
	}

}
