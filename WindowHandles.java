package Excel;

import java.awt.Desktop.Action;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;



public class WindowHandles {
	
	public static void main(String args[])
	{
		System.setProperty("webdriver.gecko.driver","D:\\selenium-java-3.4.0\\lib\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://www.optimusinfo.com/multiple-windows-selenium-webdriver/");
		driver.manage().window().maximize();
		
		String parent = driver.getWindowHandle();
		Actions act = new Actions(driver);
		WebElement we1 = driver.findElement(By.xpath(".//*[@id='header_meta']/div/ul/li[1]"));
		//driver.findElement(By.xpath("//li[@class='social_bookmarks_facebook av-social-link-facebook social_icon_1']")).click();;
        act.moveToElement(we1);
		act.moveToElement(we1).build().perform();
		//act.moveToElement(we1).click();
		driver.findElement(By.xpath("//li[@class='social_bookmarks_facebook av-social-link-facebook social_icon_1']")).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		act.contextClick().perform();
		
		
		
		Set<String> newwindow = driver.getWindowHandles();
		
	//	Iterator<String> I1= newwindow.iterator();
		
	//	while(I1.hasNext())
//		{
//			
//			String newwindow1 = I1.next();
//			if(!parent.equals(newwindow1))
//			{
//				driver.switchTo().window(newwindow1);
//			}
//			System.out.println(driver.getCurrentUrl());
//			driver.close();
//			
//			driver.switchTo().window(parent);
//			System.out.println(driver.getCurrentUrl());
//			driver.quit();
//		}
		
		for(String windows:newwindow)
		{
			driver.switchTo().window(windows);
		}
		
		System.out.println(driver.getCurrentUrl());
		driver.close();
		
//		driver.switchTo().window(parent);
//		System.out.println(driver.getCurrentUrl());
//		driver.quit();
	
		
	}


}


