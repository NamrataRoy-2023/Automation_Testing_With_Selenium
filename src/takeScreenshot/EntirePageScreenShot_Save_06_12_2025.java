package takeScreenshot;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class EntirePageScreenShot_Save_06_12_2025 {
	public static void main(String[] args) throws IOException {
		///////FETCH SYSTEM DATE
		Date d = new Date();
		
		///REPLACE ":" WITH "_"
		String date = d.toString().replace(":", "_");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		TakesScreenshot tks = (TakesScreenshot) driver;
		
	//////CALLING TAKESCTEENSHOTAS() OF WEBdRIVER CLASS
		File temp = tks.getScreenshotAs(OutputType.FILE);
		File perma = new File("C:\\Users\\compu\\eclipse-workspace\\SeleniumM3Morning\\src\\imagess\\defect_" + date + ".png");
		FileHandler.copy(temp, perma);
		
		
		
		
	}

}
