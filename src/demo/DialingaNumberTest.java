package demo;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;


public class DialingaNumberTest {

	public static AppiumDriver driver;
	
	@Test
	public void dialNumber() throws IOException, InterruptedException{
		AppiumserverTest.stopAppiumServer();
		AppiumserverTest.startAppiumServer();
		
		 DesiredCapabilities capabilities = new DesiredCapabilities();
	        capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
	        capabilities.setCapability("device", "Android");
	        capabilities.setCapability("deviceName", "Galaxy Note3");
	        capabilities.setCapability("platformVersion", "5.0");
	        capabilities.setCapability("platformName","Android");
	
	        capabilities.setCapability("appPackage",
					"com.android.contacts");
			capabilities.setCapability("appActivity",
					"com.android.dialer.DialtactsActivity");
		
	       driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	       driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	       
	       
	       			//com.android.contacts:id/tab_custom_layout
	       
	       
	   		driver.findElements(By.id("com.android.contacts:id/tab_custom_layout")).get(0).click();
			
			//9711111558
			driver.findElement(By.id("com.android.contacts:id/nine")).click();
			driver.findElement(By.id("com.android.contacts:id/seven")).click();
			driver.findElement(By.id("com.android.contacts:id/one")).click();
			driver.findElement(By.id("com.android.contacts:id/one")).click();
			driver.findElement(By.id("com.android.contacts:id/one")).click();
			driver.findElement(By.id("com.android.contacts:id/one")).click();
			driver.findElement(By.id("com.android.contacts:id/one")).click();
			driver.findElement(By.id("com.android.contacts:id/five")).click();
			driver.findElement(By.id("com.android.contacts:id/five")).click();
			driver.findElement(By.id("com.android.contacts:id/eight")).click();
			
			driver.findElement(By.id("com.android.contacts:id/dialButton")).click();
			 
			Thread.sleep(10000);
			
			driver.quit();
			
			AppiumserverTest.stopAppiumServer();
			
		/*	driver.findElement(By.id("com.android.phone:id/endCallButton")).click();
			
*/

		
		
	}

}
