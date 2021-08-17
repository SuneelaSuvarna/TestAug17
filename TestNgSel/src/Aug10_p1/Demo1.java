package Aug10_p1;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo1 {

	@BeforeClass
	public void beforeClass() {
		Reporter.log("BeforeClass", true);
	}

	@AfterClass
	public void afterClass() {
		Reporter.log("AfterClass", true);
	}

	@BeforeMethod
	public void beforeMethod() {
		Reporter.log("BeforeMethod", true);
	}

	@AfterMethod
	public void afterMethod() {
		Reporter.log("AfterMethod", true);
	}

	@Test
	public void testA() {
		Reporter.log("TestA", true);
	}

	@Test
	public void testB() {
		Reporter.log("TestB", true);
	}

}
