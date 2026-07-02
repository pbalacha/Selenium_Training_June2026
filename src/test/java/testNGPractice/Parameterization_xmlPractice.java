package testNGPractice;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization_xmlPractice {


	@Parameters({"browserName","url"})
	@Test
	public void openWebsite(String browserName,String url) {
		System.out.println("browsername is "+browserName);
		System.out.println("url is "+url);
	}
}
