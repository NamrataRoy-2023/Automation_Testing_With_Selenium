package findElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckAndUncheckCheckbox {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://172.27.112.1:5500/checkBoxPage.html");
		List<WebElement> labels = driver.findElements(By.xpath("//label"));
		for(WebElement label : labels) {
			label.click();
			Thread.sleep(2000);
			
		}
		
		for (int i = labels.size() - 1; i >= 0; i--) {
		    WebElement checkbox = labels.get(i).findElement(By.tagName("input"));
		    if (checkbox.isSelected()) {
		        checkbox.click();
		    }
		    Thread.sleep(2000);
		}
	}

}

////////////////////////////////////////01.12.2025///////////////////////////////////////
