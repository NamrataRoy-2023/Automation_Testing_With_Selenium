package basicScript;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchURL_08_11_2025 {
	public static void main(String[]args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://10.61.218.224:5500/dummypage.html");
//		System.out.println(driver.getCurrentUrl());
//		System.out.println(driver.getPageSource());
		driver.manage().window().maximize();
//		driver.manage().window().fullscreen();
		
		Thread.sleep(5000);
		
		//Enter Username
		driver.findElement(By.id("i1")).sendKeys("Namrata");
		
		//Enter password
		driver.findElement(By.id("i2")).sendKeys("Namrata@123");
		
		//click on gender radio button
		driver.findElement(By.className("F")).click();
		
		//click on checkbox
		driver.findElement(By.id("checkbox")).click();
		
		//click on link
		driver.findElement(By.tagName("a")).click();

	}

}
