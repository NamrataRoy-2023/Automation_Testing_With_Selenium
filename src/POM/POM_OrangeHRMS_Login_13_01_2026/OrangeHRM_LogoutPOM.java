package POM.POM_OrangeHRMS_Login_13_01_2026;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRM_LogoutPOM {
	
	/////DECLERATION
	@FindBy (xpath = "//span[@class='oxd-userdropdown-tab']")
	private WebElement dropdown;
	
	@FindBy (xpath = "//a[text()='Logout']")
	private WebElement logoutBtn;
	
	//////////INITIALIZATION
	public OrangeHRM_LogoutPOM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//////////UTILIZATION

	public void getDropdown() {
		dropdown.click();
	}

	public void getLogoutBtn() {
		logoutBtn.click();
	}
	

}
