package com.webelementpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit_ExplicitWait {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.tizag.com/htmlT/htmlcheckboxes.php");
		
		driver.manage().window().maximize();
		
		
	}

}
