package Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
	
	static {
		
		System.setProperty("webdriver.chrome.driver", "/Users/suneela/EclipeWorkSpace/Automation/SelAutomation/Drivers/chromedriver");
		System.setProperty("webdriver.gecko.driver", "/Users/suneela/EclipeWorkSpace/Automation/SelAutomation/Drivers/geckodriver");
	}

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		
		//CSS SELECTOR
		driver.findElement(By.cssSelector("input#username")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
		driver.findElement(By.cssSelector("#loginButton")).click();
		Thread.sleep(9000);
		driver.findElement(By.cssSelector("#logoutLink")).click();
		Thread.sleep(2000);
		
		//XPATH
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		Thread.sleep(9000);
		driver.findElement(By.xpath("//a[@id='logoutLink']")).click();
		Thread.sleep(2000);
		driver.close();
	}
	

}
