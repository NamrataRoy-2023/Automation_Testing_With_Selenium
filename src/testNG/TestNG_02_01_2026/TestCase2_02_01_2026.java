package testNG.TestNG_02_01_2026;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestCase2_02_01_2026 extends BaseClass_02_01_2026{
	@Test
	public void fetchLink() {
		List<WebElement> links = d.findElements(By.xpath("//a"));
		for(WebElement link : links) {
			String value = link.getAttribute("href");
			System.out.println(value);
		}
	}
}
