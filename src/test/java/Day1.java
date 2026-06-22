import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class Day1 {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		
		String browser="Chrome";
		
		if(browser.equalsIgnoreCase("Chrome")) {
			driver.get("https://google.com");
		}
	}

}
