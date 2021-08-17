import java.util.ArrayList;
import java.util.Iterator;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

class Demo6 {

	@DataProvider
	public Iterator<String[]> getData() {
		
		ArrayList<String[]>data=new ArrayList<String[]>();
		String[] s1= {"Sunil"};
		data.add(s1);
		
		String []s2= {"Arun","GMPalya"};
		data.add(s2);
		
		String []s3= {"Nandish","Ittamadu","560065"};
		data.add(s3);
		
		Iterator<String[]>info=data.iterator();
		
		
		return info;
	}

	@Test(dataProvider = "getData")
	public void testA(String ... s) {
		
		Reporter.log("----",true);
		for(String v:s)
		{
			Reporter.log(v,true);
		}
		Reporter.log("****",true);
	
	}
}
