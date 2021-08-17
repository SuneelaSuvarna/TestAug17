package Day15;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLoginPage {
	
	static
	{
		System.setProperty("webdriver.chrome.driver", "/Users/suneela/EclipeWorkSpace/Automation/SelAutomation/Drivers/chromedriver");
	}
	
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	LoginPage login= new LoginPage(driver);
	login.setUserName("admin");
	login.setPassword("manager");
	login.clickOnLoginBtn();
	Thread.sleep(2000);
	driver.close();
	
}

}
