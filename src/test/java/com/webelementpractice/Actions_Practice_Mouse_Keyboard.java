package com.webelementpractice;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Actions_Practice_Mouse_Keyboard {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// 1. Create a preferences map
		Map<String, Object> prefs = new HashMap<String, Object>();
		
		ChromeOptions options = new ChromeOptions();
		
		prefs.put("profile.default_content_setting_values.notifications", 2); // 2 = Block
		
        // 2. Disable translate bubble/pop up
        prefs.put("translate_allow_in_model", false);
        prefs.put("translate", "{'enabled': false}");
        
		options.setExperimentalOption("prefs", prefs);

		// 2. Add preferences to ChromeOptions
		
		options.setExperimentalOption("prefs", prefs);
		options.addArguments("--disable-notifications");
		
		//div[@class='JOvNxC']
		
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.carwale.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement newCar= driver.findElement(By.xpath("//div[text()='NEW CARS']"));
		
		
		  WebDriverWait wait=new WebDriverWait(driver,Duration.ofMillis(2000) );
		  
		 wait.until(ExpectedConditions.elementToBeClickable(newCar));
		 
		//driver.findElement(By.xpath("//div[@class='home-top-banner o-C']")).click();
		
		Actions actions = new Actions(driver);
		
		actions.moveToElement(newCar).click().build().perform();
		
		actions.click(newCar);
	
	
		//Thread.sleep(2000);
		
	//driver.quit();
		
		
	}

}
