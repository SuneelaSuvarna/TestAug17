package Aug10_p3;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo1 {

	@BeforeMethod
	public void login() {
		Reporter.log("Login", true);
	}

	@AfterMethod
	public void logout() {
		Reporter.log("Logout", true);
	}

	@Test
	public void testA() {
		Reporter.log("Create User", true);
		Assert.assertEquals("abc", "xyz");
		Reporter.log("Delete User", true);
	}

}
