package pageObjects;
 

import driverFactory.DriverFactory;
import utilities.ConfigReader;
import utilities.Loggerload;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class Diabetic_RC {
	
	
	/*
	@FindBy (xpath="//a[@href='RECIPES']")WebElement recipes_dropdown ;
	//@FindBy (xpath="//a[@id=\"nav\"]/li[1]/ul/li[1]/a")WebElement health_option;
	
	//*[@id="nav"]/li[1]/ul/li[1]/a
	
	
    
    public static WebDriver driver=DriverFactory.getdriver();
    
    String homeurl="https://tarladalal.com";
	 //String homeurl=ConfigReader.getApplicationUrl();
    //driver.get("https://tarladalal.com");
	
	
	
	//constructor
	public Diabetic_RC() {
		PageFactory.initElements(driver, this);
		
	}
	
	@Test(priority=1)
	
       public void homepage() {
		
		System.out.println("Recipe page:" + homeurl);
		Loggerload.info("URL Recipe page:" + homeurl);

		driver.get(homeurl);

	}
	@Test(priority=2)
	public void recipes_dropdown(String str) {
		
		System.out.println(" dropdown:");

		recipes_dropdown.click();

	}
	
	*/
}
