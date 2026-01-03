package testNG;

import static org.testng.Assert.fail;

import org.testng.annotations.Test;

public class EnabledPractice_31_12_2025 {
	@Test(priority = 0, enabled = false)
	public void smoke() {
		fail();
		System.out.println("Smoke Finished");
	}
	
	@Test(priority = 1, enabled = false)
	public void functional() {
		System.out.println("Functional Finished");
	}
	
	@Test(priority = 2)
	public void regression() {
		System.out.println("Regression Finished");
	}
}
