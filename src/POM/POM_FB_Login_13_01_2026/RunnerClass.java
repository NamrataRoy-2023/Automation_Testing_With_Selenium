package POM.POM_FB_Login_13_01_2026;

import org.testng.annotations.Test;

public class RunnerClass extends BaseClass{
	@Test
	public void login() {
		LoginPOM pom = new LoginPOM(driver);
		driver.get("https://www.facebook.com");
		
		pom.getEmailTF();
		pom.getPassTF();
		pom.getLpginBtn();
	}

}
