///OPEN GOOGLE
///WRITE SOMETHING IN SEARCH BAR
///FETCH ALL THE ADDRESS OF AUTOSUGGESTIONS
////PRINT THE SUGGESTIONS
///AND COMPARE

package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion_Practice_26_12_2025 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		///PASS VALUE TO SEARCHBAR
		driver.findElement(By.xpath("//textarea")).sendKeys("shoe");
		Thread.sleep(1000);
		
		///FETCH ADDRESS OF ALL THE SUGGESTION
		List<WebElement> autosuggestions =  driver.findElements(By.xpath("//span[contains(text(),'shoe')]"));
		
		///PRINT THE SUGGESTION TEXT
		for(WebElement autosuggestion:autosuggestions) {
			System.out.println(autosuggestion.getText());
		}
		
		for(WebElement autosuggestion:autosuggestions) {
			Thread.sleep(500);
			String text = autosuggestion.getText();
			if(text.equals("shoes for women")) {
				autosuggestion.click();
			}
		}

	}

}
