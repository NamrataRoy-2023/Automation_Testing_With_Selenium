package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSigninPerform {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		//////////CLICK ON SIGNUP BUTTON ON FACEBOOK LOGIN PAGE
		WebElement signin = driver.findElement(By.xpath("//a[text()='Create new account']"));
		signin.click();
		
		///////////////FILL THE DETAILS ON SIGNUP PAGE
		
		///Firstname
		driver.findElement(By.name("firstname")).sendKeys("Namrata");
		Thread.sleep(500);
		
		///Lastname
		driver.findElement(By.name("lastname")).sendKeys("Roy");
		Thread.sleep(500);
		
		///SELECT DATE
		WebElement date = driver.findElement(By.id("day"));
		Select s1 = new Select(date);
		s1.selectByIndex(23);
		Thread.sleep(500);
		
		/// SELECT MONTH
		WebElement month = driver.findElement(By.id("month"));
		Select s2 = new Select(month);
		s2.selectByIndex(2);
		Thread.sleep(500);
		
		///SELECT YEAR
		WebElement year = driver.findElement(By.id("year"));
		Select s3 = new Select(year);
		s3.selectByValue("2000");
		Thread.sleep(500);
		
		///Gender Select
		driver.findElement(By.name("sex")).click();
		Thread.sleep(500);
		
		///ph number
		driver.findElement(By.name("reg_email__")).sendKeys("9088089955");
		Thread.sleep(500);
		
		///Password
		driver.findElement(By.name("reg_passwd__")).sendKeys("NamrataRoy12345");
		Thread.sleep(500);
		
		///Button
		driver.findElement(By.name("websubmit")).click();
		
		
	}

}
