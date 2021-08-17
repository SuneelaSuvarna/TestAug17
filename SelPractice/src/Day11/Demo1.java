package Day11;

import java.time.Duration;

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
		
		driver.get("file:/Users/suneela/EclipeWorkSpace/Automation/SelAutomation/File/ActionDemo.html");
		
		Actions action = new Actions(driver);
	
		//MouseOver - Move to Element
		driver.findElement(By.id("A1")).click();
		Thread.sleep(1000);
		WebElement aboutUsEle = driver.findElement(By.xpath("(//a[text()='About us '])[2]"));
		action.moveToElement(aboutUsEle).perform();
		driver.findElement(By.xpath("(//a[text()='Values '])[2]")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().back();
		
		//Double Click
		driver.findElement(By.id("A3")).click();
		Thread.sleep(1000);
		WebElement doubleClickEle = driver.findElement(By.xpath("//input[@value='Double Click']"));
		action.doubleClick(doubleClickEle).perform();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
	
		//Drag and Drop
		driver.findElement(By.id("A4")).click();
		Thread.sleep(2000);
		WebElement source = driver.findElement(By.xpath("//h1[text()='Block 1']"));
		WebElement target=driver.findElement(By.xpath("//h1[text()='Block 3']"));
		action.dragAndDrop(source, target).perform();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		
		
		//driver.findElement(By.id("A4")).click();
		//Thread.sleep(2000);	
		//action.clickAndHold(source).pause(Duration.ofSeconds(3)).moveToElement(target).pause(Duration.ofSeconds(3)).release().perform();
		//Thread.sleep(1000);
	//	driver.navigate().back();
	//	Thread.sleep(1000);
		
		//RightClick
		driver.findElement(By.id("A2")).click();
		WebElement rightClickEle = driver.findElement(By.xpath("//span[text()='right click me']"));
		action.contextClick(rightClickEle).perform();
		driver.findElement(By.xpath("//span[text()='Quit']")).click();
		//driver.close();	 
		 
	}
	

}
