package basicScript;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome_Day01 {
	public static void main(String[]args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.close();//close only one tab of browser and in task manager i can see the chromedriver
		driver.quit();//close full browser and in task manager i can not see the chromedriver
		
		driver.get("http://10.231.158.224:5500/dummypage.html");

	}

}
