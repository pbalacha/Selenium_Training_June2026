package com.webelementpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JSExecutor_Practice {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofMillis(2000) );
		  
		
		
		driver.get("https://www.redbus.com/");
		
		WebElement blog= driver.findElement(By.xpath("//a[contains(text(),'Blog')]"));
		
	     JavascriptExecutor js = (JavascriptExecutor) driver;
		
	     js.executeScript("arguments[0].scrollIntoView(true);", blog);
		
	    // Apply temporary background and border styles
	     js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", blog);
	     Thread.sleep(500); 

	}

}
