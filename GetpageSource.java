package Excel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GetpageSource {

	WebDriver driver;
	@Test
	public void source()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rshri7\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("http://www.creativeweblogix.com/");
		driver.manage().window().maximize();
		
	//	System.out.println(driver.getPageSource());
		driver.getPageSource();
	}
}
