package testBase;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	public static WebDriver driver;
	
	@BeforeClass()
	public void setUp() {
		
		driver = new ChromeDriver();
		//driver.get(p.getProperty("appurl"));
		driver.get("https://juice-shop.herokuapp.com/#/");
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize(); 
	}
	
	@AfterClass()
	public void tearDown() {
		driver.quit();
	}
	

}
