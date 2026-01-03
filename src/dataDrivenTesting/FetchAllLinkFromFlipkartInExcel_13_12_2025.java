package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchAllLinkFromFlipkartInExcel_13_12_2025 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("./Excel/DataDrivenTesting.xlsx");
		XSSFWorkbook book = new XSSFWorkbook(fis);
		
		///CREATE NEW SHEET
		XSSFSheet sheet = book.createSheet("Flipkart Home Page Links");
		
		///LAUNCH DRIVER AND OPEN FLIPKART
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		///ADD WAIT STATEMENT
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		///STORE ALL THE ELEMENTS IN LIST
		List<WebElement> eles = driver.findElements(By.xpath("//a"));
		
		///STORE LINKS IN EXCEL
		for(int i = 0; i<eles.size(); i++) {
			XSSFRow row = sheet.createRow(i);
			XSSFCell cell = row.createCell(0);
			
			WebElement ele = eles.get(i);
			String value = ele.getAttribute("href");
			cell.setCellValue(value);
		}
		
		///WRITE DATA
		FileOutputStream fos = new FileOutputStream("./Excel/DataDrivenTesting.xlsx");
		book.write(fos);
		
		///CLOSE RESOURCES
		book.close();
		fis.close();
		fos.close();
		driver.quit();
	}

}
