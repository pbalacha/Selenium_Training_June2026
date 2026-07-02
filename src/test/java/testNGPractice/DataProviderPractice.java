package testNGPractice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderPractice {
	
	@Test(dataProvider="dp")
	public void login(String userName,String pwd) {
		
		
		
	}

	@DataProvider(name="dp")
	public Object[][] getData(){
		
		Object[][] data=new Object[3][2];
		
		return data;
		
	}
	
}
