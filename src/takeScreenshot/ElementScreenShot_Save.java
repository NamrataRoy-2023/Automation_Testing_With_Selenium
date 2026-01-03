package takeScreenshot;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ElementScreenShot_Save {
	public static void main(String[] args) throws IOException {
	///////FETCH SYSTEM DATE
			Date d = new Date();
			
			///REPLACE ":" WITH "_"
			String date = d.toString().replace(":", "_");
			
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			
			WebElement ele = driver.findElement(By.id("email"));
			//////CALLING TAKESCTEENSHOTAS() OF WEBELEMENT CLASS
			File temp = ele.getScreenshotAs(OutputType.FILE);
			File perma = new File("C:\\Users\\compu\\eclipse-workspace\\SeleniumM3Morning\\src\\imagess\\defect_" + date + ".png");
			
			FileHandler.copy(temp, perma);
	}

}
