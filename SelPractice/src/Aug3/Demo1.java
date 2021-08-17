package Aug3;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.ContextClickAction;


public class Demo1 {
	
	static {
		
		System.setProperty("webdriver.chrome.driver", "/Users/suneela/EclipeWorkSpace/Automation/SelAutomation/Drivers/chromedriver");
		System.setProperty("webdriver.gecko.driver", "/Users/suneela/EclipeWorkSpace/Automation/SelAutomation/Drivers/geckodriver");
	}

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("file:/Users/suneela/EclipeWorkSpace/Automation/SelAutomation/File/PopUpDemo.html");
		
		
		
		driver.findElement(By.id("A5")).click();
		Thread.sleep(1000);
		
		Set<String> allWHS = driver.getWindowHandles();
		for(String whs:allWHS)
		{
			driver.switchTo().window(whs);
			System.out.println(driver.getTitle());
			if(driver.getTitle().equals("Cognizant"))
			{
				driver.close();
				break;
			}
			Thread.sleep(1000);
		
		}
		//driver.quit();
	}
	

}
