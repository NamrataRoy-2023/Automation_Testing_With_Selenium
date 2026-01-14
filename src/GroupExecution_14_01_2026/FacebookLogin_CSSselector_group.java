package GroupExecution_14_01_2026;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FacebookLogin_CSSselector_group {
	@Test(groups = "group 3")
	public void cssSelector() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.cssSelector("input[id=\"email\"]")).sendKeys("NamrataRoy");
		
		driver.findElement(By.cssSelector("input[id=\"pass\"]")).sendKeys("NamrataRoy@123456789");

		driver.findElement(By.cssSelector("button[id=\"u_0_5_VG\"]")).click();
	}

}
