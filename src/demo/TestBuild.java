package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestBuild {
	
	
	public static WebDriver driver;
	
	@Test
	public void doLogin(){
		
		driver = new FirefoxDriver();
		driver.get("http://gmail.com");
		System.out.println(driver.getTitle());
		
		
	}

}
