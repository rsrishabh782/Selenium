package Excel;


import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

public class ScrollScript {

	WebDriver driver;
	@Test
	public void testScroll() throws IOException
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rshri7\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("http://www.creativeweblogix.com/");
		driver.manage().window().maximize();


		WebElement element = driver.findElement(By.xpath("/html/body/footer/div/div/div/section[1]/ul/li[1]"));

		//	Point point = element.getLocation();
		//	
		//	int xcord = point.getX();
		//	int ycord = point.getY();
		//	
		//	System.out.println(xcord);
		//	System.out.println(ycord);

		//      JavaScriptExecutor js = (JavaScriptExecutor)driver;
		((JavascriptExecutor)driver).executeScript("scroll(0,4731)");

		//   ((JavaScriptExecutor)driver).executeScript("");

		//    js.executeScript("arguments[0].scrollIntoView(true);", element);


		HighlightFileld.color(driver, element);
		ScreenshotClass.TakesScreenshot(driver, "privacy");

		if(driver.getPageSource().contains("The past decade has seen us expand from a handful "))
		{
		
			System.out.println("Text Present");
		}
		
		else
		{
			System.out.println("Text is not Prersent");
		}
		
		
		driver.getPageSource();
	}
}
