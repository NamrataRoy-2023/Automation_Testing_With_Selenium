package testNG.TestNG31_12_2025;

import org.testng.annotations.Test;

public class TestCase_31_12_2025 extends BaseClass_31_12_2025{
	@Test (priority = 1)
	public void title() {
		System.out.println("Title : ");
		System.out.println(driver.getTitle());
	}
	
	@Test (priority = 2)
	public void sourceURL() {
		System.out.println("URL : ");
		System.out.println(driver.getCurrentUrl());
	}
	
	@Test (priority = 3)
	public void SourceCode() {
		System.out.println("Source Code : ");
		System.out.println(driver.getPageSource());
	}
}
