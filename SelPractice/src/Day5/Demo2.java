package Day5;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {
	
	static {
		
		System.setProperty("webdriver.chrome.driver", "/Users/suneela/EclipeWorkSpace/Automation/SelAutomation/Drivers/chromedriver");
		System.setProperty("webdriver.gecko.driver", "/Users/suneela/EclipeWorkSpace/Automation/SelAutomation/Drivers/geckodriver");
	}

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		
		String path=System.getProperty("user.dir")+"/File/Sample3.html";
		driver.get("file:"+path);

		System.out.println(System.getProperty("user.dir"));

	    System.out.println(driver.findElement(By.xpath("//div[1]/input[1]")).isDisplayed()); 	
		driver.close();
	
	}
	

}
