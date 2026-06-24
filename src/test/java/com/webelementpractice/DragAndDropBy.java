package com.webelementpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragAndDropBy {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.globalsqa.com/demoSite/practice/slider/range.html");
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofMillis(2000) );
		WebElement sliderIcon= driver.findElement(By.xpath("//div[@id='slider-range']/span[1]"));
		
		//wait.until(ExpectedConditions.elementToBeClickable(sliderIcon));
	
		Actions moveSlider = new Actions(driver);
		moveSlider.moveToElement(sliderIcon)
		          .clickAndHold(sliderIcon)
		          .pause(Duration.ofMillis(300)) // Gives browser time to register hold
		          .moveByOffset(50, 0)           // Moves 50 pixels to the right
		          .pause(Duration.ofMillis(300)) // Gives browser time to process position
		          .release()
		          .build()
		          .perform();

		
		driver.quit();
		
	}

}
