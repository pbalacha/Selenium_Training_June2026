package com.webelementpractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts_Practice {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		/*
		 * driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		 * driver.manage().window().maximize();
		 * 
		 * driver.findElement(By.xpath("//button[text()='Log In']")).click();
		 * 
		 * //Alert with only accept button
		 * 
		 * Thread.sleep(2000); driver.switchTo().alert().accept();
		 */
		
		//Get Alert text 
		
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("div.tabpane.pullleft>ul>li:last-child>a")).click();
		Thread.sleep(2000);
		
		
		
		driver.findElement(By.cssSelector("div#Textbox>button")).click();
		
		Alert al=driver.switchTo().alert();	
		
		al.sendKeys("Parvathy");
		
		al.accept();
		
		driver.switchTo().defaultContent();
		
		String displayed_text=driver.findElement(By.cssSelector("p#demo1")).getText();
		
		if(displayed_text.contains("Parvathy")) {
			System.out.println("Proper message has been displayed");
		}
	
	}

}
