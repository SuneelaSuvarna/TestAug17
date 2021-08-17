package day3;

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
		
		driver.get("https://www.google.com");
		String currentURL=driver.getCurrentUrl();
		System.out.println(currentURL);
		
		String title=driver.getTitle();
		System.out.println(title);
		
		driver.navigate().to("https://www.fb.com");
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().forward();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().refresh();
		Thread.sleep(1000);
		

		driver.manage().window().fullscreen();
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		Dimension actualSize = driver.manage().window().getSize();
		System.out.println(actualSize);
		
		Dimension setSize= new Dimension(300,400);
		driver.manage().window().setSize(setSize);
		Thread.sleep(1000);
		
		Point currentPosition = driver.manage().window().getPosition();
		System.out.println(currentPosition);
		
		int x=200;
		int y=400;
				
		for (int i=1;i<5;i++)
		{
			Point setPosition=new Point(x, y);
			driver.manage().window().setPosition(setPosition);
			x=x+50;
			Thread.sleep(1000);
		}
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		

		
		WebElement activeElement = driver.switchTo().activeElement();
		activeElement.sendKeys("Suneela Suvarna");
		Thread.sleep(1000);
		
		driver.close();
		
	
		
	}
	

}
