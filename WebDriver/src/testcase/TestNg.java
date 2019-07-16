package testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class TestNg {

	private static WebDriver driver = null;
	
	@BeforeClass
	public static void startWebDriver(){
		System.setProperty("webdriver.chrome.driver","C:/Users/silvana.perez/Documents/Downloads/Drivers/chromedriver_win32 (1)/chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("disable-infobars");
		driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
	}	
	@Test
	public void testCase(){
		driver.get("http://www.google.com");
		System.out.println("Title:" + driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "Google");
		System.out.println("url:" + driver.getCurrentUrl());
		try{
			Thread.sleep(3000);
		}catch(Exception e){}
		driver. get("http://www.youtube.com");
		System.out.println("Title:" + driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "Google");
		System.out.println("url:" + driver.getCurrentUrl());
	}
	
	@AfterClass
	public static void stopWebDriver(){
		driver.close(); // this will close the browser in focus
	    driver.quit();  // this will close all the browser and stop the WebDriver
		if(driver!=null)
			driver = null;

	}

}
