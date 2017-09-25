package Excel;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotClass {

	
	public static void TakesScreenshot(WebDriver driver, String image) throws IOException
	{
		try
		{TakesScreenshot ts = (TakesScreenshot)driver;
		
		File src =  ts.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(src, new File("./Screenshot/"+ image +".png"));
		
		//driver.close();
		}
		
		catch(Exception e)
		{
			System.out.println("Exception while get the message");
		}
	}
	
}
