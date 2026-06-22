package com.webelementpractice;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox_Radiobutton_Practice {

	
	public static void main(String[] args) throws InterruptedException {
		

		WebDriver driver=new ChromeDriver();
		driver.get("http://www.tizag.com/htmlT/htmlcheckboxes.php");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		//WebElement div= driver.findElement(By.xpath("//div[@class='display'][1]"));
		
		
		List<WebElement> checkboxes= driver.findElements(By.xpath("//div[@class='display'][1]/input[@type='checkbox']"));
		
		/*
		 * for(WebElement e:checkboxes) {
		 * 
		 * 
		 * String selected=e.getAttribute("value");
		 * System.out.println("Sports activities are :"+ e.getAttribute("value"));
		 * if(selected.equalsIgnoreCase("soccer")) { e.click(); }
		 * 
		 * 
		 * }
		 */
		
//randomly check 2 checkboxes
		Random random = new Random();
        int firstIndex = random.nextInt(checkboxes.size());
        System.out.println(firstIndex);
        int secondIndex;
        secondIndex = random.nextInt(checkboxes.size());
        
        System.out.println(secondIndex);
        
        for(WebElement e:checkboxes) {
        	
        	String first= checkboxes.get(firstIndex).getAttribute("value");
        	System.out.println("First:"+first);
        	
	        	if(!e.isSelected()) {
	        	e.click();
	        	}
				
        }
       
        
        Thread.sleep(4000);
        driver.quit();
		
	}
}
