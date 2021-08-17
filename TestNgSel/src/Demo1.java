import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo1 {
	
	@Test
	public void testDemo1()
	{
		Reporter.log("Hi1");//prints on emailable report
		Reporter.log("Bye1" ,false);//prints on emailable report
		Reporter.log("Tata1",true); //prints on console and emailable report
	}



	@Test
	public void testDemo2()
	{
		Reporter.log("Hi2");//prints on emailable report
		Reporter.log("Bye2" ,false);//prints on emailable report
		Reporter.log("Tata2",true); //prints on console and emailable report
	}
	
	@Test
	public void testDemo3()
	{
		Reporter.log("Hi3");//prints on emailable report
		Reporter.log("Bye3" ,false);//prints on emailable report
		Reporter.log("Tata3",true); //prints on console and emailable report
	}
	

	

}
