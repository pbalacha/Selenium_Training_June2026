package testNGPractice;

import org.testng.annotations.Test;

public class testNGPriority {

	
	@Test(priority = 20)
	public void p20() {
		System.out.println("Priority20");
	}
	
	@Test(priority = 11)
	public void p11() {
		System.out.println("Priority11");
	}
	
	@Test(priority = -1)
	public void p1() {
		System.out.println("Priority-1");
	}
	
	@Test(priority = -20)
	public void p2() {
		System.out.println("Priority-20");
	}
	
}
