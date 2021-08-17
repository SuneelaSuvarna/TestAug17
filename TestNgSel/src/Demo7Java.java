
public class Demo7Java {

	public static  void testVarArgConcept(String...s)
	{
		int count =s.length;
		
		System.out.println("---------");
		System.out.println(s.length);
		for(String name:s)
		{
		
			System.out.println(name);
		}
		System.out.println("---------");
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		Demo7Java.testVarArgConcept();
		
		Demo7Java.testVarArgConcept("Sunil");
		Demo7Java.testVarArgConcept("Sunil","Kota");
	}

}
