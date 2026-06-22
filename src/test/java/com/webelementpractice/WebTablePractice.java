package com.webelementpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablePractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//the logic for Webtable is to find out the table body and iterate from main div to the td. then in a for loop, 
		
		//using inner loop, find out  the element[i][j] which retrieves the exact table data.
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://money.rediff.com/sectors");
		
		Thread.sleep(500);
		

		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='dataTable']/tbody/tr"));
		
	

		System.out.println("Rows" + rows.size());

		 List <WebElement> cols=driver.findElements(By.xpath("//table[@id='dataTable']/tbody/tr[1]/td"));
		  
		
		  System.out.println("Columns"+ cols.size());
		  
			
			  for(int i=1;i<rows.size();i++) {
			  
			  for(int j=1;j<cols.size();j++) {
				  
				  
			  
			  System.out.println(driver.findElement(By.xpath( "//table[@id='dataTable']/tbody/tr["+i+"]/td["+j+"]")).getText());
			  
			/*  WebElement ele=driver.findElement(By.xpath("//table[@id='dataTable']/tbody/tr["+i+1+"]")); }
			  */
			  
			  }
			 
		 

		

	}
	
			  driver.quit();
}
}