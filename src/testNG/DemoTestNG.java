package testNG;

import org.testng.annotations.Test;

public class DemoTestNG {
	@Test(priority = 0)
	public void smoke() {
		System.out.println("Smoke Finished");
	}
	
	@Test(priority = 1)
	public void functional() {
		System.out.println("Functional Finished");
	}
	
	@Test(priority = 2)
	public void regression() {
		System.out.println("Regression Finished");
	}
	
}


////////////////////////////////////////////29.12.2025//////////////////////////////////////////////////