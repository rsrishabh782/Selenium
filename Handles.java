package Excel;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.internal.ArgumentConverter;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

public class Handles {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","D:\\selenium-java-3.4.0\\lib\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.naukri.com");

		String currentWindow = driver.getWindowHandle();
		driver.findElement(By.xpath("//a[@title='Employer Login']")).click();

		//Set<String> windows = driver.getWindowHandles();
		
		Set<String> windows = driver.getWindowHandles();


		for (String newWindow : windows)
		{
			driver.switchTo().window(newWindow);
		}
		System.out.println("1: "+driver.getCurrentUrl());
		driver.close();

		driver.switchTo().window(currentWindow);
		System.out.println("2: "+driver.getCurrentUrl());
	//	driver.quit();
		//driver.switchTo().defaultContent();
		
		driver.get("https://www.google.com");
		
	
	}
}
