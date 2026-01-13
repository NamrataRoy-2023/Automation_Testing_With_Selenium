package POM.POM_OrangeHRMS_Login_13_01_2026;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRM_LoginPOM {
	////DECLARATION
	@FindBy(name="username")
	private WebElement userNameTF;
	
	@FindBy(name="password")
	private WebElement PasswordTF;
	
	@FindBy(xpath="//button")
	private WebElement LoginBtn;
	
	/////INITIALIZATION
	public OrangeHRM_LoginPOM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	/////VERIFICATION
	public void getUserNameTF() {
		userNameTF.sendKeys("Admin");
	}

	public void getPasswordTF() {
		PasswordTF.sendKeys("admin123");
	}

	public void getLoginBtn() {
		LoginBtn.click();
	}
}
