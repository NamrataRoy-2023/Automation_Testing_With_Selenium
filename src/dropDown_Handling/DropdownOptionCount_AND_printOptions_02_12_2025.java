package dropDown_Handling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownOptionCount_AND_printOptions_02_12_2025 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://10.37.90.224:5500/dropDown.html");
		
		/////SELECT DROPDOWN
		WebElement options = driver.findElement(By.id("options"));
		Select s = new Select(options);
		
		/////STORE OPTIONS
		List<WebElement> opts = s.getOptions();
		System.out.println(opts.size());
		
		//////PRINT OPTIONS BY ITERATING
		for(WebElement opt : opts) {
			System.out.println(opt.getText());
		}
	}

}
