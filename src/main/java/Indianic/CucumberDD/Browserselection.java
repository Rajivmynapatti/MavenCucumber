package Indianic.CucumberDD;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browserselection {
	
	
	static WebDriver driver;
	
	public static WebDriver startbrowser(String Url, String Browser) {
		
		if(Browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver2.20\\chromedriver.exe");
			driver=new ChromeDriver();
			
		}
		else if(Browser.equalsIgnoreCase("Firefox")) {
			
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.get(Url);
		
		return driver;
		
	}

}
