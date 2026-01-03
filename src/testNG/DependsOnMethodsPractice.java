package testNG;

import static org.testng.Assert.fail;

import org.testng.annotations.Test;

public class DependsOnMethodsPractice {
	@Test(priority = 0)
	public void smoke() {
		fail();
		System.out.println("Smoke Finished");
	}
	
	@Test(priority = 1, dependsOnMethods = "smoke")
	public void functional() {
		System.out.println("Functional Finished");
	}
	
	@Test(priority = 2, dependsOnMethods = {"smoke" , "functional"})
	public void regression() {
		System.out.println("Regression Finished");
	}
}

//////////////////////////////////////////////////30.12.2025//////////////////////////////////////////////////