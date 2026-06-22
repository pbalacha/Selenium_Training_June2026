package com.webelementpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownPractice {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.wikipedia.org/");
		

		driver.manage().window().maximize();
		
		
		WebElement ele= driver.findElement(By.id("searchLanguage"));
		
		ele.click();
		Select dropdown=new Select(ele);
		
		
		dropdown.selectByValue("es");
		
		ele.findElement(By.xpath("//i[text()='Search']")).click();
		
		driver.navigate().back();
		
		Thread.sleep(500);
		//JavascriptExecutor js = (JavascriptExecutor) driver;

		// Automatically reads the full height of the body and scrolls to the bottom
		//js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		
		WebElement navPane=driver.findElement(By.cssSelector("nav[aria-label='Other projects']"));
		
		Thread.sleep(2000);
		
		navPane.findElement(By.xpath("//span[text()='Wikibooks']")).click();
		
		driver.quit();
		
		
}
}

