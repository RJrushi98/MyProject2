package dataProvider_Study;

import org.testng.annotations.DataProvider;

public class NewTest2 {
 
	@DataProvider(name = "FB Regression")
	
  public static String[][] f() 
  {
	  String data[][]= {{"Rishikesh","Jawale","9067032885"},{"Aboli","Tambat","1234567890"}};
	  return data;
  }
	@DataProvider(name="FB Sanity")
	public static String[][]f2()
	{
		String data[][]= {{"abc","def","1234567890"},{"pqr","stu","0987654321"}};
		return data;
		
	}
}

