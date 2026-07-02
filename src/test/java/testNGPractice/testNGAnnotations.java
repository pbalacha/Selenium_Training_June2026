package testNGPractice;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class testNGAnnotations {

	
	@BeforeMethod
	public void beforeMethd() {
		System.out.println("BeforeMethod");
	}
	@Test
	public void loadUrl() {
		System.out.println("Opening the website");
	}
	
	@AfterMethod
	public void afterMethd() {
		System.out.println("After Method");
	}
	
	@BeforeSuite
	public void beforeSte() {
		System.out.println("Before ste");
		//Assert.assertEquals("abc", "efg");
	}
}


