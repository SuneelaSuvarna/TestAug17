package Aug10_p3;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Demo3 {

	@Test
	public void registerUser() {

		Reporter.log("Register User", true);
		Assert.fail();

	}

	@Test(dependsOnMethods = "registerUser")
	public void deleteUser() {

		Reporter.log("Delete User", true);

	}

}
