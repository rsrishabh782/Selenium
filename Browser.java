package PageObjectModel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {

	static WebDriver driver;

	public static WebDriver Browsebrowser(String browsername, String url)
	{
		if(browsername.equalsIgnoreCase("firefox"))
		{
		System.setProperty("webdriver.gecko.driver","D:\\selenium-java-3.4.0\\lib\\geckodriver.exe");
		driver = new FirefoxDriver();
		}
		
		else if(browsername.equalsIgnoreCase("chrome"))
		{
			 System.setProperty("webdriver.chrome.driver", "C:\\Users\\rshri7\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			 
			  driver = new ChromeDriver();
		}

	
		
		driver.manage().window().maximize();
		driver.get(url);
		
	
				
		return driver;
	}
	
	
	

}
