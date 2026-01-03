package testNG;

import org.testng.annotations.Test;

public class InvocationCountPractice_30_12_2025 {
	@Test(priority = 0, invocationCount = 2)
	public void smoke() {
		System.out.println("Smoke Finished");
	}
	
	@Test(priority = 1, invocationCount = 5)
	public void functional() {
		System.out.println("Functional Finished");
	}
	
	@Test(priority = 2, invocationCount = 0)
	public void regression() {
		System.out.println("Regression Finished");
	}

}
