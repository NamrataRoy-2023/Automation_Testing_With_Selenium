package testNG.Assertion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion_07_01_2026 {
		@Test
		public void login(){
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			String fetchedURL = driver.getCurrentUrl();
			String actualURL = "https://www.facebook.com/";
			
			
			SoftAssert soft = new SoftAssert();
			soft.assertEquals(actualURL, fetchedURL);
			soft.assertAll();
			
			System.out.println(".............Soft Assert Working Fine............");
			
			Assert.assertEquals(actualURL, fetchedURL);
			
			System.out.println(".............Hard Assert Working Fine............");
			
		}
		
		@Test
		public void getTitle() throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com");
			String fetchedTitle = driver.getTitle();
			String actualTitle = "Facebook – log in or sign up";
			Thread.sleep(3000);
			
			SoftAssert soft = new SoftAssert();
			soft.assertEquals(actualTitle, fetchedTitle);
			soft.assertAll();
			
			System.out.println(".............Soft Assert Working Fine............");
			
			Assert.assertEquals(actualTitle, fetchedTitle);
			
			System.out.println(".............Hard Assert Working Fine............");
			
		}
		

}
