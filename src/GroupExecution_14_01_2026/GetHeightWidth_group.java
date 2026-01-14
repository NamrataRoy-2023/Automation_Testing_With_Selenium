package GroupExecution_14_01_2026;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GetHeightWidth_group {
	@Test(groups= {"group 4", "master"})
	public void getHeight() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://baskinrobbinsindia.com/");
		WebElement button = driver.findElement(By.xpath("//a[@class='btn button button--bgpink shop-btn-mobile' and @href='https://baskinrobbins.dotpe.in/']"));
		System.out.println(button.getAttribute("class"));
		System.out.println(button.getTagName());
		System.out.println(button.getCssValue("background-color"));
		System.out.println(button.getSize());///will return width first then height.below is the proof
		//proof
		Dimension d = button.getSize();
		System.out.println(d.getHeight());
		System.out.println(d.getWidth());
	}

}
