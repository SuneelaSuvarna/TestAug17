import org.testng.Reporter;
import org.testng.annotations.Test;

//
class Demo2 {
	
	final int i=2;
	@Test(priority = i)
	public void testA()
	{
		Reporter.log("testA");
	}
	

	@Test (priority = 1)
	public void testB()
	{
		Reporter.log("testB",false);
	}
	

	@Test(priority = -3)
	public void testC()
	{
		Reporter.log("testC",true);
	}

}
