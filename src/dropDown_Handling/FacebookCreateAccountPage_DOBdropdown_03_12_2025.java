package dropDown_Handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookCreateAccountPage_DOBdropdown_03_12_2025 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		
		//////// SELECT DATE
		WebElement date = driver.findElement(By.id("day"));
		Select s1 = new Select(date);
		s1.selectByIndex(23);
		
		//////// SELECT MONTH
		WebElement month = driver.findElement(By.id("month"));
		Select s2 = new Select(month);
		s2.selectByIndex(2);
		
		//////SELECT YEAR
		WebElement year = driver.findElement(By.id("year"));
		Select s3 = new Select(year);
		s3.selectByValue("2000");
	}

}
