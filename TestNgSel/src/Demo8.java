import java.util.ArrayList;
import java.util.Iterator;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

class Demo8 {

	@DataProvider
	public Object[][] getData() {

		Object[][] data = new Object[2][2];

		data[0][0] = "Sunil";
		data[0][1] = 576221;

		data[1][0] = "Suvarna";
		data[1][1] = 560061;

		return data;
	}

	@Test(dataProvider = "getData")
	public void testA(String name, int pinCode) {
		Reporter.log("Name: " + name, true);
		Reporter.log("Pincode: " + pinCode, true);
	}
}
