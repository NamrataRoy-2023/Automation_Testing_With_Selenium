package POM.POM_OrangeHRMS_Login_13_01_2026;

import org.testng.annotations.Test;

public class OrangeHRM_RunnerClass extends OrangeHRM_BaseClass {
	@Test
	public void loginAction() {
		OrangeHRM_LoginPOM login = new OrangeHRM_LoginPOM(driver);
		login.getUserNameTF();
		login.getPasswordTF();
		login.getLoginBtn();
		
		OrangeHRM_DashboardVerification verify = new OrangeHRM_DashboardVerification(driver);
		verify.getpgTitle();
		
		OrangeHRM_LogoutPOM logout = new OrangeHRM_LogoutPOM(driver);
		logout.getDropdown();
		logout.getLogoutBtn();
	}
	
	

}
