package Day15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	private WebElement unTB;
	private WebElement pwdTB;
	private WebElement loginBtn;
	
	public LoginPage(WebDriver driver)
	{
		unTB=driver.findElement(By.id("username"));
		pwdTB=driver.findElement(By.name("pwd"));
		loginBtn=driver.findElement(By.xpath("//div[text()='Login ']"));
	}
	
	public void setUserName(String userName)
	{
		unTB.sendKeys(userName);
	}

	public void setPassword(String password)
	{
		pwdTB.sendKeys(password);
	}
	
	public void clickOnLoginBtn()
	{
		loginBtn.click();
	}
}
