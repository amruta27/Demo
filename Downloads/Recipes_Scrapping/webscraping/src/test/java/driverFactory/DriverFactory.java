

package driverFactory;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.DataProvider;

import io.github.bonigarcia.wdm.WebDriverManager;


public class DriverFactory{
	
	
	public static WebDriver initializeDrivers() {
		
		
	//public static String url = "https://tarladalal.com/";
    WebDriver driver;
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://tarladalal.com/");

	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	
	return driver;
	
	}
	
}
/*
	public static WebDriver initializeDrivers(String browser) {
		
		 if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get(url);
		}
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		return driver;
	
	}
    
	public static WebDriver getdriver() {
		// TODO Auto-generated method stub
		return driver;
	}

	public static String url() {
		// TODO Auto-generated method stub
		return url;
	}
	
	*/
	

