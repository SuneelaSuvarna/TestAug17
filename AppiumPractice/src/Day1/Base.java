package Day1;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {

		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel_3");
		cap.setCapability(MobileCapabilityType.APP, "/Users/suneela/EclipeWorkSpace/Automation/AppiumPractice/APP/ApiDemos-debug.apk");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.UDID, "emulator-5554");
		
		//cap.setCapability("appPackage", "");
		//cap.setCapability("appActivity", "");
		URL url = new URL("http://0.0.0.0:4723/wd/hub");
		AppiumDriver driver = new AppiumDriver(url, cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(1000);
		//driver.findElement(By.name("Preference")).click();

	}

}
