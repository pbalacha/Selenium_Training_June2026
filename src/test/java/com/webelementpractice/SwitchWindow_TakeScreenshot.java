package com.webelementpractice;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.time.Duration;
import java.util.Date;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SwitchWindow_TakeScreenshot {

	public static void main(String[] args) throws IOException {
		
		
		WebDriver driver=new ChromeDriver();
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofMillis(2000) );
		  
		
		
		driver.get("https://www.redbus.com/");
		
		WebElement blog= driver.findElement(By.xpath("//a[contains(text(),'Blog')]"));
		
		blog.click();
		
		Set<String> windowHandles=driver.getWindowHandles();
		
		System.out.println("Parent window id is :"+driver.getWindowHandle());
		
		for (String windowHandle : windowHandles) {
		    if (!windowHandle.equals(driver.getWindowHandle())) {
		        driver.switchTo().window(windowHandle);
		        break; 
		    }
		}

		System.out.println("Parent window id is :"+driver.getWindowHandle());
		
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		// Now you can do whatever you need to do with it, for example copy somewhere
		Date newDate= new Date();
		String pageTitle= driver.getTitle();

		String fileName=newDate.toString().replace(" ","_").replace(":","_")+".png";
		System.out.println(fileName);

		System.out.println("Filename"+fileName);
		FileUtils.copyFile(scrFile, new File("./screenshots/"+fileName));
		
		//For firefox driver
		
		/*
		 * File src=((FirefoxDriver)driver).getFullPageScreenshotAs(OutputType.FILE);
		 * FileUtils.copyFile(src, new File("./screenshots/"+fileName));
		 */
		
        driver.quit();
		
		
	
	}

	
	
}
