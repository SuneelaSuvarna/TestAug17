package Day8;

import java.awt.Rectangle;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class Demo1 {
	
	static {
		
		System.setProperty("webdriver.chrome.driver", "/Users/suneela/EclipeWorkSpace/Automation/SelAutomation/Drivers/chromedriver");
		System.setProperty("webdriver.gecko.driver", "/Users/suneela/EclipeWorkSpace/Automation/SelAutomation/Drivers/geckodriver");
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		
	WebElement loginEle=	driver.findElement(By.xpath("//div[text()='Login ']"));
		
		loginEle.click();
		
		System.out.println(loginEle.getLocation().getX());
		System.out.println(loginEle.getLocation().getY());
		System.out.println(loginEle.getSize().getHeight());
		System.out.println(loginEle.getSize().getWidth());
		org.openqa.selenium.Rectangle rect1 = loginEle.getRect();

		System.out.println(rect1.getX());
		System.out.println(rect1.getY());

		System.out.println(rect1.getHeight());
		System.out.println(rect1.getWidth());
	
		Thread.sleep(2000);
		
	 WebElement errorEle = driver.findElement(By.xpath("//span[contains(text(),'invalid')]"));
	 
	 	File errorFile = errorEle.getScreenshotAs(OutputType.FILE);
	 	
	 	FileUtils.copyFile(errorFile, new File("/Users/suneela/EclipeWorkSpace/Automation/SelPractice/Screenshot/error.png"));
	 	
	 	String colorValue = errorEle.getCssValue("color");
	 	
	 	
	 	String colorHexa = Color.fromString(colorValue).asHex();
	 	System.out.println(colorValue);
	 	System.out.println(colorHexa);
		driver.close();
	}
	

}
