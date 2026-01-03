/////////////////GO TO EASE MY TRIP -> CLICK ON DEPARTURE -> SET YOUR BIRTHDAY AS DATE

package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EaseMyTrip_task {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		driver.get("https://www.easemytrip.com/flights.html?utm_campaign=788997081&utm_source=g_c&utm_medium=cpc&utm_term=e_easemytrip&adgroupid=39319940377&gad_source=1&gad_campaignid=788997081&gbraid=0AAAAADo_0-hwb4qgvsctLLkQ1bDLYv3Of&gclid=CjwKCAiAmKnKBhBrEiwAaqAnZ8a-BY1H40yCRJcDBsiTvLbhLDGDSyy_WICd1QVSojNnTqI_7m63sxoC0esQAvD_BwE");
		
		///CLICK ON DEPARTURE
		driver.findElement(By.xpath("//div[@id = 'dvfarecal']")).click();
		
		while (true) {
			//CAPTURE MONTH
			WebElement month = driver.findElement(By.xpath("//div[@class = 'month-sec']//div[@class ='month2']"));
			String monthValue = month.getText();
			
			if(monthValue.equals("SEP 2026")) {
				driver.findElement(By.xpath("//div/ul[@class='bor-d41']//li[@id='trd_2_15/09/2026']")).click();
				break;
			}
			else {
				WebElement nextButton = driver.findElement(By.xpath("//img[@id = 'img2Nex']"));
				nextButton.click();
			}
		}
		
		Thread.sleep(5000);
		driver.quit();
		
	}

}









//////////////////////////////////////////////////////////23.12.2025///////////////////////////////////////////////////




//////OTHER APPROACH
///
//public class EaseMyTrip_task {
//
//	public static void main(String[] args) {
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
//		driver.get("https://www.easemytrip.com/");
//			driver.findElement(By.id("ddate")).click();
//		for(;;) {
//			try {
//				driver.findElement(By.id("fst_3_13/09/2026")).click();
//				break;
//			} catch(Exception e){
//				driver.findElement(By.id("img2Nex")).click();
//								
//			}
//			
//		}
//	}
//}