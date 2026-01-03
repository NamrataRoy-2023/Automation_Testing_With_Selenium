package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hamdleFrames_17_12_2025 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://10.16.95.224:5500/frames/index.html");
		//////SET VALUE TO USERNAME
		WebElement usn = driver.findElement(By.tagName("input"));
		usn.sendKeys("Namrata");
		/////MOVE TO 2ND FRAME
		driver.switchTo().frame(0);
		/////SET VALUE TO PASSWORD
		WebElement psw = driver.findElement(By.name("password"));
		psw.sendKeys("Namrario12345");
		//////MOVE TO 3RD FRAME
		driver.switchTo().frame(0);
		////SET VALUE TO EMAIL
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("Namrario@gmail.com");
		/////MOVE TO IMMEDIATE PARENT AND CLEAR VALUE
//		driver.switchTo().parentFrame();
//		psw.clear();
		
		////MOVE TO SUPER MOST PARENT AND CLEAR VALUE
		driver.switchTo().defaultContent();
		usn.clear();
	}

}
