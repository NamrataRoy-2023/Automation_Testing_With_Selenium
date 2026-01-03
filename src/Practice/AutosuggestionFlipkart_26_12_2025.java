///OPEN FLIPKART
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

public class AutosuggestionFlipkart_26_12_2025 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		///PASS VALUE TO SEARCHBAR
		driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']")).sendKeys("perfume");
		Thread.sleep(1000);
		
		///FETCH ADDRESS OF ALL THE SUGGESTION
		List<WebElement> autosuggestions =  driver.findElements(By.xpath("//li[contains(@class,'Sc1DCn')]"));
		
		///PRINT THE SUGGESTION TEXT
		for(WebElement autosuggestion:autosuggestions) {
			System.out.println(autosuggestion.getText());
		}
		
		for(WebElement autosuggestion:autosuggestions) {
			Thread.sleep(500);
			String text = autosuggestion.getText();
			if(text.equals("perfume combo")) {
				autosuggestion.click();
			}
		}

	}
}
