package Project.Amazon;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Runner {
 
	@Test
	public static void launch_Browser() {
		
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("start maximazied");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://www.amazon.in");
		
		System.out.println("Browser Launched");
		
	
		
		
	}
	
	
	
}
