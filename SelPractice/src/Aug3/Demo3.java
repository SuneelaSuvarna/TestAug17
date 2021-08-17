package Aug3;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.ContextClickAction;


public class Demo3 {
	
	static {
		
		System.setProperty("webdriver.chrome.driver", "/Users/suneela/EclipeWorkSpace/Automation/SelAutomation/Drivers/chromedriver");
		System.setProperty("webdriver.gecko.driver", "/Users/suneela/EclipeWorkSpace/Automation/SelAutomation/Drivers/geckodriver");
	}

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		
	
		
	
		
		driver.get("file:/Users/suneela/EclipeWorkSpace/Automation/SelAutomation/File/sample1_iFrame.html");
		Thread.sleep(1000);
		driver.findElement(By.id("t1")).sendKeys("Sunil");
		
		//driver.switchTo().frame("f1");
		//driver.switchTo().frame("n1");
		driver.switchTo().frame(driver.findElement(By.name("n1")));
		driver.findElement(By.id("t2")).sendKeys("Suvarna");
		driver.switchTo().parentFrame();
		driver.findElement(By.id("t1")).clear();
		
		
		
		
	
		
		
		
	}
	

}
