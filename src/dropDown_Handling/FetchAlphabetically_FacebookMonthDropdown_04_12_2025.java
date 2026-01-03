package dropDown_Handling;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FetchAlphabetically_FacebookMonthDropdown_04_12_2025 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		
		WebElement month = driver.findElement(By.id("month"));
		////GET ALL THE OPTIONS AS WEBELEMENT
		Select s = new Select(month);
		List<WebElement> opts = s.getOptions() ;
		
/////////////////////////////////////////////////////AYYAYLIST APPROACH///////////////////////////////////////
		////ARRAYLIST TO STORE THE OPTIONS VALUES
		ArrayList<String> al = new ArrayList<String>();
		////ADDING OPTIONS TO ARRAYLIST
		for(WebElement opt :opts) {
			al.add(opt.getText());
		}
		////SORTING THE ARRAYLIST
		Collections.sort(al);
		/////PRINTING 
		for(String ele : al) {
			System.out.println(ele);
		}
		
		
		
		
		System.out.println("**********************************");
///////////////////////////////////////////////////TREESET APPROACH//////////////////////////////////////////
		/////TREESET TO STORE OPTION VALUES
		TreeSet<String> ts = new TreeSet<String>();
		/////ADDING OPTIONS TO TREESET
		for(WebElement opt:opts) {
			ts.add(opt.getText());
		}
		/////PRINTING OPTIONS
		for(String ele : ts) {
			System.out.println(ele);
		}
		
		driver.quit();
	}
}
