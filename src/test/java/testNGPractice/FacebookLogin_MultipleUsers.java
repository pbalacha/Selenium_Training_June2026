package testNGPractice;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utility.ExcelReader;

public class FacebookLogin_MultipleUsers {
	
	
	
	WebDriver driver;
	WebDriverWait wait;
	Properties config_Properties=new Properties();
	Properties or_properties=new Properties();
	FileInputStream fis_config;
	FileInputStream fis_or;
	
	@BeforeMethod
	public void launchBrowser() throws IOException {
		fis_config= new FileInputStream("./src/test/resources/properties/config.properties");
		fis_or= new FileInputStream("./src/test/resources/properties/or.properties");

		
		//read from config properties
				config_Properties.load(fis_config);
				if(config_Properties.getProperty("browser").equalsIgnoreCase("chrome")) {
					driver=new ChromeDriver();
				}
		driver.manage().window().maximize();		
		driver.get(config_Properties.getProperty("testSiteUrl"));
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Integer.parseInt(config_Properties.getProperty("implicit.wait"))));
		//wait =new WebDriverWait(driver, Duration.ofSeconds(Integer.parseInt(config_Properties.getProperty("explicit.wait"))));
	
		//read from or properties file
		
		or_properties.load(fis_or);
	
	}
	@Test(dataProvider = "dp")
	public void doLogin(String username,String password) throws IOException {
		
		System.out.println("Inside login");
		
		System.out.println("Username"+username);
		System.out.println("password"+password);
		
		driver.findElement(By.name(or_properties.getProperty("email_NAME"))).sendKeys(username);
		driver.findElement(By.name(or_properties.getProperty("pwd_NAME"))).sendKeys(password);
		driver.findElement(By.cssSelector(or_properties.getProperty("login_CSS"))).click();
	}

	@AfterMethod
	public void closeBrowser() {
		
		driver.quit();
	}
	
	@DataProvider(name="dp")
	public Object[][] readDataFromExcel() {
		
		ExcelReader excel = new ExcelReader("./src/test/resources/excelData/FBData.xlsx");
		String sheetName="data";
		int noOfRows=excel.getRowCount(sheetName);
		int noOfCols=excel.getColumnCount(sheetName);
		System.out.println("RowCount: " + noOfRows);//4
		System.out.println("Col Count: " + noOfCols);//2
		Object[][] data = new Object[noOfRows-1][noOfCols];
		
		for(int row=2;row<=noOfRows;row++) {//row=3
			for(int col=0;col<noOfCols;col++) {//col=0
				data[row-2][col]=excel.getCellData(sheetName,col,row);
			}
		}
		
		return data;
	}

}
