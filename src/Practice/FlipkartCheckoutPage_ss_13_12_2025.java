package Practice;

import java.io.File;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class FlipkartCheckoutPage_ss_13_12_2025 {
	public static void main(String[] args) throws Exception {
		
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        ////// OPEN FLIPKART
        driver.get("https://www.flipkart.com/");
        Thread.sleep(500);

        ////Close login popup
//        try {
//            driver.findElement(By.xpath("//span[contains(text(),'✕')]")).click();
//        } catch (Exception e) {}
        
        ////SEARCH FOR IPHONE
        driver.findElement(By.className("lNPl8b")).sendKeys("Iphone 15");
        Thread.sleep(500);
        ///CLICK ON SEARCH ICON
        driver.findElement(By.xpath("//button[@class = 'kV1UjG']")).click();
        Thread.sleep(500);
        ///SORT LOW TO HIGH
        driver.findElement(By.xpath("//div[text()='Price -- Low to High']")).click();
        Thread.sleep(500);
        ///SELECT BLACK 128 GB VARIENT
        driver.findElement(By.xpath("//div[@class='col col-7-12']/div[1][contains(text(),'iPhone 15 (Black, 128 GB)')]")).click();
        Thread.sleep(500);
        
        ///EASY WINDOW SWITCH
        ArrayList<String> windows = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(windows.get(1));
        Thread.sleep(500);

        ////SCROLL TO REVIEW SECTION
        WebElement reviewSection = driver.findElement(By.xpath("//div[text()='Ratings & Reviews']"));
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("arguments[0].scrollIntoView();", reviewSection);
        
        ///TAKE SYSTEM DATE
  		Date d = new Date();
  		String date = d.toString().replace(":", "_");
  		
        ///TAKE SCREENSHOT OF REWIEW SECTION
        TakesScreenshot tks = (TakesScreenshot) driver;
        File temp = tks.getScreenshotAs(OutputType.FILE);
		File perma = new File("C:\\Users\\compu\\eclipse-workspace\\SeleniumM3Morning\\src\\imagess\\flipkart_" + date + ".png");
		FileHandler.copy(temp, perma);
        
	}
}
