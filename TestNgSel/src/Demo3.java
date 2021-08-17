import org.testng.Reporter;
import org.testng.annotations.Test;

//
class Demo3 {

	@Test(invocationCount = 10)
	public void testA() {
		Reporter.log("To: Sunil",true);
		Reporter.log("Click: Send",true);
	}

}
