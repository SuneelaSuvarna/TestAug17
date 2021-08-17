import java.util.ArrayList;
import java.util.Iterator;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

class Demo7 {

	@DataProvider
	public Iterator<String[]> getData() {
		
		ArrayList<String[]>data=new ArrayList<String[]>();
		String[] s1= {"Sunil","Kota","576221"};
		data.add(s1);
		
		String []s2= {"Arun","GMPalya","560061"};
		data.add(s2);
		
		String []s3= {"Nandish","Ittamadu","560065"};
		data.add(s3);
		
		Iterator<String[]>info=data.iterator();
		
		
		return info;
	}

	@Test(dataProvider = "getData")
	public void testA(String name, String address, String pinCode) {
		Reporter.log("Name: " + name, true);
		Reporter.log("Address: " + address, true);
		Reporter.log("Pincode: " + pinCode, true);
	}
}
