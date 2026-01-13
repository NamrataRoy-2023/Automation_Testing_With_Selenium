package POM.POM_FB_Login_13_01_2026;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOM {
	///////DECLERATION
	@FindBy(id = "email")
	private WebElement emailTF;
	
	@FindBy(id ="pass")
	private WebElement passTF;
	
	@FindBy(name="login")
	private WebElement lpginBtn;
	
	///////INITIALIZATION
	public LoginPOM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	///////UTILIZATION
	public void getEmailTF() {
		emailTF.sendKeys("Admin");
	}

	public void getPassTF() {
		passTF.sendKeys("Admin@123");;
	}

	public void getLpginBtn() {
		lpginBtn.click();
	}
}
