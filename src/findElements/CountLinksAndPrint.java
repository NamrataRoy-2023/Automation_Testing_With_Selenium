package findElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountLinksAndPrint {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		for(int i=links.size()-1; i>=0 ; i--) {
			WebElement l = links.get(i);
			String s = l.getAttribute("href");
			System.out.println(i+1 + "   " + s);
		}
	}

}


///////////////////////////////////////01.12.2025//////////////////////////////////////////////////