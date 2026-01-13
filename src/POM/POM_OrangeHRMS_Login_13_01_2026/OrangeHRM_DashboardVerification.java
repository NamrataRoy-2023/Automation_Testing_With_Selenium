package POM.POM_OrangeHRMS_Login_13_01_2026;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class OrangeHRM_DashboardVerification {
	/////DECLERATION
	@FindBy(xpath = "//h6")
	private WebElement pgTitle;
	
	/////INITIALIZATION
	public OrangeHRM_DashboardVerification(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//////UTILIZATION
	public void getpgTitle() {
		Assert.assertEquals(pgTitle.getText(), "Dashboard");
	}

}
