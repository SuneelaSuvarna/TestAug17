import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

class Demo5 {

	@DataProvider
	public String[][] getData() {
		String data[][] = new String[3][3];
		data[0][0] = "Sunil";
		data[0][1] = "Kota";
		data[0][2] = "576221";

		data[1][0] = "Arun";
		data[1][1] = "GMpalya";
		data[1][2] = "560061";

		data[2][0] = "Nandish";
		data[2][1] = "Ittamadu";
		data[2][2] = "560065";
		return data;
	}

	@Test(dataProvider = "getData")
	public void testA(String name, String address, String pinCode) {
		Reporter.log("Name: " + name, true);
		Reporter.log("Address: " + address, true);
		Reporter.log("Pincode: " + pinCode, true);
	}
}
