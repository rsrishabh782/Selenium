package Excel;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HighlightFileld {
	
	WebDriver driver;
	
	public static  void color(WebDriver driver, WebElement element)
	{
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border:2px solid green;')", element);
		try{
			Thread.sleep(5000);
		}
		
		catch(Exception e)
		{
			
			System.out.println(e.getMessage());
		}
		
		js.executeScript("arguments[0].setAttribute('style', 'border:2px solid red;')", element);
	}
}
