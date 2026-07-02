package testNGPractice;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization_xmlPractice2 {

	

	@Parameters({"browserName","url"})
	@Test
	public void closeWebsite(String browserName,String url) {
		System.out.println("browsername is "+browserName);
		System.out.println("url is "+url);
	}
}
