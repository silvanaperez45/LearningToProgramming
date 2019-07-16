package testcase;

import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:/Users/silvana.perez/Documents/Downloads/Drivers/chromedriver_win32 (1)/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		//FirefoxDriver driver = new FirefoxDriver();
	}

}
