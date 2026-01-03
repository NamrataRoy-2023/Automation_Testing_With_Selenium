package dropDown_Handling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_PrintOptionsOfMonthDropdown_03_12_2025 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		
		/////SELECT MONTH
		WebElement month = driver.findElement(By.id("month"));
		Select s = new Select(month);
		
		/////STORE OPTIONS
		List<WebElement> options = s.getOptions();
		System.out.println(options.size());
		
		//////PRINT OPTIONS BY ITERATING
		for(WebElement option : options) {
			System.out.println(option.getText());
		}
	}

}
