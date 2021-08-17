import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


class Demo4 {

	@DataProvider
	public String[] getData() {
		String data[] = { "Sunil", "Suvarna", "Kota" };
		return data;
	}

	@Test(dataProvider = "getData")
	public void testA(String to) {
		Reporter.log("To: " + to, true);
		Reporter.log("Click: Send", true);
	}

}
