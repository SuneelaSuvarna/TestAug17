package Aug3;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.ContextClickAction;


public class Demo2 {
	
	static {
		
		System.setProperty("webdriver.chrome.driver", "/Users/suneela/EclipeWorkSpace/Automation/SelAutomation/Drivers/chromedriver");
		System.setProperty("webdriver.gecko.driver", "/Users/suneela/EclipeWorkSpace/Automation/SelAutomation/Drivers/geckodriver");
	}

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		
	
		
		driver.findElement(By.xpath("//a[text()='actiTIME Inc.']")).click();
		Thread.sleep(1000);
		
		Set<String> allWHS = driver.getWindowHandles();
		
		for(String whs:allWHS)
		{
			driver.switchTo().window(whs);
			System.out.println(driver.getTitle());
			driver.switchTo().defaultContent();
			driver.close();
		
		}
		
	}
	

}
