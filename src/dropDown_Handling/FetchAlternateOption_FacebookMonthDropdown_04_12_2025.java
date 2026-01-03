package dropDown_Handling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FetchAlternateOption_FacebookMonthDropdown_04_12_2025 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		
		WebElement month = driver.findElement(By.id("month"));
		
		Select s = new Select(month);
		List<WebElement> opts = s.getOptions() ;
		for(int i=0; i<opts.size(); i+=2) {
			WebElement opt = opts.get(i);
			System.out.println(opt.getText());
		}
		driver.quit();
	}
	

}
